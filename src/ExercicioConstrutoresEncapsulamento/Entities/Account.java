package ExercicioConstrutoresEncapsulamento.Entities;

public class Account {

    private int accountNumber;
    private String accountName;
    private double accountBalance;
    public static final double TAX = 5;

    public Account(){

    }

    public Account(int accountNumber, String accountName, double accountBalance) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.accountBalance = accountBalance;
    }

    public Account(int accountNumber, String accountName) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void increaseDeposit(double depositAmount) {
        this.accountBalance += depositAmount;
    }

    public void withdraw(double withdrawAmount) {
        this.accountBalance -= withdrawAmount + TAX;
    }

    public String toString() {
        return "Account data: " +
                "Account " + getAccountNumber() + ", "
                + "Holder: " + getAccountName() + ", "
                + "Balance: $ " + getAccountBalance() ;
    }

}

//  CORREÇÃO PROFESSOR NELIO
//package entities;
//
//public class Account {
//
//    private int number;
//    private String holder;
//    private double balance;
//
//    public Account(int number, String holder) {
//        this.number = number;
//        this.holder = holder;
//    }
//
//    public Account(int number, String holder, double initialDeposit) {
//        this.number = number;
//        this.holder = holder;
//        deposit(initialDeposit);          //ENCAPSULAMENTO DEPOSIT DESSA FORMA PROTEGE O CODIGO DE FUTURAS ALTERAÇÕES
//    }
//
//    public int getNumber() {
//        return number;
//    }
//
//    public String getHolder() {
//        return holder;
//    }
//
//    public void setHolder(String holder) {
//        this.holder = holder;
//    }
//
//    public double getBalance() {
//        return balance;
//    }
//
//    public void deposit(double amount) {
//        balance += amount;
//    }
//
//    public void withdraw(double amount) {
//        balance -= amount + 5.0;     // ELE COLOCOU A TAXA DIRETO NO METODO
//    }
//
//    public String toString() {
//        return "Account "
//                + number
//                + ", Holder: "
//                + holder
//                + ", Balance: $ "
//                + String.format("%.2f", balance);
//    }
//}
