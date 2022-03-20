package com.max.idea;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
//Напишите программу, где пользователь должен ввести строку из слов, разделенных пробелами.
// Например: “I love java 8 Я люблю java 14 co1re”.
// Выполните следующие действия:
//1. Выведите слова, состоящие только из латиницы.
//2. Выведите количество этих слов.


public class Task13 {
    public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.println("Введите строку: ");
            String str = in.nextLine();
            str = str.trim();
            str = str.replaceAll("[^A-Za-z0-9 ]", "");
            System.out.println(str);
            String[] res = str.split(" ");
            int count = 0;
            for (int i = 0; i < res.length; i++) {
                if (res[i].length() >= 1)
                    count++;
            }
            System.out.println(count);
            in.close();
        }
    }



        







