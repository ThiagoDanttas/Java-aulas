import java.util.*;

public class AbaixoDaMedia {

    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor ?: ");
        int n = sc.nextInt();
        double[] vect = new double[n];
        double sum = 0d;
        for(int i = 0; i < vect.length; i++){
            System.out.print("Digite um número: ");
            double number = sc.nextDouble();
            vect[i] = number;
            sum += number;
        }

        double avg = sum / vect.length;
        System.out.printf("MEDIA DO VETOR = %.3f\n", avg);

        System.out.println("ELEMENTOS ABAIXO DA MEDIA:");
        for(double num: vect) if(num < avg) System.out.println(num);

        sc.close();
    }

}
