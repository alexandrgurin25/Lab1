package ru.mirea.lab11.task3;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("John Doe", new Date(2100 - 2000, 2, 25)); // Пример даты рождения: 2000-01-01

        System.out.println("Short Format: " + student.getFormattedDate("dd/MM/yy"));
        System.out.println("Medium Format: " + student.getFormattedDate("dd/MM/yyyy"));
        System.out.println("Full Format: " + student.getFormattedDate("dd MMMM yyyy"));
    }
}

