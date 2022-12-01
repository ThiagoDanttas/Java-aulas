package Exercicios;

import java.util.*;

public class MediaPares {

    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor ?: ");
        int n = sc.nextInt();
        int[] vect = new int[n];
        int somaPares = 0;
        int quantidadePares = 0;

        for(int i = 0; i < vect.length; i++){
            System.out.print("Digite um número: ");
            int number = sc.nextInt();
            vect[i] = number;
        }

        for(int num: vect){
            if(num % 2 == 0) {
                somaPares += num;
                quantidadePares++;
            }
        }

        double avg = (double) somaPares / quantidadePares;

        if(avg > 0){
            System.out.printf("MEDIA DOS PARES %.1f", avg);
        } else {
            System.out.println("NENHUM NÚMERO PAR!");
        }


        sc.close();

    }

}
