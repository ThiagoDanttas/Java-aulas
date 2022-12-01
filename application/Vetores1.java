package application;
import java.util.*;
public class Vetores1 {

    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double sum = 0.0;
        int n = sc.nextInt();
        double[] vect = new double[n];

        for(int i = 0; i < n; i++){
            vect[i] = sc.nextDouble();
        }

        for(double vec: vect){
            sum += vec;
        }

        double avg = sum /  n;

        System.out.printf("AVERAGE HIGHT %.2f", avg);

        sc.close();


    }

}
