package application;

import java.util.Locale;
import java.util.Scanner;
import Class.Triangle;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Triangle x,y;
        y = new Triangle();
        x = new Triangle();

        y.data();
        x.data();
        System.out.printf("Triangle X area = %.4f%n", x.area());
        System.out.printf("Triangle Y area = %.4f%n", y.area());


    }
}