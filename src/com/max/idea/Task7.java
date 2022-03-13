package com.max.idea;
import java.util.Scanner;
//Пользователь вводит размер массива и данные с клавиатуры в массив
//Сравнить элементы массива с заранее заданными константами x, y, z.
//Если массив содержит хотя бы одну из констант, вывести текст "Данное значение имеется в константах"
public class Task7 {
    public static void main(String[] args) {
        int x = 1;
        int y = 4;
        int z = 3;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int size = in.nextInt();
        int[] Arraw = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Введите элементы массива ");
            int elem = in.nextInt();
            Arraw[i] = elem;
            if (elem == x || elem == y || elem == z) {
                System.out.println("Данное значение имеется в константах");
            }
        }
    }
}