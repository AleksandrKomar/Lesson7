package hometasks.task2;

import java.util.Scanner;

public class Arithmetics {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Введите первое число = ");
        int a = input.nextInt();

        System.out.print("Введите второе число = ");
        int b = input.nextInt();

        System.out.print("ЗВведите арифметический знак: ");
        String sign = input.next();

        switch (sign) {
            case "+":
                add(a, b);
                break;
            case "-":
                sub(a, b);
                break;
            case "*":
                mul(a, b);
                break;
            case "/":
                div(a, b);
                break;
            default:
                System.out.println("Не известный арифметический знак!");
        }

    }

    static void add(int a, int b) {
        System.out.println(a + " + " + b + " = " + (a + b));
    }

    static void sub(int a, int b) {
        System.out.println(a + " - " + b + " = " + (a - b));
    }

    static void mul(int a, int b) {
        System.out.println(a + " * " + b + " = " + (a * b));
    }

    static void div(int a, int b) {
        if (b == 0) {
            System.out.println("Деление на 0 запрещено!");
            return;
        }
        System.out.printf(a + " / " + b + " = %.2f", (double) a / b);
    }

}
