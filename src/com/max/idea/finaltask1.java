package com.max.idea;
import java.util.Scanner;
public class finaltask1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите текущий курс:" );
        double arg1 = in.nextDouble();
        System.out.println("Количество рублей:" );
        double arg2 = in.nextDouble();
        double result=0;
         result = arg2 /arg1;
        System.out.printf("%.2f", result);
    }
}
