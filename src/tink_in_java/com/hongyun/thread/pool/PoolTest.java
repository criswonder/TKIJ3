package com.hongyun.thread.pool;

import java.util.concurrent.*;

//https://juejin.im/entry/593109e72f301e005830cd76
public class PoolTest {
    public static void main(String[] args) {
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(5);
        Executors.newCachedThreadPool();
        Executors.newFixedThreadPool(4);
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(
                2,
                100,
                10000,
                TimeUnit.MILLISECONDS,
                new LinkedBlockingDeque<>(190),
                new ThreadFactory() {
                    @Override
                    public Thread newThread(Runnable r) {
                        return null;
                    }
                },
                new RejectedExecutionHandler() {
                    @Override
                    public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {

                    }
                }
        );

        threadPoolExecutor.shutdown();
    }

}
