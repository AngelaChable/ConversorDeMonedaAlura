package org.example;
import java.util.Scanner;

public class ConversorApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Conversor conversor = new Conversor();

        System.out.println("Bienvenido al Conversor de Moneda");

        while (true) {
            System.out.println("Seleccione una opción:");
            System.out.println("1) Convertir de Dólar a Peso Argentino");
            System.out.println("2) Convertir de Peso Argentino a Dólar");
            System.out.println("3) Convertir de Dólar a Real Brasileño");
            System.out.println("4) Convertir de Real Brasileño a Dólar");
            System.out.println("5) Convertir de Dólar a Peso Colombiano");
            System.out.println("6) Convertir de Peso Colombiano a Dólar");
            System.out.println("7) Convertir de Peso Mexicano a Dólar");
            System.out.println("8) Convertir de Dólar a Peso Mexicano");
            System.out.println("9) Salir");

            int opcion = scanner.nextInt();
            if (opcion == 9) {
                System.out.println("Gracias por usar el conversor de moneda.");
                break;
            }

            System.out.println("Ingrese la cantidad a convertir:");
            double cantidad = scanner.nextDouble();
            String fromCurrency = "";
            String toCurrency = "";

            switch (opcion) {
                case 1:
                    fromCurrency = "USD";
                    toCurrency = "ARS";
                    break;
                case 2:
                    fromCurrency = "ARS";
                    toCurrency = "USD";
                    break;
                case 3:
                    fromCurrency = "USD";
                    toCurrency = "BRL";
                    break;
                case 4:
                    fromCurrency = "BRL";
                    toCurrency = "USD";
                    break;
                case 5:
                    fromCurrency = "USD";
                    toCurrency = "COP";
                    break;
                case 6:
                    fromCurrency = "COP";
                    toCurrency = "USD";
                    break;
                case 7:
                    fromCurrency = "MXN";
                    toCurrency = "USD";
                    break;
                case 8:
                    fromCurrency = "USD";
                    toCurrency = "MXN";
                    break;
                default:
                    System.out.println("Opción no válida.");
                    continue;
            }

            try {
                double resultado = conversor.convertir(cantidad, fromCurrency, toCurrency);
                System.out.println("Resultado: " + resultado + " " + toCurrency);
            } catch (Exception e) {
                System.out.println("Error al convertir la moneda: " + e.getMessage());
            }
        }

        scanner.close();
    }
}
