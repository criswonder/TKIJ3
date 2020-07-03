package com.hongyun.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

//ConcurrentHashMap使用要点 https://www.cnblogs.com/zhuawang/p/4779649.html
public class ConcurrentModification {
    public static void main(String[] args) {
    }

    private static void HashMapDeleteInLoopWithIterator() {
        Map<Long, String> mReqPacket = new HashMap<Long, String>();
        for (long i = 0; i < 15; i++) {
            mReqPacket.put(i, i + "");
        }

        for (Iterator<Map.Entry<Long, String>> iterator = mReqPacket.entrySet().iterator(); iterator.hasNext();) {
            Map.Entry<Long, String> entry = iterator.next();
            long key = entry.getKey();
            if (key < 10) {
                iterator.remove();
            }
        }

        for (Map.Entry<Long, String> entry : mReqPacket.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
    private static void HashMapDeleteInLoop() {
        Map<Long, String> mReqPacket = new HashMap<Long, String>();
        for (long i = 0; i < 15; i++) {
            mReqPacket.put(i, i + "");
        }

        for (Map.Entry<Long, String> entry : mReqPacket.entrySet()) {
            long key = entry.getKey();
            String value = entry.getValue();
            if (key < 10) {
                mReqPacket.remove(key);
            }
        }

        for (Map.Entry<Long, String> entry : mReqPacket.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
    private static void ConcurrentHashMapDeleteInLoop() {
        Map<Long, String> conMap = new ConcurrentHashMap<Long, String>();
        for (long i = 0; i < 15; i++) {
            conMap.put(i, i + "");
        }

        for (Map.Entry<Long, String> entry : conMap.entrySet()) {
            long key = entry.getKey();
            if (key < 10) {
                conMap.remove(key);
            }
        }

        for (Map.Entry<Long, String> entry : conMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
