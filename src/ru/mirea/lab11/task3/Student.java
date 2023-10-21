package ru.mirea.lab11.task3;

import java.text.SimpleDateFormat;
import java.util.Date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Student {
    private String name;
    private Date dateOfBirth;

    public Student(String name, Date dateOfBirth) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getFormattedDate(String format) {
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        return sdf.format(dateOfBirth);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }
}