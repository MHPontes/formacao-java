package OrientacaoObjects.DollarConverter;

import java.util.Currency;

public class CurrencyConverter {

    public static final double IOF = 0.06;
    public static double dollarValue = 0;
    public static double quantityDollar = 0;

    public static double converter(double quantityDollar){
        return dollarValue * quantityDollar * (1.0 + IOF);
    }

//    public class CurrencyConverter {
//        public static double IOF = 0.06;
//        public static double dollarToReal(double amount, double dollarPrice) {
//            return amount * dollarPrice * (1.0 + IOF);
//        }
//    }
//
//    Correção do NELIO



}
