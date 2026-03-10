package application;
import entities.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("What is the dollar price? ");
        double priceDollar = input.nextDouble();
        System.out.print("How many dollars will be bought? ");
        double buyingDollar = input.nextDouble();


        System.out.printf("Amount to be paid in reais = %.2f", CurrencyConverter.dollarToReal(priceDollar, buyingDollar));

        input.close();
    }
}
