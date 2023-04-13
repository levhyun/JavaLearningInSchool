package kr.hs.dgsw.java.Array;

import java.util.Scanner;

public class Stack {
    private static final int SIZE = 10;
    private String[] array = new String[SIZE];
    private int top = 0;
    public void push(String value) {
        array[top++] = value;
    }
    public String pop() {
        return array[--top];
    }
    public boolean isFull() {
        return top >= SIZE;
    }
    public boolean isEmpty() {
        return top <= 0;
    }
    public int getNowSize() {
        return top;
    }
    public static void main(String[] args) {
        Stack stack = new Stack();
        Scanner scanner = new Scanner(System.in);
        String value = null;
        String command = null;
        while (true) {
            command = scanner.next();
            if ("push".equals(command)) {
                if (stack.isFull()) {
                    System.out.println("Stack Full");
                    continue;
                }
                value = scanner.next();
                stack.push(value);
            } else if ("pop".equals(command)) {
                if (stack.isEmpty()) {
                    System.out.println("Stack Empty");
                    continue;
                }
                System.out.println(stack.pop());
            } else if ("quit".equals(command)) {
                break;
            } else if ("size".equals(command)) {
                System.out.println(stack.getNowSize());
            } else {
                System.out.println("Unknown command");
            }
        }
        scanner.close();
    }
}
