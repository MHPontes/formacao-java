package OrientacaoObjects.DollarConverter;

import OrientacaoObjects.AlunoEX3.Entities.AlunoMedia;

import java.util.Scanner;

import static OrientacaoObjects.DollarConverter.CurrencyConverter.quantityDollar;

public class MainConverter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("What is the dollar price?");
        CurrencyConverter.dollarValue = sc.nextDouble();

        System.out.println("How many dollars will be bought?");
        quantityDollar = sc.nextDouble();

        double qd = CurrencyConverter.converter(quantityDollar);

        System.out.println(qd);


        sc.close();
}

}
