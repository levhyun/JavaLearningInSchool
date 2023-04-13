package kr.hs.dgsw.java.Array;

import java.util.Scanner;

public class Queue {
    private static final int MAXSIZE = 10;
    private final int[] array = new int[MAXSIZE];
    private int front = -1;
    private int rear = -1;
    public boolean isEmpty() {
        return rear == front;
    }
    public boolean isFull() {
        return (rear+1) % MAXSIZE == front;
    }
    public void enQueue(int value) {
        if (isFull()) {
            System.out.println("Queue is Full");
        } else {
            rear = (rear+1) % MAXSIZE;
            array[rear] = value;
        }
    }
    public int deQueue() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        } else {
            front = (front+1) % MAXSIZE;
            return array[front];
        }
    }
    public int getNowSize() {
        return (rear-front+1) % MAXSIZE;
    }
    public static void main(String[] args) {
        Queue queue = new Queue();
        Scanner scanner = new Scanner(System.in);
        int value;
        String command = null;
        while (true) {
            command = scanner.next();
            if ("push".equals(command)) {
                value = scanner.nextInt();
                queue.enQueue(value);
            } else if ("pop".equals(command)) {
                System.out.println(queue.deQueue());
            } else if ("quit".equals(command)) {
                break;
            } else if ("size".equals(command)) {
                System.out.println(queue.getNowSize());
            } else {
                System.out.println("Unknown command");
            }
        }
        scanner.close();
    }
}
