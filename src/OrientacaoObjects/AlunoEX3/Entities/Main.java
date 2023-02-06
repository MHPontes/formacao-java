package OrientacaoObjects.AlunoEX3.Entities;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        AlunoMedia aluno = new AlunoMedia();

        System.out.print("Digite o nome do aluno: ");
        aluno.nomeAluno = sc.nextLine();
        System.out.print("Digite a nota1 do aluno: ");
        aluno.nota1 = sc.nextDouble();
        System.out.print("Digite a nota1 do aluno: ");
        aluno.nota2 = sc.nextDouble();
        System.out.print("Digite a nota1 do aluno: ");
        aluno.nota3 = sc.nextDouble();

        System.out.println(aluno.finalGrade());

        if (aluno.finalGrade() < 60.0) {
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f POINTS%n", aluno.missingPoints());
        }
        else {
            System.out.println("PASS");
        }

    }
}