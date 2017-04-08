package com.hongyun;

/**
 * Created by hongyun
 * on 20/03/2017
 */

public class TestMain {
    static class WorkerThread extends Thread {
        @Override
        public void run() {
            super.run();

            while (true) {
                System.out.println("you know");
            }
        }
    }

    public static void main(String[] args) {
        WorkerThread thread = new WorkerThread();
        thread.start();
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread.interrupt();
    }
}
