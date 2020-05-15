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
//        WorkerThread thread = new WorkerThread();
//        thread.start();
//        try {
//            Thread.sleep(200);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        thread.interrupt();
        int[] array = {3, 1, 2, 4, 5, 2};
        int sum = 7;
        printTwoNum(array, sum);
    }

    public static void printTwoNum(int[] a, int sum) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] + a[j] == sum) {
                    System.out.println("a[" + i + "]=" + a[i] +
                            ",a[" + j + "]=" + +a[j]);
                }
            }
        }
    }
}
