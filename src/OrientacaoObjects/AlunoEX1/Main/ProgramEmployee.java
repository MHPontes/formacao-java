package OrientacaoObjects.AlunoEX1.Main;

import OrientacaoObjects.AlunoEX1.Entities.Employee;

import java.util.Scanner;

public class ProgramEmployee {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Employee employee1 = new Employee();

        System.out.print("Name : ");
        employee1.name = sc.nextLine();
        System.out.print("Gross Salary: ");
        employee1.grossSalary = sc.nextDouble();
        System.out.print("Tax: ");
        employee1.tax = sc.nextDouble();
        employee1.netSalary();

        System.out.println(employee1);

        System.out.print("Which percentage to increase salary? ");
        double percentage = sc.nextDouble();
        employee1.increaseSalary(percentage);

        System.out.println(employee1);

        sc.close();
    }

}
