package com.idlefish;


import java.util.ArrayList;

/**
 * Created by <邻云> hongyun.mhy
 * on 2017/1/6
 */

public class TestEnum {
    public static void main(String[] args) {
        System.out.println(Test.V1111.ordinal());

        int intValue = (int)Long.MAX_VALUE;

        System.out.println(intValue);

        ArrayList<String> arrayList = new ArrayList<>(8);

        System.out.println(""+arrayList.size());
    }

    public enum Test {
        V1111,
        V3333
    }
}
