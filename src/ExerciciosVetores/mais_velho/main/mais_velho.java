package ExerciciosVetores.mais_velho.main;

import java.util.Locale;
import java.util.Scanner;

public class mais_velho {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serao digitadas? ");
        int n = sc.nextInt();

        String[] names = new String[n];
        int[] ages = new int[n];


        for (int i = 0; i < n; i++){
            System.out.printf("Dados da %da pessoa:\n", i + 1);     //Printf para mostrar a posição no vetor da pessoa + 1
            sc.nextLine();
            System.out.print("Nome: ");
            names[i] = sc.nextLine();
            System.out.print("Idade: ");
            ages[i] = sc.nextInt();
        }

        int validarMaisVelho = 0;
        String nomeMaisVelho = names[0];
        for (int i = 0; i < n; i++){
            if (ages[i] > validarMaisVelho){            //Validando a pessoa mais velha e armazenando em variavel
                validarMaisVelho = ages[i];
                nomeMaisVelho = names[i];             //Armazenando nome da pessoa mais velha.
            }
        }

        System.out.print("PESSOA MAIS VELHA: " + nomeMaisVelho);

        sc.close();
    }
}
