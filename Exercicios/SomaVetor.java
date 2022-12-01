import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class SomaVetor {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar ?: ");
        int n = sc.nextInt();
        double[] vect = new double[n];
        double sum = 0d;

        for(int i = 0; i < vect.length; i++){
            System.out.print("Digite um número: ");
            double number = sc.nextDouble();
            vect[i] = number;
            sum += number;

        }

        System.out.print("VALORES = " );
        for(double num: vect){
            System.out.printf("%.1f ", num);
        }

        double avg = sum / vect.length;


        System.out.printf("\nSOMA = %.2f\n", sum);
        System.out.printf("MEDIA = %.2f", avg);



        sc.close();

    }
}