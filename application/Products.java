package application;
import entities.Product;
import java.util.*;

public class Products {

    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);


        System.out.println("Enter a product data: ");
        System.out.println("Name: ");
        String nome = scan.next();
        System.out.println("Price: ");
        double price = scan.nextDouble();
        System.out.println("Quantity: ");
        int quantity = scan.nextInt();

        Product product = new Product(nome, price, quantity);

        System.out.println();
        System.out.println("Product data: " + product);

        System.out.println();
        System.out.println("Enter the number of products to be added in stock: ");
        quantity = scan.nextInt();
        product.addProducts(quantity);

        System.out.println();
        System.out.println("Updated data: " + product);

        System.out.println();
        System.out.println("Enter the number of products to be removed from stock: ");
        quantity = scan.nextInt();
        product.removeProducts(quantity);

        System.out.println();
        System.out.println("Updated data " + product);

        scan.close();



    }

}
