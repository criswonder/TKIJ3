package com.idlefish;

import java.util.ArrayList;

/**
 * Created by hongyun
 * on 22/06/2018
 */
public class TestArray {
    public static void main(String[] args) {
//        int[][] result = new int[][]{{
//                0, 1, 2, 3
//        }, {
//                3, 4, 5, 6
//        }
//        };
//
//        int[] salt = {333, 4444, 444444};
//        int[] newMergedArray = mergeTwoArray(result[0], salt);
//        for (int i = 0; i < newMergedArray.length; i++) {
//            System.out.println(newMergedArray[i]);
//        }

        ArrayList<Long> arrayList = new ArrayList<>(6);

        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(1,122l);
    }


    private static int[] mergeTwoArray(int[] array1, int[] array2) {
        int[] newMergedArray = new int[array1.length + array2.length];
        System.arraycopy(array1, 0, newMergedArray, 0, array1.length);
        System.arraycopy(array2, 0, newMergedArray, array1.length, array2.length);
        return newMergedArray;
    }
}
