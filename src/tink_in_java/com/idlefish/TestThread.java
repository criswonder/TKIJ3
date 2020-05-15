package com.idlefish;

import java.util.ArrayList;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by hongyun
 * on 16/10/2017
 */

public class TestThread {
    public static ArrayBlockingQueue<CountDownLatch> latches = new ArrayBlockingQueue<CountDownLatch>(1000);

    public static ArrayList<Integer> arrayList = new ArrayList<Integer>();

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(6);

        for (int i = 0; i < 10000000; i++) {
            final int j = i;
            executorService.submit(new Runnable() {
                @Override
                public void run() {
//                    System.out.println("thead=" + Thread.currentThread().getName() + ",j=" + j);

                    CountDownLatch latch = new CountDownLatch(1);
                    latches.add(latch);

                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    StringBuffer stringBuffer = new StringBuffer();
                    for (int k = 0; k < arrayList.size(); k++) {
                        stringBuffer.append(arrayList.get(k));
                        stringBuffer.append(",");
                    }
//                    System.out.println("start array=" + stringBuffer.toString());
                    arrayList.add(j);
                    stringBuffer.delete(0, stringBuffer.length());
                    for (int k = 0; k < arrayList.size(); k++) {
                        stringBuffer.append(arrayList.get(k));
                        stringBuffer.append(",");
                    }
//                    System.out.println("end array=" + stringBuffer.toString());

//                    try {
//                        latch.await();
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }

//                    System.out.println("thread wake up after await");
                }
            });
        }

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    try {
                        CountDownLatch countDownLatch = latches.take();
                        countDownLatch.countDown();

                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        thread.setDaemon(true);
        thread.start();


        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    try {
                        if (arrayList.size() > 0) {
                            arrayList.remove(0);
                            System.out.println("remove in thread2");
                        }
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        thread2.start();

        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    try {
                        if (arrayList.size() > 0) {
                            arrayList.remove(arrayList.size()-1);
                            System.out.println("remove in thread3");
                        }
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        thread3.start();

//        executorService.submit(new Runnable() {
//            @Override
//            public void run() {
//
//            }
//        });

    }


}
