package ExerciciosVetores.abaixo_da_media;

import java.util.Locale;
import java.util.Scanner;

public class abaixo_da_media {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.print("Quantos numeros voce vai digitar? ");
        n = sc.nextInt();

        double [] vect = new double [n];

        for (int i = 0; i < n; i++){
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextDouble();
        }

        double soma = 0;
        double media = 0;
        for (int i = 0; i < n; i++){
            soma += vect[i];
            media = soma / n;
        }

        System.out.println("MEDIA DO VETOR: "+ media);


        System.out.println("Elementos Abaixo da Media: ");
        for (int i = 0; i < n; i++){
          if (vect [i] < media){
              System.out.println(vect[i]);
          }
        }


        sc.close();
    }
}
