package com.idlefish;

/**
 * Created by hongyun
 * on 16/10/2017
 */

public class TestThread2 {
    private static boolean condition = false;

    private static final Object lock = new Object();

    public static void main(String[] args) {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (lock) {
                    while (!condition) {
                        try {
                            lock.wait(200);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println("reach last while");
                    }
                }

                System.out.println("condition is true");
            }
        });
        thread1.start();


        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (lock) {
                    condition = true;
                    lock.notifyAll();
                }
            }
        });
        thread2.start();
    }

}
