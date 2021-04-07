package utils;

public class CurrencyConverter {
    static double IOF = 0.06;
    public static double amountPaid(double price, double qnt) {
        double total = price * qnt;
        return total + (total * IOF);
    }
}
