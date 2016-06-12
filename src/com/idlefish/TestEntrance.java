package com.idlefish;

import java.util.HashMap;

/**
 * Created by hongyun on 16/3/11.
 */
public class TestEntrance {
    public static void main(String[] args) {
//        try{
//            System.out.println("111");
//            Object obj = null;
//            obj.hashCode();
//            System.out.println("111");
//        }finally {
//            System.out.print("xxx");
//        }
        String str1 ="abcdef";
        String str2 ="abcdef";
        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());

        HashMap<String,String> maps = new HashMap<String,String>();
        maps.put("k1","asbc");
        maps.put("k2","abc");
        System.out.printf(maps.toString());
    }
}
