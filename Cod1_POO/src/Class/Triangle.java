package Class;

import java.util.Scanner;

public class Triangle {
    public double sideA;
    public double sideB;
    public double sideC;

    public double area(){
        double p = (sideA+sideB+sideC)/2.0;
        double area = Math.sqrt(p*(p-sideA)*(p-sideB)*(p-sideC));
        return area;
    }

}
