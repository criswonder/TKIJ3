package com.idlefish;

/**
 * Created by hongyun
 * on 04/05/2017
 * LCK01-J. Do not synchronize on objects that may be reused
 * https://www.securecoding.cert.org/confluence/display/java/LCK01-J.+Do+not+synchronize+on+objects+that+may+be+reused
 */

public class TestInteger {
    public static Integer a = Integer.valueOf(1);
    ;
    public static Integer b = Integer.valueOf(5);

    public static void main(String[] args) {
//        test1();
//        swap(321,123);

        double d2 = 0.334;
        System.out.println(d2);
    }

    public static void swap(int a, int b) {
        System.out.println(" a = " + a);
        System.out.println(" b = " + b);
        // 写法一：以a作为临时变量
//     a=a^b;
//     b=b^a;
//     a=b^a;
        // 写法二：以b作为临时变量
        b = a ^ b;
        a = a ^ b;
        b = a ^ b;
        System.out.println(" a = " + a);
        System.out.println(" b = " + b);
    }

    private static void test1() {
        TestInteger obj = new TestInteger();
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 23; i++) {
                    synchronized (a) {
                        a++;
                        System.out.println("thread hahah a=" + a);
                        try {
                            Thread.sleep(100);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }

            }
        });
        thread.start();

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (b) {
                    System.out.println("thread hahah 222");
                    try {
                        Thread.sleep(30000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        thread2.start();
    }
}
