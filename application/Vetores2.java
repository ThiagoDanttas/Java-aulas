import java.util.*;
public class Vetores2 {

    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Vetor2[] vet = new Vetor2[n];
        for(int i = 0; i < vet.length; i++){
            System.out.println("Insira o nome: ");
            String nome = sc.next();
            System.out.println("Insira o preço: ");
            double preco = sc.nextDouble();
            vet[i] = new Vetor2(nome, preco);
        }

        double sum = 0;
        for( Vetor2 vet2 : vet ){
            sum += vet2.getPrice();
        }

        double avg = sum / vet.length;

        System.out.println(Arrays.toString(vet));
        System.out.println(avg);

        sc.close();
    }

}
