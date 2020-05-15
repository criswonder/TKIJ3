package com.hongyun;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * Created by hongyun
 * on 20/03/2017
 */

public class Program7_9 {
    private static final ScheduledExecutorService cancelExec = Executors.newSingleThreadScheduledExecutor();

    public static void timedRun(final Runnable r,
                                long timeout, TimeUnit unit) throws InterruptedException {
        class RethrowableTask implements Runnable {
            private volatile Throwable t;

            public void run() {
                try {
                    r.run();
                } catch (Throwable e) {
                    this.t = e;
                }
            }

            void rethrow() {
                if (t != null) {
                    //TODO
                }
            }
        }

        RethrowableTask task = new RethrowableTask();
        final Thread taskThread = new Thread(task);
        taskThread.start();
        cancelExec.schedule(new Runnable() {
            @Override
            public void run() {
                taskThread.interrupt();
            }
        }, timeout, unit);
        taskThread.join(unit.toMillis(timeout));
        task.rethrow();
    }
}
