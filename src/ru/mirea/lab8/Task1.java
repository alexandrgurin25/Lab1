package ru.mirea.lab8;

import java.util.Scanner;

/*
    Вариант #9
    Задание Без двух нулей
    Даны числа a и b. Определите, сколько существует последовательностей
    из a нулей и b единиц, в которых никакие два нуля не стоят рядом.
     */

    public class Task1 {
    public static int recursion(int a, int b){
        if ((a == 0)&&(b != 0)) {
            return 1;
        }
        else if((a == 1)&&(b != 0)){
            return b + 1;
        }
        else if ((a > 1)&&( b == 0)){
            return 0;
        }
        return recursion(a - 1, b - 1) + recursion(a, b - 1);
    }


    public static void main(String[] args) {
        int a;
        int b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите a ->");
        a = scanner.nextInt();
        System.out.println("Введите b ->");
        b = scanner.nextInt();
        System.out.println("Последовательностей -> "+recursion(a, b));
    }
}
