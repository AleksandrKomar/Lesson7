package hometasks.task3;

import java.util.Scanner;

public class Conversion {
    public static void main(String[] args) {

        final double UAH_to_USD = 0.034;
        final double UAH_to_EUR = 0.032;
        final double USD_to_UAH = 29.69;
        final double USD_to_EUR = 0.94;
        final double EUR_to_UAH = 31.73;
        final double EUR_to_USD = 1.07;

        Scanner sc = new Scanner(System.in);

        System.out.println("Выберите валюту, в которую хотите поменять: гривны, доллары или евро" + "\n" + "Введите H, D или E");
        String currency = sc.next();

        System.out.println("Выберите валюту конвертации: гривны, доллары или евро" + "\n" + "Введите H, D или E");
        String convCurrency = sc.next();

        System.out.println("Введите сумму:");
        double money = sc.nextDouble();

        if (money < 0) {
            System.out.println("Отрицательная сумма запрещена. Повторите.");
            return;
        }

        if ((currency.equals("h") || currency.equals("H")) && (convCurrency.equals("d") || convCurrency.equals("D"))) {
            System.out.printf("Конвертация гривны в доллары : %.2f $", convUAHToUSD(money, UAH_to_USD));
        } else if ((currency.equals("h") || currency.equals("H")) && (convCurrency.equals("e") || convCurrency.equals("E"))) {
            System.out.printf("Конвертация гривны в евро : %.2f €", convUAHToEUR(money, UAH_to_EUR));
        } else if ((currency.equals("d") || currency.equals("D")) && (convCurrency.equals("h") || convCurrency.equals("H"))) {
            System.out.printf("Конвертация доллары в гривны : %.2f UAH", convUSDtoUAH(money, USD_to_UAH));
        } else if ((currency.equals("d") || currency.equals("D")) && (convCurrency.equals("e") || convCurrency.equals("E"))) {
            System.out.printf("Конвертация доллары в евро : %.2f €", convUSDtoEUR(money, USD_to_EUR));
        } else if ((currency.equals("e") || currency.equals("E")) && (convCurrency.equals("h") || convCurrency.equals("H"))) {
            System.out.printf("Конвертация евро в гривны : %.2f UAH", convEURtoUAH(money, EUR_to_UAH));
        } else if ((currency.equals("e") || currency.equals("E")) && (convCurrency.equals("d") || convCurrency.equals("D"))) {
            System.out.printf("Конвертация евро в доллары : %.2f €", convEURtoUSD(money, EUR_to_USD));
        } else {
            System.out.println("Выбранная валюта отсутсвует.");
        }
    }

    static double convUAHToUSD(double money, double UAH_to_USD) {
        return money * UAH_to_USD;
    }

    static double convUAHToEUR(double money, double UAH_to_EUR) {
        return money * UAH_to_EUR;
    }

    static double convUSDtoUAH(double money, double USD_to_UAH) {
        return money * USD_to_UAH;
    }

    static double convUSDtoEUR(double money, double USD_to_EUR) {
        return money * USD_to_EUR;
    }

    static double convEURtoUAH(double money, double EUR_to_UAH) {
        return money * EUR_to_UAH;
    }

    static double convEURtoUSD(double money, double EUR_to_USD) {
        return money * EUR_to_USD;
    }

}
