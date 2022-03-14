package com.max.idea;

import java.util.Random;
import java.util.Scanner;

//Напишите программу, где пользователь вводит любое целое положительное число n.
// А программа суммирует все нечетные числа от 1 до введенного пользователем числа n.
public class Task8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите целое положительное число: ");
        int a = in.nextInt();
        System.out.println(sum(a));
    }
    public static int sum(int a) {
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        for (int i = 1; i < a; i+=2) {
            System.out.println(i);
            if (i % 2 != 0) {
                sum +=i;
            }
        }
        return sum;
    }
}






