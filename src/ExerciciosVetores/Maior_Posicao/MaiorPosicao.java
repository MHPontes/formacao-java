package ExerciciosVetores.Maior_Posicao;

import java.util.Locale;
import java.util.Scanner;

public class MaiorPosicao {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n;

        System.out.print("Quantos numeros voce vai digitar? ");
        n = sc.nextInt();

        int [] vect = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextInt();
        }

        double maxValor = 0;
        int posicion = 0;
        for (int i = 0; i < n; i++) {
            if (vect[i] > maxValor){
                maxValor = vect[i];
                posicion = i;
            }
        }

        System.out.printf("MAIOR VALOR = %.1f\n", maxValor);
        System.out.printf("POSICAO DO MAIOR VALOR = %d\n", posicion);

        sc.close();

    }
}
