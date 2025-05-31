package uapmodels;

import uapbases.Shape;
import uapinterfaces.*;

public class Sphere extends Shape
        implements ThreeDimensional, PiRequired, MassCalculable, MassConverter, ShippingCostCalculator {
    private double radius;

    public Sphere() {
        this.radius = 0;
        setName("Donat tanpa lubang");
    }

    public Sphere(double radius) {
        this.radius = radius;
        setName("Donat tanpa lubang");
    }

    @Override
    public double getVolume() {
        return (4.0 / 3) * PI * radius * radius * radius;
    }

    @Override
    public double getSurfaceArea() {
        return 4 * PI * radius * radius;
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