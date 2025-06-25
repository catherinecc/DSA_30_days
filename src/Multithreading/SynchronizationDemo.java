package Multithreading;
/*
Output :
Thread T4has entered the static synchronized method
Thread T3has entered the synchronized block with current object lock
Thread T4is exiting the static synchronized method
Thread T3is exiting the synchronized block with current object lock
Thread T1has entered the synchronized method
Thread T1is exiting the synchronized method
Thread T2has entered the synchronized method
Thread T2is exiting the synchronized method

Here we can see that t4 is parallel as it is locking SynchronizationDemo.class
 while t1,t2,t3 are executing sequantially since they are all locking the 'this' object
 */


public class SynchronizationDemo {
    public static void main(String[] args) {
        SynchronizationDemo object = new SynchronizationDemo();

            Thread t1 = new Thread(() -> {
                try {
                    object.synchronizedMethod("T1");
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }, "T1");
            Thread t2 = new Thread(() -> {
                try {
                    object.synchronizedMethod("T2");
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }, "T2");


            Thread t3 = new Thread(() -> {
                try {
                    object.synchronizedCurrentObjectMethod("T3");
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }, "T2");

            Thread t4 = new Thread(() -> {
                try {
                    object.staticSynchronizedMethod("T4");
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }, "T4");


            t3.start();
            t4.start();
            t2.start();
            t1.start();


    }

    private static synchronized void staticSynchronizedMethod(String t4) throws InterruptedException {
        System.out.println("Thread " + t4 + "has entered the static synchronized method ");
        Thread.sleep(10);
        System.out.println("Thread " + t4 + "is exiting the static synchronized method ");
    }

    private void synchronizedCurrentObjectMethod(String t3) throws InterruptedException {
        synchronized (this) {
            System.out.println("Thread " + t3 + "has entered the synchronized block with current object lock ");
            Thread.sleep(10);
            System.out.println("Thread " + t3 + "is exiting the synchronized block with current object lock ");
        }
    }

    private synchronized void synchronizedMethod(String t1) throws InterruptedException {
        System.out.println("Thread " + t1 + "has entered the synchronized method  ");
        Thread.sleep(10);
        System.out.println("Thread " + t1 + "is exiting the synchronized method  ");
    }
}
