package ru.mirea.lab9.task1;

public class Main {
    public static void main(String[] args) {
        Student[] students = new Student[] {
                new Student(3, "Alice"),
                new Student(1, "Bob"),
                new Student(4, "Charlie"),
                new Student(2, "David")
        };

        System.out.println("Before sorting:");
        displayStudent(students);

        // Sorting the array using insertion sort
        insertionSort(students);

        System.out.println("\nAfter sorting by iDNumber:");
        displayStudent(students);
    }

    public static void displayStudent(Student[] students){
        for (Student student : students){
            System.out.println(student);
        }
    }

    public static void insertionSort(Student[] arr) {
        for (int i = 1; i < arr.length; i++) {
            Student key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j].compareTo(key) > 0) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }
    }
}
