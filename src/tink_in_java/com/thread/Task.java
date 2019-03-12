package com.thread;

import java.util.Random;
import java.util.concurrent.Callable;

public class Task implements Runnable, Comparable<Task> {
    private short priority;

    public Task(short priority) {
        this.priority = priority;
    }

    @Override
    public int compareTo(Task task) {
        if (this.priority < task.priority) {
            return 1;
        } else if (this.priority > task.priority) {
            return -1;
        } else {
            return 0;
        }
    }

    @Override
    public void run() {
        try {
            Random random = new Random(1000);
            Thread.sleep(Math.abs(random.nextInt(1000)));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + ",priority=" + priority);
    }
}
