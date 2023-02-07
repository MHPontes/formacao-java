package ExerciciosVetores.aprovados.main;

import ExerciciosVetores.aprovados.entities.Aluno;

import java.util.Locale;
import java.util.Scanner;

public class mainAprovados {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas alunos serao digitados? ");
        int n = sc.nextInt();
        double mediaNotas = 0;
        double somaNotas = 0;


        Aluno[] alunos = new Aluno[n];

        for(int i = 0; i < alunos.length; i++){
            System.out.println("Digite nome, primeira e segunda nota do 1o aluno:");     //Printf para mostrar a posição no vetor da pessoa + 1
            sc.nextLine();
            System.out.print("Nome: ");
            String name = sc.nextLine();
            System.out.print("Nota 1: ");
            double nota1  = sc.nextDouble();
            System.out.print("Nota 2: ");
            double nota2 = sc.nextDouble();
            alunos[i] = new Aluno(name, nota1, nota2);
        }

        System.out.println("Alunos aprovados: ");
        for (int i = 0; i < alunos.length; i++){
            somaNotas = alunos[i].getNota1() + alunos[i].getNota2();
            mediaNotas = somaNotas / 2;
            if (mediaNotas >= 6 ){
                System.out.println(alunos[i].getName());
            }
        }

        sc.close();
        }
}

