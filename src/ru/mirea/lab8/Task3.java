package ru.mirea.lab8;

import java.util.Scanner;

/*  Вариант 11
    Задание Количество единиц
    Дана последовательность натуральных чисел (одно число в строке),
    завершающаяся двумя числами 0 подряд. Определите, сколько раз в этой
    последовательности встречается число 1. Числа, идущие после двух нулей,
    необходимо игнорировать.
    В этой задаче нельзя использовать глобальные переменные и параметры,
    передаваемые в функцию. Функция получает данные, считывая их с клавиатуры,
    а не получая их в виде параметров.
 */
public class Task3 {
    public static void main(String[] args) {
        int count = countOnesInSequence();
        System.out.println("Количество вхождений числа 1: " + count);
    }

    public static int countOnesInSequence() {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int number;

        while (true) {
            number = scanner.nextInt();
            if (number == 0) {
                int nextNumber = scanner.nextInt();
                if (nextNumber == 0) {
                    break;
                }
            }

            int tempNumber = number;
            while (tempNumber != 0) {
                int digit = tempNumber % 10;
                if (digit == 1) {
                    count++;
                }
                tempNumber /= 10;
            }
        }

        scanner.close();
        return count;
    }

}
