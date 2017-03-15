package com.idlefish;


import java.util.HashMap;
import java.util.Map;

/**
 * Created by <邻云> hongyun.mhy
 * on 2017/1/6
 */

public class TestMapEntry {
    public static void main(String[] args) {
        HashMap map = new HashMap(12);
        map.put("abc", "123");
        map.put(new Integer(12), "bcd");
        for (Object obj :
                map.entrySet()) {
            HashMap.Entry entry = (HashMap.Entry) obj;
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }
}
