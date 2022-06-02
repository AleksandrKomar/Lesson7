package hometasks.task5;

public class Calculator {
    public static void main(String[] args) {

        int a = 3, b = 5, c = 11;
        average(a, b, c);
    }
    static void average(int a, int b, int c) {
        System.out.printf("(" + a + " + " + b + " + " + c + ") / " + 3 + " = %.2f", (double) (a + b + c) / 3);
    }
}
