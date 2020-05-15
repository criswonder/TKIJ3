package com.tmall.wireless;

import java.util.ArrayList;

/**
 * Created by hongyunmhy on 15-3-20.
 */
public class TestArrayList {
    public static final int TYPE_USER_INFO_TRADE = 1;
    public static final int TYPE_USER_INFO_TMALL = 1 << 1;
    public static final int TYPE_USER_INFO_SHOP_COUNT = 1 << 2;
    public static void main(String[] args) {
//        ArrayList<Integer> lst = new ArrayList<Integer>(2);
//        lst.add(1);
//        lst.add(2);
//        lst.add(3);
//        lst.add(4);
//
//        System.out.print(lst.size());
//
//        int i=1;
//        int b = 0 >>> 2;
//        System.out.print(b);

        System.out.println(TYPE_USER_INFO_TMALL);
        System.out.println(TYPE_USER_INFO_SHOP_COUNT);

        System.out.println(TYPE_USER_INFO_TRADE & TYPE_USER_INFO_TRADE);
        System.out.println(TYPE_USER_INFO_TRADE & TYPE_USER_INFO_TMALL);

    }
}
