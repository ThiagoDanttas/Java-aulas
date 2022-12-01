package application;
import java.util.*;
import entities.Student;

public class Students {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Student student = new Student();


        System.out.println("Enter a name");
        student.name = sc.next();

        System.out.println();
        System.out.println("Enter notes");
        student.notaA = sc.nextDouble();
        student.notaB = sc.nextDouble();
        student.notaC = sc.nextDouble();

        System.out.println();
        System.out.println(student);


        sc.close();

    }

}
