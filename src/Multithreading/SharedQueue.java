package Multithreading;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class SharedQueue {
    Queue<String> q = new LinkedList<>();
    boolean hasData = false;
    final int MAX_CAPACITY =5;

    public static void main(String[] args) {
        SharedQueue o = new SharedQueue();

        Thread producer = new Thread(o::produce);
        Thread consumer = new Thread(o::consume);

        producer.start();
        consumer.start();
    }

    private  void produce() {
        while (true) {
            synchronized (q) {
                try {
                    while (q.size() > 0) {
                        q.wait(); // ✅ Wait until consumer resets hasData
                    }
                    Scanner in = new Scanner(System.in);
                    System.out.println("Enter the data:");
                    q.add(in.next());
                    q.notify(); // ✅ Notify consumer
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
            // print();
        }
    }
    private void print() {
    }

    private  void consume() {
        while (true)
            synchronized (q){
            try {
                while (q.size()==0) {
                    q.wait(); // ✅ Wait until producer sets hasData
                }
                System.out.println("Consumed: " + q.poll());
                hasData = false;
                q.notify(); // ✅ Notify producer
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }}
    }
}
