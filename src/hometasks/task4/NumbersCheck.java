package hometasks.task4;

import java.util.Scanner;

public class NumbersCheck {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Введите число = ");
        int a = input.nextInt();

        checkPN(a);
        checkSimple(a);
        checkDiv(a);
    }

    static void checkPN(int a) {

        if (a >= 0) {
            System.out.println("Введенное число положительное.");
        } else {
            System.out.println("Введенное число отрицательное");
        }

    }

    static void checkSimple(int a) {

        if (a % 2 == 0) {
            System.out.println("Число не простое");
            return;
        }

        for (int i = 3; i <= Math.sqrt(a); i += 2) {
            if (a % i == 0) {
                System.out.println("Число не простое");
                return;
            }
        }
        System.out.println("Число простое");
    }

    private static void checkDiv(int a) {
        if ((a % 2 == 0) && (a % 5 == 0) && (a % 3 == 0) && (a % 6 == 0) && (a % 9 == 0)) {
            System.out.println("Число делится без остатка");
        } else {
            System.out.println("Число не делится без остатка");
        }
    }

}
