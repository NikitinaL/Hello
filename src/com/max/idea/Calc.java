package com.max.idea;
import java.util.Scanner;
public class Calc {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число 1: ");
        int x = in.nextInt();
        System.out.print("Введите число 2: ");
        int y = in.nextInt();
        System.out.print("Введите операцию: ");
        String a = sc.nextLine();
    }
    public static int calc(int x, int y, char a) {
        int result = calc(x,y,a);
        switch (a) {
            case '+':
                result = x + y;
                break;
        }
        return result;
    }
}
