package ExerciciosVetores.Soma_Vetores;

import java.util.Locale;
import java.util.Scanner;

public class soma_vetores {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.print("Quantos numeros voce vai digitar? ");
        n = sc.nextInt();

        int [] a = new int[n];
        int [] b = new int[n];
        int [] soma = new int[n];

        System.out.println("Digite os valores do vetor A: ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Digite os valores do vetor B: ");
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }

        System.out.println("VETOR RESULTANTE: ");
        for (int i = 0; i< n; i++){
            soma[i] += a[i] + b[i];
            System.out.println(soma[i]);                      //vetor somando os vetores A e B e mostrando os resultados
        }
        
        sc.close();
    }
}
