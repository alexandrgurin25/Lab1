package ru.mirea.lab21.task3;

public class ArrayUtils {
    // Обобщённый метод для получения элемента массива по индексу
    public static <T> T getElement(T[] array, int index) {
        if (index < 0 || index >= array.length) {
            throw new IndexOutOfBoundsException("Индекс вне границ массива: " + index);
        }
        return array[index];
    }

    // Тестирование метода
    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        String[] stringArray = {"Hello", "World", "Java"};

        Integer number = getElement(intArray, 2); // Получение элемента из массива чисел
        String text = getElement(stringArray, 1); // Получение элемента из массива строк

        System.out.println("Число: " + number);
        System.out.println("Текст: " + text);
    }
}
