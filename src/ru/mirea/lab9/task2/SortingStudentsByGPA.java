package ru.mirea.lab9.task2;

import java.util.Comparator;
import java.util.List;

public class SortingStudentsByGPA implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {

        double gpa1 = o1.getExamScore();
        double gpa2 = o2.getExamScore();
        return Double.compare(gpa2, gpa1);
    }

    public void quickSort(List<Student> students, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(students, low, high);
            quickSort(students, low, pivotIndex - 1);
            quickSort(students, pivotIndex + 1, high);
        }
    }

    public int partition(List<Student> students, int low, int high) {
        int i = low - 1;

        for (int j = low; j < high; j++){
            if (compare(students.get(j),students.get(high)) > 0){
                i++;
                Student temp = students.get(i);
                students.set(i, students.get(j));
                students.set(j, temp);
            }
        }
        // Перемещаем пивот на правильную позицию
        Student temp = students.get(i + 1);
        students.set(i + 1, students.get(high));
        students.set(high, temp);

        return i + 1;
    }
}
