package Exercicios;
import java.util.*;

public class NumerosNegativos {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos n�meros voc� vai digitar ?: ");
        int n = sc.nextInt();
        int[] vect = new int[n];
        for(int i = 0; i < vect.length; i++){
            System.out.print("Digite um n�mero: ");
            int number = sc.nextInt();
            vect[i] = number;
        }

        System.out.println("N�MEROS NEGATIVOS");

        for(int num: vect){
            if (num < 0) System.out.println(num);
        }

        sc.close();

    }

}
