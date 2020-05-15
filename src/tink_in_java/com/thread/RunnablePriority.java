package com.thread;



/**
 * 优先级比较
 *
 */

public class RunnablePriority  implements Runnable, Comparable<RunnablePriority> {

    private int priority;

    public int getPriority() {
        return priority;
    }


    public RunnablePriority(int priority) {
        this.priority = priority;
    }


    @Override
    public int compareTo(RunnablePriority o) {
        // 复写此方法进行任务执行优先级排序
        // return priority < o.priority ? -1 : (priority > o.priority ? 1 : 0);
        // System.out.println(priority +"::"+ o.priority);
        if (this.getPriority() < o.priority) {
            return 1;
        }
        if(this.getPriority()>o.priority){
            return -1;
        }
        return 0;
    }

    @Override
    public void run() {
        System.out.printf("RunnablePriority: %s Priority :%d\n",Thread.currentThread().getName(),priority);
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // 执行任务代码..
    }

}
