package com.thread;

import java.sql.Time;
import java.util.concurrent.Callable;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Test {
    public static void main(String[] args) {
        ThreadPoolExecutor executor = new ThreadPoolExecutor(3, 4, 1, TimeUnit.SECONDS,
                new PriorityBlockingQueue<Runnable>());

        short priority = 1;
        for (int i = 0; i < 10; i++) {
            Task task = new Task(priority);
            executor.execute(task);
        }

        System.out.println("--------------");


        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        for (int i = 0; i < 10; i++) {
            Task task = new Task(priority++);
            executor.execute(task);
        }
        System.out.println("=========");

        executor.shutdown();

        try {
            executor.awaitTermination(1, TimeUnit.DAYS);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("over");
    }
}
