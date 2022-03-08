package com.max.idea;
import java.util.Scanner;
public class Srednee {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число 1: ");
        int x = in.nextInt();
        System.out.println("Введите число 2: ");
        int y = in.nextInt();
        System.out.println("Введите число 3: ");
        int z = in.nextInt();
        float r = (float) (x+y+z)/3;
        float a = (float) (r/2);
        System.out.println("Среднее " + r);
        System.out.println("Результат деления и округления " + Math.round(a));
        if (a>3) {
            System.out.println("Программа выполнена корректно");
        }
    }
}
