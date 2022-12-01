package entities;

public class EmployeeList {

    private int id;
    private String name;
    private double salary;

    // Constructor
    public EmployeeList(int id, String name, double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Getters & Setters
    public int getId(){return this.id;}

    public String getName(){
        return this.name;
    }

    public double getSalary(){
        return this.salary;
    }

    public void increaseSalary(double percent){
        this.salary += this.salary * percent /  100;
    }

    @Override
    public String toString() {
        return id + ", " + name + ", " + String.format("%.2f", salary);
    }
}
