package Exercicios;

import java.util.*;

public class NumerosPares {

    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar ?: ");
        int n = sc.nextInt();
        int[] vect = new int[n];
        int somaNumerosPares = 0;

        for(int i = 0; i < vect.length; i++){
            System.out.print("Digite um número: ");
            vect[i] = sc.nextInt();
        }

        System.out.println("NUMEROS PARES:");
        for(int num: vect){
            if(num % 2 == 0) {
                somaNumerosPares++;
                System.out.printf("%d  ", num);
            }
        }

        System.out.println("\nQUANTIDADE DE PARES = " + somaNumerosPares);



        sc.close();


    }




}
