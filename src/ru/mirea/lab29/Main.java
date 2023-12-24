package ru.mirea.lab29;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Введите кол-во городов в стране: ");
            // Вводим количество городов
            int N = scanner.nextInt();
            // Создаем матрицу смежности
            int[][] adjacencyMatrix = new int[N][N];

            // Создаем экземпляр счетчика дорог
            RoadCounter roadCounter;

            System.out.println("Введите матрицу смежности городов: ");
            // Заполняем матрицу смежности
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    adjacencyMatrix[i][j] = scanner.nextInt();
                }
            }
            roadCounter = new RoadCounter(N, adjacencyMatrix);
            // Выводим результат
            System.out.println(roadCounter.getNumOfRoads());
        } catch (Exception e) {
            System.err.println("Ошибка ввода данных: " + e.getMessage());
        }

    }
}
