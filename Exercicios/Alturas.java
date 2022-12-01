import java.util.*;

public class Alturas {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serão digitadas ?: ");
        int n = sc.nextInt();
        Altura[] vect = new Altura[n];
        double sumHeight = 0d;
        int sumAge = 0;

        for(int i = 0; i < vect.length; i++){
            System.out.printf("Dados da %da pessoa:\n", i + 1);
            System.out.print("Nome: ");
            String nome = sc.next();

            System.out.print("Idade: ");
            int idade = sc.nextInt();

            System.out.print("Altura: ");
            double altura = sc.nextDouble();

            vect[i] = new Altura(nome, idade, altura);

            sumHeight += vect[i].getAltura();
            if(vect[i].getIdade() < 16) sumAge ++;

        }

        double avgAge = sumHeight / vect.length;

        double percentual = (double) (sumAge * 100) / vect.length;

        System.out.printf("Altura média: %.2f\n", avgAge);
        System.out.print("Pessoas com menos de 16 anos: " + String.format("%.1f", percentual) + "%\n");

        for(Altura age: vect){
            if(age.getIdade() < 16) System.out.println(age.getNome());
        }

        sc.close();

    }
}