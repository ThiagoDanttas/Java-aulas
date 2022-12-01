package Exercicios;

import java.util.*;

public class MaiorPosicao {

    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar ?: ");
        int n = sc.nextInt();
        double[] vect = new double[n];

        for(int i = 0; i < vect.length; i++){
            System.out.print("Digite um número: ");
            vect[i] = sc.nextDouble();
        }

        double maxValue = 0d;
        int index = 0;
        for(double num: vect){
            if(num > maxValue) {
                maxValue = num;
                index++;
            }
        }

        System.out.printf("MAIOR VALOR = %.1f\n", maxValue);
        System.out.println("POSICAO DO MAIOR VALOR = " + index );



        sc.close();

    }

}
