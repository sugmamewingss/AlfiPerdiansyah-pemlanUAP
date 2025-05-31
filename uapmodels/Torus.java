package uapmodels;

import uapbases.Shape;
import uapinterfaces.*;

public class Torus extends Shape
        implements ThreeDimensional, PiRequired, MassCalculable, MassConverter, ShippingCostCalculator {
    private double majorRadius;
    private double minorRadius;

    public Torus() {
        this.majorRadius = 0;
        this.minorRadius = 0;
        setName("Donat dengan lubang");
    }

    public Torus(double majorRadius, double minorRadius) {
        this.majorRadius = majorRadius;
        this.minorRadius = minorRadius;
        setName("Donat dengan lubang");
    }

    @Override
    public double getVolume() {
        return (PI * minorRadius * minorRadius) * (2 * PI * majorRadius);
    }

    @Override
    public double getSurfaceArea() {
        return (2 * PI * minorRadius) * (2 * PI * majorRadius);
    }

    @Override
    public double getMass() {
        return getSurfaceArea() * THICKNESS * DENSITY;
    }

    @Override
    public void printInfo() {
        System.out.println("Volume          : " + getVolume());
        System.out.println("Luas permukaan  : " + getSurfaceArea());
        System.out.println("Massa           : " + getMass());
        System.out.println("Massa dalam kg  : " + gramToKilogram());
        System.out.println("Biaya kirim     : Rp" + (int) calculateCost());
    }

    @Override
    public double gramToKilogram() {
        double kg = getMass() / DENOMINATOR;
        return Math.ceil(kg * 100) / 100;
    }

    @Override
    public double calculateCost() {
        double kg = gramToKilogram();
        return Math.ceil(kg) * PRICE_PER_KG;
    }
}