package application;
import java.util.*;
import entities.CurrencyConverter;
public class CurrencyConvert {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("wht is the dollar price ?");
        double dollarPrice = sc.nextDouble();

        System.out.println("How many dollars will be bought ?");
        double amountDolls = sc.nextDouble();

        double valueConverted = CurrencyConverter.converte(dollarPrice, amountDolls);

        System.out.printf("amout to be paid in reais = %.2f", valueConverted );
        sc.close();
    }


}
