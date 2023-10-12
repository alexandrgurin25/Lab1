package ru.mirea.HomeTaskFromLecture;

public class main {
    public static void main(String[] args) {
        Complex num1 = new Complex(1,0.1);
        Complex num2 = new Complex(2.1,3);
        System.out.println(num1.toString());
        System.out.println(num2.toString());

        System.out.println("\nz1 + z2 = " + num1.add(num2));
        System.out.println("z1 / z2 = " + num1.division(num2));
        System.out.println("z1 - z2 = " + num1.subtract(num2));
        System.out.println("z1 * z2 = " + num1.multiply(num2));

        if (num1.equals(num2)) {
            System.out.println("\nnum1 == num2");
        } else {
            System.out.println("\nnum1 is not == num2");
        }
    }
}
