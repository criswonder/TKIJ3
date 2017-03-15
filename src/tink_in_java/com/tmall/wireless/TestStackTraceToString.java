package com.tmall.wireless;

import com.taobao.test.you.ClassName;

/**
 * Created by hongyunmhy on 15-2-6.
 */
public class TestStackTraceToString {
    public static void main(String args[]){
        try {
            throw new NullPointerException("fuckkkk");
        }catch (Exception ex){
        }

        System.out.println(ClassName.class.getName());
    }
}
