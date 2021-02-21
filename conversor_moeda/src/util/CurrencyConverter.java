package util;

public class CurrencyConverter {
    public static double convertCent(double howDollars, double qtyDollars) {
        double valueConverted = howDollars * qtyDollars;
        return valueConverted + ((valueConverted * 6) / 100.0);
    }
}
