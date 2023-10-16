package ru.mirea.lab9.task1;

public class Student implements Comparable<Student>{
    private int iDNumber;
    private String name;

    public Student(int iDNumber, String name) {
        this.iDNumber = iDNumber;
        this.name = name;
    }

    public int getiDNumber() {
        return iDNumber;
    }

    @Override
    public String toString() {
        return "student{" +
                "iDNumber=" + iDNumber +
                '}';
    }

    @Override
    public int compareTo(Student other) {
        return Integer.compare(this.iDNumber, other.iDNumber);
    }
}
