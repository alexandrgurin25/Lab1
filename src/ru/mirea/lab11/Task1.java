package ru.mirea.lab11;

import java.util.Date;

public class Task1 {
    public static void main(String[] args) {
        String developerName = "Гурин";

        // Дата и время получения задания
        Date assignmentReceivedDate = new Date();
        long assignmentReceivedTimeMillis = assignmentReceivedDate.getTime();

        // Дата и время сдачи задания
        long assignmentDueTimeMillis = assignmentReceivedTimeMillis + 7 * 24 * 60 * 60 * 1000; // 7 дней в миллисекундах
        Date assignmentDueDate = new Date(assignmentDueTimeMillis);

        System.out.println("Фамилия разработчика: " + developerName);
        System.out.println("Дата и время получения задания: " + assignmentReceivedDate);
        System.out.println("Дата и время сдачи задания: " + assignmentDueDate);
    }
}

/* Вывод в терминал
Фамилия разработчика: Гурин
Дата и время получения задания: Sat Oct 21 23:08:29 MSK 2023
Дата и время сдачи задания: Sat Oct 28 23:08:29 MSK 2023

 */