package ExerciciosVetores.dados_pessoas.main;

import ExerciciosVetores.dados_pessoas.entities.Pessoa;

import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;

public class dados_pessoas {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n;
        double menorAltura = 0;
        double maiorAltura = 0;
        double qtdMulher = 0;
        double mediaAlturaF = 0;
        double alturaFtotal = 0;

        System.out.print("Quantas pessoas serao digitadas? ");
        n = sc.nextInt();

        Pessoa[] pessoa = new Pessoa[n];

        for(int i = 0; i < pessoa.length; i++){
            System.out.printf("Altura da %d pessoa:", i + 1);
            double altura = sc.nextDouble();
            System.out.printf("Genero da %d pessoa:", i + 1);
            String sexo = sc.next();
            pessoa[i] = new Pessoa(altura, sexo);
        }

        menorAltura = pessoa[0].getAltura();             //Definindo que menorAltura inicie na primeira posição do vetor, desta forma conseguindo validar a menor altura.
        maiorAltura = pessoa[0].getAltura();

        System.out.print("Menor altura = ");
        for(int i = 0; i < pessoa.length; i++){
            if (pessoa[i].getAltura() < menorAltura){
                menorAltura = pessoa[i].getAltura();
                System.out.println(menorAltura);
            }
        }

        System.out.print("Maior altura = ");
        for(int i = 0; i < pessoa.length; i++){
            if (pessoa[i].getAltura() > maiorAltura){
                maiorAltura = pessoa[i].getAltura();
                System.out.println(maiorAltura);
            }
        }

        System.out.print("Media das alturas das mulheres = ");
        for(int i = 0; i < pessoa.length; i++){
            if (Objects.equals(pessoa[i].getSexo(), "F")){
                qtdMulher ++;
                alturaFtotal = alturaFtotal + pessoa[i].getAltura();
            }
        }

        mediaAlturaF = alturaFtotal / qtdMulher;


        sc.close();

    }
}

// CORREÇÃO :
//
//import java.util.Locale;
//        import java.util.Scanner;
//
//public class dados_pessoas {
//
//    public static void main(String[] args) {
//
//        Locale.setDefault(Locale.US);
//        Scanner sc = new Scanner(System.in);
//
//        int n, qtdhomens, qtdmulheres;
//        double menoraltura, maioraltura, alturafemMedia, alturafemtotal;
//
//        System.out.print("Quantas pessoas serao digitadas? ");
//        n = sc.nextInt();
//
//        double[] alturas = new double[n];
//        char[] generos = new char[n];
//
//        for (int i=0; i<n; i++) {
//            System.out.printf("Altura da %da pessoa: ", i + 1);
//            alturas[i] = sc.nextDouble();
//            System.out.printf("Genero da %da pessoa: ", i + 1);
//            generos[i] = sc.next().charAt(0);
//        }
//
//        menoraltura = alturas[0];
//        maioraltura = alturas[0];
//
//        for (int i=1; i<n; i++) {
//            if (alturas[i] > maioraltura) {
//                maioraltura = alturas[i];
//            }
//            if (alturas[i] < menoraltura) {
//                menoraltura = alturas[i];
//            }
//        }
//
//        qtdhomens = 0;
//        qtdmulheres = 0;
//        alturafemtotal = 0;
//        for (int i=0; i<n; i++) {
//            if (generos[i]=='M') {
//                qtdhomens++;
//            }
//            else {
//                qtdmulheres++;
//                alturafemtotal = alturafemtotal + alturas[i];
//            }
//        }
//
//        alturafemMedia = alturafemtotal / qtdmulheres;
//
//        System.out.printf("Menor altura = %.2f\n", menoraltura);
//        System.out.printf("Maior altura = %.2f\n", maioraltura);
//        System.out.printf("Media das alturas das mulheres = %.2f\n", alturafemMedia);
//        System.out.printf("Numero de homens = %d\n", qtdhomens);
//
//        sc.close();
//    }
//}
