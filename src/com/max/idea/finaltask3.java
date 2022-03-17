package com.max.idea;

//Напишите программу, где пользователь вводит сначала количество строк n, затем сами строки
//Среди данных строк найти строку с максимальным количеством различных символов
//Если таких строк будет много, то вывести первую

import java.util.Scanner;

public class finaltask3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество строк: ");
        int lengthArr = in.nextInt();
        String stringArr[] = new String[lengthArr];
        for (int i = 0; i < stringArr.length; i++) {
            System.out.println("Введите строку " + (i + 1));
            stringArr[i] = in.next();
        }
        int maxLength = 0;
        int maxStrIndex = 0;
        for (int i = 0; i < stringArr.length; i++) {
            int currentLength = (int) stringArr[i].chars().distinct().count();
            if (currentLength > maxLength) {
                maxLength = currentLength;
                maxStrIndex = i;
            }
        }
        System.out.println(stringArr[maxStrIndex]);
        in.close();
    }
}

