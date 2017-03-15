package com.idlefish;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

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

//        String str1 ="abcdef";
//        String str2 ="abcdef";
//        System.out.println(str1.hashCode());
//        System.out.println(str2.hashCode());
//
//        HashMap<String,String> maps = new HashMap<String,String>();
//        maps.put("k1","asbc");
//        maps.put("k2","abc");
//        System.out.printf(maps.toString());

//        testArrayListAdd();

        String[] strs = "abc".split(";");
        System.out.println("strs="+strs.length);
    }

    private static void testArrayListAdd() {
        ArrayList<String> arrayList = new ArrayList<>(12);
//        arrayList.ensureCapacity(12);
        Collections.fill(arrayList,null);
        System.out.println(arrayList);
//        arrayList.add(10,"abc");

        String[] strings = new String[12];
        List<String> arrayList2 =  Arrays.asList(strings);
        System.out.println(strings);
        strings[10] = "fkyou";
        System.out.println(strings);
        System.out.println(arrayList2);
        Collections.fill(arrayList,null);
    }
}
