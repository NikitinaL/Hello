package com.max.idea;

import java.util.Scanner;

public class Converter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Что рассчитать: \n\t>1-масса \n\t>2-расстояние");
        int arg1 = in.nextInt();
        if (arg1==2){
            int dist = (int) calculateDistance();
        } else if (arg1==1){
            int mass = (int) calculateMass();
        } else {
            System.out.println("Ошибка в запросе");
        }
    }
    public static double calculateDistance () {
        Scanner in = new Scanner(System.in);
        System.out.println("Выберите единицу измерения: \n\t>1-М \n\t>2-МЛ \n\t>3-КМ");
        int arg2 = in.nextInt();
        System.out.println("Введите количество:");
        double qt = in.nextDouble();
        double result = 0;
        double r = result;
        switch (arg2) {
            case 3:
                result = qt * 1000;
                System.out.println("Метры: " + result);
                result = qt / 1.69;
                System.out.println("Мили: " + result);
                break;
            case 1:
                result = qt / 1609;
                System.out.println("Мили: " + result);
                result = qt / 1000;
                System.out.println("Километры: " + result);
                break;
            case 2:
                result = qt * 1609;
                System.out.println("Метры: " + result);
                result = qt *1.69;
                System.out.println("Километры: " + result);
                break;
            default:
                System.out.println("Ошибка в запросе");
        }
        return 0;
    }
    public static double calculateMass(){
        Scanner in = new Scanner(System.in);
        System.out.println("Выберите единицу измерения: \n\t>1-КГ \n\t>2-ГР \n\t>3-Фунт");
        int arg2 = in.nextInt();
        System.out.println("Введите количество:");
        double qt = in.nextDouble();
        double result = 0;
        double r = result;
        switch (arg2){
            case 2:
                result = qt/1000;
                System.out.println("КГ: "+result);
                result = qt/454;
                System.out.println("Фунты: "+result);
                break;
            case 3:
                 result = qt*454;
                System.out.println("ГР: "+result);
                result = qt/2.25;
                System.out.println("КГ: "+result);
                break;
            case 1:
                result = qt*1000;
                System.out.println("ГР: "+result);
                result = qt*2.25;
                System.out.println("Фунты: "+result);
                break;
            default:
                System.out.println("Ошибка в запросе");
        }
        return 0;
    }
}




