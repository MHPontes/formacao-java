package ExerciciosVetores.Alturas.main;

import ExerciciosVetores.Alturas.entities.Pessoa;

import java.util.Locale;
import java.util.Scanner;

public class MainAlturas {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double sum = 0.0;
        double avg = 0.0;

        System.out.print("Quantas pessoas serao digitadas? ");
        int n = sc.nextInt();
        Pessoa[] vetor = new Pessoa[n];

        for (int i = 0; i < vetor.length; i++){
            System.out.printf("Dados da %da pessoa:\n", i + 1);     //Printf para mostrar a posição no vetor da pessoa + 1
            sc.nextLine();
            System.out.print("Nome: ");
            String name = sc.nextLine();
            System.out.print("Idade: ");
            int age = sc.nextInt();
            System.out.print("Altura: ");
            double height = sc.nextDouble();
            vetor[i] = new Pessoa(name, age, height);
        }

        for (int i = 0; i < vetor.length; i++){
            sum += vetor[i].getHeight();
        }

         avg = sum / vetor.length;

        System.out.printf("Altura Media = %.2f\n", avg);

        int nmenores = 0;
        double percentualMenores = 0;
        for (int i=0; i< vetor.length; i++) {                            //Pegando a quantidade de pessoas que são menores que 16 e armazenando na variavel nmenores
            if (vetor[i].getAge() < 16) {
                nmenores++;
            }
        }

        percentualMenores = ((double)nmenores / n) * 100.0;            //Convertendo a quantidade de pessoas menores que 16 e mostrando em porcentagem %

        System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", percentualMenores);

        for (int i = 0; i < vetor.length; i++){
            if(vetor[i].getAge() < 16) {
                System.out.println(vetor[i].getName());
            }
        }

    }
}
