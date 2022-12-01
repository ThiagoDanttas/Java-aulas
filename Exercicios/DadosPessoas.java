import java.util.*;

public class DadosPessoas {

    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);



        System.out.print("Quantas pessoas serão digitadas ?: ");
        int n = sc.nextInt();
        double[] altura = new double[n];
        char[] genero = new char[n];
        double somaAltura = 0d;
        int quantidadesMulheres = 0;
        int quantidadesHomens = 0;

        for(int i = 0; i < n; i++){
            System.out.printf("Altura da %da pessoa: ", i + 1);
            altura[i] = sc.nextDouble();
            System.out.printf("Gênero da %da pessoa: ", i + 1);
            genero[i] = sc.next().toUpperCase().charAt(0);
        }

        double menorAltura = altura[0];
        double maiorAltura = altura[0];


        for(int i = 0; i < n; i++){

            // Verifica a altura
            if(altura[i] < menorAltura) menorAltura = altura[i];
            if(altura[i] > maiorAltura) maiorAltura = altura[i];

            // verificia o genero feminino
            if(genero[i] == 'F') {
                quantidadesMulheres++;
                somaAltura += altura[i];
            } else {
                quantidadesHomens++;
            }

        }
        double mediaAltura = somaAltura / quantidadesMulheres;

        System.out.println("MENOR ALTURA = " + menorAltura);
        System.out.println("MAIOR ALTURA = " + maiorAltura);
        System.out.println("MEDIA DAS ALTURAS DAS MULHERES = " + String.format("%.2f", mediaAltura));
        System.out.println("NÚMERO DE HOMENS = " + quantidadesHomens);


        sc.close();

    }

}
