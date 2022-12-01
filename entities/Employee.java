package entities;

public class Employee {

    // atributes
    public String name;
    public double grossSalary;
    public double tax;

    // Methods
    public String getName(){
        return this.name;
    }

    public double netSalary(){
        return this.grossSalary - this.tax;
    }

    public void increaseSalary(double percentage){

        this.grossSalary = (this.grossSalary * percentage) / 100 + netSalary();
    }


}
