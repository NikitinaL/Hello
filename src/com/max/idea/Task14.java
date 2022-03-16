package com.max.idea;

import java.util.Random;

//Напишите программу, заполняющую массив из 15 элементов рандомными значениями в диапазоне от -20 до 20. Далее
//1. Выведите максимальный и минимальный элемент массива.
//2. Из максимального и минимального значения выведите наибольшее по модулю.
public class Task14 {
    public static void main(String[] args) {
        int[] arr = new int[15];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ((int) (Math.random() * 40) - 20);
            System.out.println(arr[i]);
        }
            int Max = 0;
            int Min = 0;
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] > arr[Max]) {
                    Max = i;
                } else if (arr[i] < arr[Min]) {
                    Min = i;
                }
            }
            System.out.println("Максимум: " + arr[Max] + "\n Минимум: " + arr[Min]);
            int resultMax;
            int resultMin;
            resultMax = Math.abs(arr[Max]);
            resultMin = Math.abs(arr[Min]);
            int maxMax = Math.max(resultMax, resultMin);
            System.out.println(maxMax);
        }
    }


