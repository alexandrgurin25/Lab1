package ru.mirea.lab8;

/* Вариант 10.
    Задание Разворот числа
    Дано число n, десятичная запись которого не содержит нулей. Получите
    число, записанное теми же цифрами, но в противоположном порядке.
    При решении этой задачи нельзя использовать циклы, строки, списки,
    массивы, разрешается только рекурсия и целочисленная арифметика.
    Функция должна возвращать целое число, являющееся результатом работы
    программы, выводить число по одной цифре нельзя.
 */

import java.util.Scanner;
public class Task2 {
    public static int reverse(int n, int result) {
        if (n == 0) {
            return result;
        } else {
            int lastDigit = n % 10;
            n /= 10;
            result = result * 10 + lastDigit;
            return reverse(n, result);
        }
    }

    public static boolean containsZero(int num) {
        while (num != 0) {
            int digit = num % 10;
            if (digit == 0) {
                return true;
            }
            num /= 10;
        }
        return false;
    }

    public static void main(String[] args) {
        int n;
        boolean containsZero = false;

        while (true){
            System.out.println("Введите число, в записи которого нет нулей ->");
            Scanner scanner = new Scanner(System.in);
            n = scanner.nextInt();
            if (containsZero(n)) {
                System.out.println("Неверный ввод числа, ваше число содержит «0»");
                System.out.println("Пожалуйста, попробуйте еще раз");
            } else {
                System.out.println(reverse(n, 0));;
                break;
            }
        }

    }

}
