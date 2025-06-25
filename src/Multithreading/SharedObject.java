package Multithreading;

import java.util.Scanner;

public class SharedObject {
    int value = 0;
    boolean hasData = false;

    public static void main(String[] args) {
        SharedObject o = new SharedObject();

        Thread producer = new Thread(o::produce);
        Thread consumer = new Thread(o::consume);

        producer.start();
        consumer.start();
    }

    private synchronized void produce() {
        while(true)
        try {
            while (hasData) {
                wait(); // ✅ Wait until consumer resets hasData
            }
            Scanner in = new Scanner(System.in);
            System.out.println("Enter the data:");
            value = in.nextInt();
            hasData = true;
            notify(); // ✅ Notify consumer
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    private synchronized void consume() {
        while(true)
        try {
            while (!hasData) {
                wait(); // ✅ Wait until producer sets hasData
            }
            System.out.println("Consumed: " + value);
            hasData = false;
            notify(); // ✅ Notify producer
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
