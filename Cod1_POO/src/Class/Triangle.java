package Class;

import java.util.Scanner;

public class Triangle {
    public double sideA;
    public double sideB;
    public double sideC;

    public void Measures(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the measures of triangle x: ");
        sideA = sc.nextDouble();
        sideB = sc.nextDouble();
        sideC = sc.nextDouble();
    }

}
