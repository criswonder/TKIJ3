package com.tmall.wireless;

/**
 * Created by hongyunmhy on 15/3/25.
 */
public class TestCommon {
    public static void main(String[] args) {
//        for(int i=0;i<300;i++){
//            if(getRetBySamplingRate(100)){
//                System.out.println("hit");
//            }
//        }
        Object params = "";
        System.out.println(params==null?"":params.toString());

        params = new Object();
        System.out.println(params == null ? "" : params.toString());

        Item cItem = new Item();
        System.out.println( String.format("cItem=%s,cItem.params=%s",
                cItem, cItem == null ? null : cItem.params));
        cItem =null;
        System.out.println( String.format("cItem=%s,cItem.params=%s",
                cItem, cItem == null ? null : cItem.params));
         int iconfont_homepage_selected_x=0x3a0801f8;
          int iconfont_homepage_x=0x3a0801f7;

        if(params==null||params.toString()==""){
            System.out.println("xxxx!!!");
        }
        /**
         *       public static int iconfont_homepage_selected_x=0x3a0801f8;
         public static int iconfont_homepage_x=0x3a0801f7;
         */
        System.out.println(Integer.parseInt("3a0801f8",16));
        System.out.println(Integer.parseInt("3a0801f7",16));
        System.out.println(Integer.parseInt("3a040001",16));
        System.out.println(Integer.parseInt("3a040000",16));

    }

    public static class Item{
        public String params;
    }

    public static boolean getRetBySamplingRate(int rate) {
        boolean   flag = (int) (Math.random() * 100) % rate == 0;;// 百分之1
        return flag;
    }
}
