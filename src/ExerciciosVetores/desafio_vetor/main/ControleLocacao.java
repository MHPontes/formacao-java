package ExerciciosVetores.desafio_vetor.main;

import ExerciciosVetores.desafio_vetor.entities.Locacao;

import java.util.Locale;
import java.util.Scanner;

public class ControleLocacao {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Locacao [] vect = new Locacao[10];

        System.out.println("How many rooms will be rented?");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println();
            System.out.println("Rent #" + i + ":");            //Mostrando numero da Locacao
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Room: ");
            int room = sc.nextInt();

            vect[room] = new Locacao(name, email);         //Alocando dentro do Vetor

        }

        System.out.println();
        System.out.println("Busy rooms:");
        for (int i=0; i<10; i++) {
            if (vect[i] != null) {
                System.out.println(i + ": " + vect[i]);
            }
        }

        sc.close();


    }

}
