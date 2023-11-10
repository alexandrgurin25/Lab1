package ru.mirea.HomeTaskFromLecture.Nov7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String bracketStr;
        Scanner scanner = new Scanner(System.in);
        bracketStr = scanner.nextLine();
        LinkedList linkedList = new LinkedList();

        for (int i = 0; i < bracketStr.length(); i++) {
            char ch = bracketStr.charAt(i);
            if (ch == '{' || ch == '[' || ch == '(') {
                linkedList.add(ch);
            } else {
                char lastBracket = linkedList.output(linkedList.size - 1);
                if (!linkedList.isEmpty()
                        && ((lastBracket == '{' && ch == '}')
                        || (lastBracket == '[' && ch == ']')
                        || (lastBracket == '(' && ch == ')'))) {
                    linkedList.remove();
                }
            }
        }
        System.out.println(linkedList.isEmpty());
    }
}
