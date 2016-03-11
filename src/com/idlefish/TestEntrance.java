package com.idlefish;

/**
 * Created by hongyun on 16/3/11.
 */
public class TestEntrance {
    public static void main(String[] args) {
        try{
            System.out.println("111");
            Object obj = null;
            obj.hashCode();
            System.out.println("111");
        }finally {
            System.out.print("xxx");
        }
    }
}
