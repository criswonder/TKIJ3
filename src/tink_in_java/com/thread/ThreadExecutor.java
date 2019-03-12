package com.thread;
import java.text.SimpleDateFormat;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;


/**
 * 线程池队列插队Demo，自定义线程池然后使用PriorityBlockingQueue类实现，
 *
 */

public class ThreadExecutor {
    public static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss::SSS");
    // public ExecutorService singleThreadExecutor =
    // Executors.newSingleThreadExecutor();

    static int count =0;
    public static void main(String[] args) {

        ThreadPoolExecutor executor = new ThreadPoolExecutor(2, 2, 1, TimeUnit.MILLISECONDS, new PriorityBlockingQueue<Runnable>());
        //模拟加入消息
        for (int i = 0; i < 5; i++) {
            System.out.println(ThreadExecutor.sdf.format(System.currentTimeMillis()) + "加入消息～～～加入队列第" + (++count) + "条消息！");
            executor.execute(new RunnablePriority(1));
        }


        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //模拟插入消息
        for (int i = 0; i < 5; i++) {

            System.out.println(ThreadExecutor.sdf.format(System.currentTimeMillis()) + "插入消息～～～～插入队列第" + (++count) + "条消息！");
            executor.execute(new RunnablePriority(5));
        }
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //结束
        executor.shutdown();
        try {
            executor.awaitTermination(1, TimeUnit.DAYS);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("over");
    }

}

