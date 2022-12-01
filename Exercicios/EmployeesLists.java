package Exercicios;

import entities.EmployeeList;

import java.util.*;
public class EmployeesLists {

    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many employees will be registered ?: ");
        int n = sc.nextInt();
        List<EmployeeList> list = new ArrayList<>();

        for(int i = 0; i < n; i++){
            System.out.printf("Employee #%d\n", i + 1);
            System.out.print("Id: ");
            int id = sc.nextInt();

            System.out.print("Name: ");
            String name = sc.next();

            System.out.print("Salary: ");
            double salary = sc.nextDouble();

            list.add(i, new EmployeeList(id, name, salary));
        }

        System.out.print("Enter the employee id that will have salary increase: ");
        int id = sc.nextInt();

        EmployeeList emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);

        if(emp == null){
            System.out.println("This is does not exist!");
        } else {
            System.out.print("Enter the percentage: ");
            double percent = sc.nextDouble();
            emp.increaseSalary(percent);
        }

        for(EmployeeList emplo: list){
            System.out.println(emplo);
        }

        sc.close();
    }
}
