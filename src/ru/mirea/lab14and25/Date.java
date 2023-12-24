package ru.mirea.lab14and25;

/*
    Написать регулярное выражение, определяющее является ли данная
    строчка датой в формате dd/mm/yyyy. Начиная с 1900 года до 9999 года.
    a) пример правильных выражений: 29/02/2000, 30/04/2003, 01/01/2003.
    b) пример неправильных выражений: 29/02/2001, 30-04-2003, 1/1/1899.
 */

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Date {
    public static void main(String[] args) {
        System.out.println("Введите любую известную дату, начиная с 1900 до 9999");
        System.out.println("dd/mm/yyyy ->");

        Pattern pattern = Pattern.compile("^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/((19|20)\\d\\d)$");

        boolean flag = true;

        while (flag){
            Scanner scanner = new Scanner(System.in);
            String password = scanner.next();
            Matcher matcher = pattern.matcher(password);
            if (matcher.matches()) {
                flag = false;
                System.out.println("Отлично, Вы ввели существующую дату");
            } else{
                System.out.println("Дата не соотвествует формату, либо ее не существует,\nПопробуйте еще раз");

            }
        }
    }
}
