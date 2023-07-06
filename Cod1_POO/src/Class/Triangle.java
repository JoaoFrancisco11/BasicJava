package Class;

import java.util.Locale;
import java.util.Scanner;

public class Triangle {
    public double sideA;
    public double sideB;
    public double sideC;

    public double area(){
        double area;
        double p = (sideA+sideB+sideC)/2.0;
        return area = Math.sqrt(p*(p-sideA)*(p-sideB)*(p-sideC));
    }

    public void data(){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the measures of triangle: ");
        this.sideA = sc.nextDouble();
        this.sideB = sc.nextDouble();
        this.sideC = sc.nextDouble();

    }

}
