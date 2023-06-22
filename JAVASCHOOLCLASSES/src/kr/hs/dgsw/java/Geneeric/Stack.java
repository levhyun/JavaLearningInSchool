package kr.hs.dgsw.java.Geneeric;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Stack<T> {
    private static final int SIZE = 10;
    private ArrayList<T> array = new ArrayList<T>();
    private int top = 0;
    public void push(T value) {
        array.add(value);
        top += 1;
    }
    public T pop() {
        return array.get(--top);
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
        Stack<String> stack = new Stack<>();
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
