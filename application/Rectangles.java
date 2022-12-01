package application;
import entities.Rectangle;
import java.util.*;

public class Rectangles {

    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);


        Rectangle values = new Rectangle();

        System.out.println("Enter rectangle width and height: ");

        values.width = scan.nextDouble();
        values.height = scan.nextDouble();

        System.out.println(values);

        scan.close();


    }

}
