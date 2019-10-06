package com.codewithmosh;

public class Main {

    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue(5);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        System.out.println(queue);

        queue.dequeue();
        queue.dequeue();
        System.out.println(queue);

        queue.enqueue(50);
        queue.enqueue(60);

        System.out.println(queue);
    }
}
