package Seção8_9;

public class CurrencyConverter {
    public static double iof = 0.06;

    public static double dollarToReal(double dollarPrice, double amount) {
        return dollarPrice * amount * (1.0 + iof);
    }
}
