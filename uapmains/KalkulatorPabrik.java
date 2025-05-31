package uapmains;

import java.util.Scanner;
import uapmodels.Sphere;
import uapmodels.Torus;

public class KalkulatorPabrik {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Siapa nama kamu?");
        String namaLengkap = input.nextLine();
        System.out.println("Kalau NIM kamu?");
        String nim = input.nextLine();

        System.out.println("=============================================");
        System.out.println("Kalkulator Pabrik Cetakan Donat Rumahan");
        System.out.println("NAMA LENGKAP: " + namaLengkap);
        System.out.println("NIM: " + nim);
        System.out.println("=============================================");
        System.out.println("Donat dengan lubang");
        System.out.println("=============================================");
        System.out.print("Isikan Radius   : ");
        double Radius1 = input.nextDouble();
        System.out.print("Isikan radius   : ");
        double Radius2 = input.nextDouble();
        System.out.println("=============================================");

        Torus torus = new Torus(Radius1, Radius2);
        torus.printInfo();

        System.out.println("=============================================");
        System.out.println("Donat tanpa lubang");
        System.out.println("=============================================");
        System.out.print("Isikan radius   : ");
        double radius = input.nextDouble();
        System.out.println("=============================================");

        Sphere sphere = new Sphere(radius);
        sphere.printInfo();

        System.out.println("=============================================");

    }
}