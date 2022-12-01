package entities;

public class CurrencyConverter {


    public static double converte(double valueDollar, double amount){

        double tot = valueDollar * amount;
        return tot + (tot * 6 / 100);

    }


}
