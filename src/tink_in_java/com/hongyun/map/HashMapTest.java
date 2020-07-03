package com.hongyun.map;

import java.util.HashMap;

public class HashMapTest {
    public static void main(String[] args) {
//        HashMap<Bean, String> map = new HashMap<>();
//        Bean key1 = new Bean(1);
//        Bean key2 = new Bean(2);
//        map.put(key1, "abc");
//        map.put(key2, "bdf");
//        System.out.println(map);

        HashMap<Integer, Bean> map1 = new HashMap<>();
        map1.put(1, new Bean(3));
        map1.put(2, new Bean(4));
        System.out.println(map1);
    }

    static class Bean {
        private int val;

        public Bean(int val) {
            this.val = val;
        }

        @Override
        public int hashCode() {
            System.out.println("this is hashcode");
            return super.hashCode();
        }

        @Override
        public boolean equals(Object obj) {
            System.out.println("this is equals");
            return super.equals(obj);
        }
    }
}
