package OrientacaoObjects.AlunoEX1.Entities;

public class Employee {

    public String name;
    public double grossSalary;
    public double tax;


    public double netSalary() {
        return grossSalary -= tax;
    }

   public void increaseSalary(double percentage){
       this.grossSalary += grossSalary * percentage / 100.0;
   }

   public String toString() {
       return "Employee: " + name + ", " + "$ " + grossSalary;
    }

}
