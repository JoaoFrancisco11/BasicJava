package entities;

public class Retangulo {
    public double area;
    public double perimetro;
    public double diagonal;

    public double areaRet(double base, double altura){
        this.area = base*altura;
        return this.area;
    }

    public double perimetroRet(double base, double altura){
        this.perimetro = 2*(base+altura);
        return this.perimetro;
    }

    public double diagonalRet(double base, double altura){
        this.diagonal = Math.sqrt(
                Math.pow(base, 2) + Math.pow(altura,2)
        );

        return this.diagonal;
    }

    public String toString(){
        return "Area = " + this.area +"\r\n"
                + "Perimetro = " + this.perimetro + "\r\n"
                + "Diagonal = " + this.diagonal;
    }

}
