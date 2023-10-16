package ru.mirea.lab3.MathRandom.task3;

import java.util.concurrent.ThreadLocalRandom;

public class ArrayRandom {
    public static void main(String[] args) {
        int size = 4; // Длина массива
        int[] array = new int[size];
        for (int i = 0; i < size; i++){
            array[i] = ThreadLocalRandom.current().nextInt(10,100);
        }
        System.out.println("Массив с рандомными числами:");

        for (int i = 0; i < size; i++){
            System.out.println("array["+i+"]"+'='+array[i]);
        }

        int count = 0;
        for (int i = 0; i < size-1; i++) {
            if (array[i] < array[i+1]){
                count += 1;
            }
        }

        if (count == 4){
            System.out.println("Массив со строго возрастающей последовательностью");
        } else {
            System.out.println("Массив НЕ со строго возрастающей последовательностью");
        }
    }
}
