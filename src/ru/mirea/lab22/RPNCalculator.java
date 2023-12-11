package ru.mirea.lab22;

import java.util.Stack;
public class RPNCalculator {
    public static void main(String[] args) {
        String[] expression = {"3", "4", "+", "2", "*", "7", "/"};
        System.out.println("Результат: " + evaluateRPN(expression));
    }

    public static double evaluateRPN(String[] tokens) {
        Stack<Double> stack = new Stack<>();

        for (String token : tokens) {
            switch (token) {
                case "+":
                    stack.push(stack.pop() + stack.pop());
                    break;
                case "-":
                    stack.push(-stack.pop() + stack.pop());
                    break;
                case "*":
                    stack.push(stack.pop() * stack.pop());
                    break;
                case "/":
                    double divisor = stack.pop();
                    stack.push(stack.pop() / divisor);
                    break;
                default:
                    stack.push(Double.parseDouble(token));
            }
        }

        return stack.pop();
    }
}
