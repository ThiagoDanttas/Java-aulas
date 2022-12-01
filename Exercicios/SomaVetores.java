import java.util.*;

public class SomaVetores {

    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos valores vai ter cada vetor: ");
        int n = sc.nextInt();
        int[] vectA = new int[n];
        int[] vectB = new int[n];
        int[] sum = new int[n];


        System.out.println("Digite os valores do vetor A: ");
        for(int i = 0; i < vectA.length; i++ ) {
            int number = sc.nextInt();
            vectA[i] = number;
            sum[i] = number;
        }

        System.out.println("Digite os valores do vetor B: ");
        for(int i = 0; i < vectA.length; i++ ) {
            int number = sc.nextInt();
            vectB[i] = number;
            sum[i] += number;
        }

        System.out.println("VETOR RESULTANTE");
        for(int num: sum){
            System.out.println(num);
        }

        sc.close();

    }

}
