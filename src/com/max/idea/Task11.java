package com.max.idea;
//Ввести первое число с клавиатуры и записать его в строковую переменную.
//Ввести второе число с клавиатуры и сохранить его в целочисленную переменную типа int.
//Сравнить 2 числа и вывести большее на экран
//Выведите также меньшее число на экран, предварительно переконвертировать его в тип double.

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Ввести первое число: ");
        String a = in.nextLine();
        System.out.println("Ввести второе число: ");
        Integer b = in.nextInt();
        String result;
        result = Integer.toString(b);
        System.out.println(a.equals(result));
        System.out.println("Большее число из 2 чисел: " + Math.max(Integer.parseInt(a),b));
        System.out.println("Меньшее число из 2 чисел: " + Math.min(Double.parseDouble(a),b));
    }
}
