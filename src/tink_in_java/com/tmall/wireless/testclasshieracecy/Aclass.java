package com.tmall.wireless.testclasshieracecy;

import java.io.UnsupportedEncodingException;

/**
 * Created by hongyunmhy on 15/5/6.
 */
public class Aclass extends Bclass{
    @Override
    public void sendRequest(){
        super.sendRequest();
    }

    public static void main(String[] args) {
//        Aclass a =new Aclass();
//        a.sendRequest();
//        String str1 = "123@@@@@true@@@@@45678";
//        String s = "@@@@@";
//        System.out.println(str1.substring(0, str1.indexOf(s)));
//        int i = str1.indexOf(s);
//        System.out.println(i);
//        System.out.println(str1.substring(str1.indexOf(s) + 5));
//
//        int i2 = str1.indexOf(s, i + 5);
//        System.out.println(str1.substring(i+5,i2));
//        System.out.println(str1.substring(i2 +5));

//        try {
//            String date = "1431330762615@@@@@";
//            byte[] datas = date.getBytes("UTF-8");
//            System.out.println(datas.length);
//        } catch (UnsupportedEncodingException e) {
//            e.printStackTrace();
//        }

//        Long time = System.currentTimeMillis();
//        Long t1 = 123L;
//        t1.byteValue();

        System.out.print(stringEmpty(" "));
        System.out.print(stringEmpty(""));
        System.out.print(stringEmpty(null));

    }

    public static boolean stringEmpty(String str){
        return str==null?true:str.length()==0;
    }
}
