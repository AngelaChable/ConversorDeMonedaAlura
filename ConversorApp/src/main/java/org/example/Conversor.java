package org.example;

public class Conversor {
    public double convertir(double cantidad, String fromCurrency, String toCurrency) throws Exception {
        double tasaDeCambio = ExchangeRateAPI.getExchangeRate(fromCurrency, toCurrency);
        return cantidad * tasaDeCambio;
    }
}
