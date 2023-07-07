package application;

import entities.Employee;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.print("Name: ");
        String Name = sc.nextLine();

        System.out.println("Gross salary: ");
        double grossSalary = sc.nextDouble();

        System.out.println("Tax: ");
        double Tax = sc.nextDouble();

        Employee emp = new Employee(Name, grossSalary, Tax);
        System.out.println(emp);

        System.out.println("Which percentage to increase salary? ");
        double increase = sc.nextDouble();
        emp.increaseSalary(increase);

        System.out.println(emp);
        sc.close();
        }
    }