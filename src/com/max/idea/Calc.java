package com.max.idea;
import java.util.Scanner;
public class Calc {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число 1: ");
        int arg1 = in.nextInt();
        System.out.print("Введите число 2: ");
        int arg2 = in.nextInt();
        System.out.print("Введите операцию: ");
        String operation = sc.nextLine();
        System.out.println(calculate(arg1, arg2, operation));
    }
    public static int calculate(int arg1, int arg2, String operation) {
        switch (operation) {
            case "+":
                return arg1 + arg2;
            case "-":
                return arg1 - arg2;
            case "*":
                return arg1 * arg2;
            case "/":
                return arg1 / arg2;
            default:
                throw new UnsupportedOperationException("Не корректная операция, Введите +,-,/,*");
        }
    }
}


