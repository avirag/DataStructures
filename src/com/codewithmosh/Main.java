package com.codewithmosh;

public class Main {

    public static void main(String[] args) {
        QueueWithTwoStacks queue = new QueueWithTwoStacks();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);

        queue.dequeue();
        queue.dequeue();

        queue.enqueue(50);
        queue.enqueue(60);

        int front = queue.dequeue();
        System.out.println(front);
    }
}
