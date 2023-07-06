package application;

import entities.Retangulo;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter rectangle base: ");
        double base = sc.nextDouble();

        System.out.println("Enter rectangle height: ");
        double altura = sc.nextDouble();

        Retangulo ret = new Retangulo();
        ret.areaRet(base, altura);
        ret.perimetroRet(base, altura);
        ret.diagonalRet(base, altura);

        System.out.print(ret.toString());
    }
}