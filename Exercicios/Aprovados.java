import java.util.*;
public class Aprovados {

    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos alunos serão digitados ?: ");
        int n = sc.nextInt();
        Alunos[] vect = new Alunos[n];

        for(int i = 0; i < vect.length; i++){
            System.out.printf("Digite nome, primeira e segunda nota do %do aluno:\n", i + 1);
            String nome = sc.next();
            double nota1 = sc.nextDouble();
            double nota2 = sc.nextDouble();

            vect[i] = new Alunos(nome, nota1, nota2);
        }

        System.out.println("ALUNOS APROVADOS:");
        for(Alunos aluno: vect){
            if(aluno.media() >= 6.0){
                System.out.println(aluno.getNome());
            }
        }

        sc.close();
    }
}
