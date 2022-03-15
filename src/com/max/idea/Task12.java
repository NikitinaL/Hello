package com.max.idea;
//Напишите программу, принимающую на вход строку “I like Java!!!”, которая будет выполнять следующие действия
//1. Проверить, содержит ли строка подстроку “Java” (используйте contains())
//2. Проверить, начинается ли строка с подстроки “I like” (используйте startsWith()).
//3. Проверить, заканчивается ли строка с подставки “!!!” (используйте endsWith()).
//4. Если 3 предыдущих условия верны, выведите данную строку, преобразованную к верхнему регистру.
//5. Замените все символы ‘a’ на ‘о’ и введите подстроку “Jovo” на экран (используйте substring()).

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        boolean a;
        boolean b;
        boolean с;
        String str="I like Java!!!";
        a=str.contains("Java");
        b=str.startsWith("I like");
        с=str.endsWith("!!!");
        System.out.println(a);
        System.out.println(b);
        System.out.println(с);
        if(a && b && с){
            String result=str.toUpperCase();
            System.out.println(result);
        } String result2=str.replace("a","o");
        result2=result2.substring(6,11);
        System.out.println(result2);
    }
}
