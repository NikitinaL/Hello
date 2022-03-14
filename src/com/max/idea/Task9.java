package com.max.idea;

import java.util.Scanner;

//Пользователь вводит размер массива и данные с клавиатуры в массив типа double
//Посчитайте среднее арифметическое элементов массива
//После этого произведите вывод массива на экран, где каждый элемент массива умножается на среднее арифметическое
public class Task9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int size = in.nextInt();
        double[] ar = new double[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Введите элементы массива ");
            int elem = in.nextInt();
            ar[i] = elem;}
            double average = 0;
            if (ar.length > 0) {
                double sum = 0;
                for (int j = 1; j < ar.length; j++) {
                    sum += ar[j];
                    average = sum / ar.length;
                    System.out.println("Среднее" + average);
                } for (int a = 0; a < ar.length; a++) {
                    System.out.println(ar[a]+ "=" + ar[a]*average);
                }

            }

        }
    }









