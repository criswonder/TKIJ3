package com.idlefish;

public class TestStaticFieldShare {
    public static void main(String[] args) {
        ShareUtil.setObject("abcccccccc");

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                Object object = ShareUtil.getObject();
                if (object != null) {
                    try {
                        Thread.sleep(800);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    System.out.printf(""+object);
                }

            }
        });
        thread.start();


        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                ShareUtil.setObject(null);
            }
        });
        thread2.start();

    }
}

class ShareUtil{
    private static Object sObj;
    public static void setObject(Object object) {
        sObj = object;
    }

    public static Object getObject() {
        return sObj;
    }

}
