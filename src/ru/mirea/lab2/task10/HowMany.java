package ru.mirea.lab2.task10;

import java.util.Scanner;

public class HowMany {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите текст:");
        String input = scanner.nextLine();

        int wordCount = countWords(input);

        System.out.println("Количество слов в тексте: " + wordCount);
    }

    public static int countWords(String text) {
        // Разделяем текст на слова, используя пробелы и знаки препинания в качестве разделителей
        String[] words = text.split("[\\s\\p{Punct}]+");

        return words.length;
    }
}