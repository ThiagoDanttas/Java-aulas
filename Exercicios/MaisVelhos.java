import java.util.*;

public class MaisVelhos {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas você vai digitar ?: ");
        int n = sc.nextInt();
        int idadeMaior = 0;
        MaisVelho[] vect = new MaisVelho[n];

        for (int i = 0; i < vect.length; i++) {
            System.out.printf("Dados da %da pessoa:\n", i + 1);
            System.out.print("Nome: ");
            String nome = sc.next();
            System.out.print("Idade: ");
            int idade = sc.nextInt();

            vect[i] = new MaisVelho(nome, idade);
        }

        for (MaisVelho num : vect) {
            if (num.getIdade() > idadeMaior) idadeMaior = num.getIdade();
        }

        for (MaisVelho num : vect){
            if (num.getIdade() == idadeMaior) System.out.printf("PESSOA MAIS VELHA: %s", num.getNome());
        }

        sc.close();
    }
}
