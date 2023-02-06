package ExercicioConstrutoresEncapsulamento.Main;

import ExercicioConstrutoresEncapsulamento.Entities.Account;

import java.util.Scanner;

public class AccountProgram {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

//        Account account1 = new Account(55832,"Mateus");
//        Account account2 = new Account(78920,"Tassya", 200);
          Account account3 = new Account();

        System.out.print("Enter account number: ");
        account3.setAccountNumber(sc.nextInt());
        System.out.print("Enter account holder: ");
        account3.setAccountName(sc.next());
        System.out.print("Enter initial deposit value: ");
        account3.increaseDeposit(sc.nextDouble());
//        System.out.print("Is there an initial deposit (y/n) ");
//        sc.nextLine() = option;

        System.out.println(account3);

        System.out.print("Enter a withdraw value: ");
        account3.withdraw(sc.nextDouble());

        System.out.println(account3);



//        if (sc.nextLine() == ("y")) {
//        System.out.print("Enter initial deposit value:");
//        account3.increaseDeposit(sc.nextDouble());
//        } else {
//        System.out.println ("Account data:" );

        sc.close();
    }

}

// CORREÇÃO PROFESSOR NELIO

//public class Program {
//
//    public static void main(String[] args) {
//
//        Locale.setDefault(Locale.US);
//        Scanner sc = new Scanner(System.in);
//        Account account;
//
//        System.out.print("Enter account number: ");
//        int number = sc.nextInt();
//        System.out.print("Enter account holder: ");
//        sc.nextLine();
//        String holder = sc.nextLine();
//        System.out.print("Is there an initial deposit (y/n)? ");
//        char response = sc.next().charAt(0);
//        if (response == 'y') {
//            System.out.print("Enter initial deposit value: ");                    //SOBRECARGA E RESOLVENDO O
//                                                                                     // COMPARATIVO Y OU N
//            double initialDeposit = sc.nextDouble();
//            account = new Account(number, holder, initialDeposit);
//        }
//        else {
//            account = new Account(number, holder);
//        }
//
//        System.out.println();
//        System.out.println("Account data:");
//        System.out.println(account);
//
//        System.out.println();
//        System.out.print("Enter a deposit value: ");
//        double depositValue = sc.nextDouble();
//        account.deposit(depositValue);
//        System.out.println("Updated account data:");
//        System.out.println(account);
//
//        System.out.println();
//        System.out.print("Enter a withdraw value: ");
//        double withdrawValue = sc.nextDouble();
//        account.withdraw(withdrawValue);
//        System.out.println("Updated account data:");
//        System.out.println(account);
//
//        sc.close();
//    }
//}
