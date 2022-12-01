package Exercicios;
import java.util.*;

public class NumerosNegativos {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar ?: ");
        int n = sc.nextInt();
        int[] vect = new int[n];
        for(int i = 0; i < vect.length; i++){
            System.out.print("Digite um número: ");
            int number = sc.nextInt();
            vect[i] = number;
        }

        System.out.println("NÚMEROS NEGATIVOS");

        for(int num: vect){
            if (num < 0) System.out.println(num);
        }

        sc.close();

    }

}
