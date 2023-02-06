package ExerciciosVetores.Negativos;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();

        int[] vect = new int[n];    //Declarando vetor de inteiro.

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextInt();
        }

        System.out.println("NUMEROS NEGATIVOS:");

        for (int i = 0; i < n; i++) {
            if (vect[i] < 0) {
                System.out.printf("%d\n", vect[i]);                      //Percorrendo novamente o Vetor para pegar os numeros negativos.
            }
        }
    }

    }

