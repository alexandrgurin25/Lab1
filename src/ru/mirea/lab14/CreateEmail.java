package ru.mirea.lab14;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
    Написать регулярное выражение, определяющее является ли данная
    строчка допустимым (корректным) е-mail адресом согласно RFC под номером
    2822.
    a) пример правильных выражений: user@example.com, root@localhost
    b) пример неправильных выражений: myhost@@@com.ru, @my.ru,
    Julia String
 */
public class CreateEmail {
    public static void main(String[] args) {
        System.out.println("Напиши свой Email:");

        Pattern pattern = Pattern.compile("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$");
        boolean flag = true;

        while (flag){
            Scanner scanner = new Scanner(System.in);
            String password = scanner.next();
            Matcher matcher = pattern.matcher(password);
            if (matcher.matches()) {
                flag = false;
                System.out.println("Отлично, туда мы отправим офер!");
            } else{
                System.out.println("Ваша почта неверна,\nпопробуйте еще раз.");

            }
        }
    }
}
