package entities;

public class Employee {
    public String Name;
    public double GrossSalary;
    public double Tax;

    public Employee(String Name, double GrossSalary, double Tax){
        this.Name = Name;
        this.GrossSalary = GrossSalary;
        this.Tax = Tax;
    }

    public double setSalary(){
        return this.GrossSalary - this.Tax;

    };

    public void increaseSalary(double inc){
        this.GrossSalary *= (1+(inc/100.00));
    }

    public String toString(){
        return "Update data: " + this.Name + ", $ " + this.setSalary();
    }
}
