package ExerciciosVetores.media_pares;

import java.util.Locale;
import java.util.Scanner;


public class media_pares {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n, somapares = 0, npares = 0;
        double mediapares;

        System.out.print("Quantos elementos vai ter o vetor? ");
        n = sc.nextInt();

        int[] vetor = new int[n];

        for (int i=0; i<n; i++) {
            System.out.print("Digite um numero: ");
            vetor[i] = sc.nextInt();
        }

        for (int i=0; i<n; i++) {
            if (vetor[i] % 2 == 0) {
                somapares = somapares + vetor[i];             // Validando se numeros sao Pares e armazenando a quantidade na variavel somapares.
                npares++;
            }
        }

        if (npares == 0) {
            System.out.println("NENHUM NUMERO PAR");                //Caso não exista numeros pares, mostra mensagem.
        }
        else {
            mediapares = (double)somapares / npares;                  //Metodo para pegar a media dos numeros pares

            System.out.printf("MEDIA DOS PARES = %.1f\n", mediapares);
        }

        sc.close();
    }
}


