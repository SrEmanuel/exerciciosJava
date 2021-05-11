package application;

import utils.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("What is the dollar price? ");
        double price = sc.nextDouble();

        System.out.println("How many dollars will be bought? ");
        double qnt = sc.nextDouble();

        System.out.printf("Amount to be paind in reais: %.2f", CurrencyConverter.amountPaid(price, qnt));
        
        sc.close();
    }
}
