package main;

public class Calc {
    public static void calc(int a, int b, char operator) {
        switch (operator) {
            case '+' -> System.out.println(a + b);
            case '-' -> System.out.println(a - b);
            case '*' -> System.out.println(a * b);
            case '/' -> System.out.println(a / b);
            default -> System.out.println("Что-то пошло не так, повторите заново");
        }
    }

    public static void main(String[] args) {
        calc(6, 2, '-');
    }
}

