import java.util.*;

public class Employees {

    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        Employee employee = new Employee();

        System.out.println("Enter a name, salary and tax");
        employee.name = scan.next();
        employee.grossSalary = scan.nextDouble();
        employee.tax = scan.nextDouble();

        System.out.println();
        System.out.printf("Employee: %s, $ %.2f\n", employee.getName(), employee.netSalary());

        System.out.println("Wich percentage to increase salary ? ");
        double percentage = scan.nextDouble();
        employee.increaseSalary(percentage);

        System.out.println();
        System.out.printf("Updated data: %s, $ %.2f", employee.getName(), employee.grossSalary);

        scan.close();

    }

}
