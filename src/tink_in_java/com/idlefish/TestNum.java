package com.idlefish;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Created by <邻云> hongyun.mhy
 * on 2016/12/22
 */

public class TestNum {
    public static void main(String[] args) {
        System.out.println(getReadableNumString("10199"));
        System.out.println(getReadableNumString("21999"));
        System.out.println(getReadableNumString("14899"));
//        System.out.println(getReadableNumString("10001"));
//        System.out.println(getReadableNumString("2346701"));
//        System.out.println(getReadableNumString("452001"));

    }

    public static String getReadableNumString(String str) {
        if (str != null && str.length() > 0) {
            try {
                Long num = Long.parseLong(str);
                int w = 10000;
                if (num >= w) {
                    Float floatNum = num /( w * 1F);
//                    System.out.println(floatNum);
                    BigDecimal bd = new BigDecimal(floatNum);
                    bd = bd.setScale(1, RoundingMode.HALF_UP);
                    return bd.toString() + "万";
                } else {
                    return num.toString();
                }
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }
        return "0";
    }

}
