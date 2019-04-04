package com.idlefish;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/**
 * Created by <邻云> hongyun.mhy
 * on 2017/1/6
 */

public class TestFunMethod {
    public static void main(String[] args) {
        int[] intArray = new int[]{1,2,3,4,5,6,2,3,9};

        int[] sumTarget = findSumTarget(intArray, 7);

        if (sumTarget != null) {
            for (int i = 0; i < sumTarget.length; i++) {
                System.out.println(sumTarget[i]);
            }
        }
    }

    /**
     *[1,2,3,4,5,6,2,3,9] [7]
     *1,[2,3,4,5,6,2,3,9] [6]
     *1,2,[3,4,5,6,2,3,9] [4]
     *1,2,3,[4,5,6,2,3,9] [1]
     */
    public static int[] findTargets(int[] inputs,int target){
        return null;
    }


    public static int[] findSumTarget(int[] inputArray, int target) {
        if (inputArray == null || inputArray.length == 0) {
            return null;
        }
        List<Integer> resultList = new ArrayList<>();

        boolean find = false;
        for (int i = 0; i < inputArray.length; i++) {
            if (find) {
                resultList.add(10000);
            }
            int base = inputArray[i];
            if (base == target) {
                resultList.add(base);
                break;
            }

            for (int j = i+1; j < inputArray.length; j++) {
                int add = inputArray[j];
                if (add + base == target) {
                    resultList.add(inputArray[i]);
                    resultList.add(inputArray[j]);
                    find = true;
                    break;
                }else if(add + base>target){
                    continue;
                }else{
                    if (j != inputArray.length - 1) {
                        int[] childInputArray = new int[inputArray.length-j-1];
                        System.arraycopy(inputArray,j+1 ,childInputArray,0,childInputArray.length);
                        int[] sumTarget = findSumTarget(childInputArray,
                                target - inputArray[i] - inputArray[j]);
                        if(sumTarget!=null){
                            resultList.add(inputArray[i]);
                            resultList.add(inputArray[j]);
                            for (int k = 0; k < sumTarget.length; k++) {
                                resultList.add(sumTarget[k]);
                            }

                            find =true;
                            break;
                        }else{
                            continue;
                        }

                    }else{
                        break;
                    }

                }
            }
        }

        if(resultList.size()>0){
            int[] resultIntArray = new int[resultList.size()];
            for (int i = 0; i < resultList.size(); i++) {
                resultIntArray[i] = resultList.get(i);
            }
            return resultIntArray;
        }else{
            return null;
        }
    }
 }
