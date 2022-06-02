package hometasks.task4;

import java.util.Scanner;

public class NumbersCheck {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("������� ����� = ");
        int a = input.nextInt();

        checkPN(a);
        checkSimple(a);
        checkDiv(a);
    }

    static void checkPN(int a) {

        if (a >= 0) {
            System.out.println("��������� ����� �������������.");
        } else {
            System.out.println("��������� ����� �������������");
        }

    }

    static void checkSimple(int a) {

        if (a % 2 == 0) {
            System.out.println("����� �� �������");
            return;
        }

        for (int i = 3; i <= Math.sqrt(a); i += 2) {
            if (a % i == 0) {
                System.out.println("����� �� �������");
                return;
            }
        }
        System.out.println("����� �������");
    }

    private static void checkDiv(int a) {
        if ((a % 2 == 0) && (a % 5 == 0) && (a % 3 == 0) && (a % 6 == 0) && (a % 9 == 0)) {
            System.out.println("����� ������� ��� �������");
        } else {
            System.out.println("����� �� ������� ��� �������");
        }
    }

}
