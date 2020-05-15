package com.idlefish;

import java.text.DecimalFormat;

/**
 * Created by hongyun
 * on 28/09/2017
 */

public class TestHexNums {
    public static void main(String[] args) {
        String hex = Integer.toHexString(11);

        System.out.println("hex=" + hex);

        String hex2 = String.format("%02x", 11);
        System.out.println("hex2=" + hex2);

        float filesize = 21024.678f * 1024 * 1024;
        float result = filesize / 1024 / 1024f;

//        long filesize = 788000;
//        float result = filesize / 1024 / 1024f;

        DecimalFormat decimalFormat = new DecimalFormat("0.00M");
        String p = decimalFormat.format(result);

        System.out.println("p=" + p);

        String str = "rotate:0;os:A;f:胖不起来的刀鱼;fps:25;dpic:null;clt:23.9s;csz:13.70M;bit:4.0Mb;fsz:20.53M;m:舒缓-Ukulele Beach;v:5.9.4.4.9999;osz:98.04M;width:720;vver:2;height:1280";
        System.out.println(str.length());
    }
}
