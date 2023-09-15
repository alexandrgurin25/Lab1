package ru.mirea.lab2.task1;

public class TestAuthor {
    public static void main(String[] args) {
        Author author = new Author("Иванов Иван", "ivan@email.ru", 'M');

        //System.out.println(author);
        System.out.println("Имя автора " + author.getName());
        System.out.println("Email автора " + author.getEmail());

        author.setEmail("Ivabuskla@email.ru");
        System.out.println("Новый Email " + author.getEmail());

        System.out.println("Пол автора: " + author.getGender());
        System.out.println(author.toString());

    }
}