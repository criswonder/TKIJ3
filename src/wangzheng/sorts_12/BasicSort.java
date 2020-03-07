package sorts_12;

public class BasicSort {
    public static void main(String[] args) {
//        int[] testArray = {33, 31, 40, 90, 22, 9, 33, 88, 68, 81};
        int[] testArray = {90, 88, 81, 68, 40, 33, 33, 31, 22, 9};


//        PrintUtils.printArray(testArray);
//        insertSort(testArray, testArray.length - 1);
//        bubbleSort(testArray, testArray.length - 1);
//        insertSort2(testArray);
//        insertSort3(testArray);
        bubbleSortAndy(testArray, testArray.length);
        PrintUtils.printArray(testArray);
//        int[] testArray2 = {33, 31, 40, 90, 22, 9, 33, 88, 68, 81};
//        PrintUtils.printArray(testArray2);
    }

    public static void insertSort3(int[] a) {
        if (a == null || a.length <= 1) {
            return;
        }

        for (int i = 1; i < a.length; i++) {
            int value = a[i];
            int j = i - 1;
            for (; j >= 0; j--) {
                if (a[j] > value) {
                    a[j + 1] = a[j];
                } else {
                    break;
                }
            }
            a[j + 1] = value;
        }
    }

    /**
     * {33, 31, 40, 90, 22, 9, 33, 88, 68, 81};
     * 思考一：{31,33,40,22,9,33,88,68,81,90} 这样一种情况，数组本来就是有序的，思考一下插入的过程，时间复杂度就是O(n)
     * 思考二：{1, 2, 3, [1], 22, 9, 33, 88, 68, 81}; 1插入的过程
     *
     * @param a
     * @param n
     */
    public static void insertSort(int[] a, int n) {
        if (n <= 1) return;

        for (int i = 1; i <= n; i++) {
            int value = a[i];
            int j = i - 1;
            for (; j >= 0; j--) {
                if (value < a[j]) {//这里一定不要用a[i] 因为这个地方会被覆盖，例如j=i-1的时候 a[j+1]=a[j]这句就会覆盖这个值
                    a[j + 1] = a[j];
                } else {
                    break;
                }
            }

            a[j + 1] = value;
        }

//        if (n <= 1) return;
//
//        for (int i = 1; i < n; ++i) {
//            int value = a[i];
//            int j = i - 1;
//            // 查找插入的位置
//            for (; j >= 0; --j) {
//                if (a[j] > value) {
//                    a[j + 1] = a[j];  // 数据移动
//                } else {
//                    break;
//                }
//            }
//            a[j + 1] = value; // 插入数据
//        }
    }

    public static void bubbleSortAndy(int[] a, int n) {
        if (n <= 1) {
            return;
        }

        for (int i = 0; i < n - 2; i++) {
            boolean hasElementSwitch = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int tmp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = tmp;
                    hasElementSwitch = true;
                }
            }

            if (!hasElementSwitch) {
                System.out.println("i=" + i);
                break;
            }
        }
    }

    // 冒泡排序，a 表示数组，n 表示数组大小
    public void bubbleSort(int[] a, int n) {
        if (n <= 1) return;

        for (int i = 0; i < n; ++i) {
            // 提前退出冒泡循环的标志位
            boolean flag = false;
            for (int j = 0; j < n - i - 1; ++j) {
                if (a[j] > a[j + 1]) { // 交换
                    int tmp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = tmp;
                    flag = true;  // 表示有数据交换
                }
            }
            if (!flag) break;  // 没有数据交换，提前退出
        }
    }


    // 插入排序，a 表示数组，n 表示数组大小
    public void insertionSort(int[] a, int n) {
        if (n <= 1) return;

        for (int i = 1; i < n; ++i) {
            int value = a[i];
            int j = i - 1;
            // 查找插入的位置
            for (; j >= 0; --j) {
                if (a[j] > value) {
                    a[j + 1] = a[j];  // 数据移动
                } else {
                    break;
                }
            }
            a[j + 1] = value; // 插入数据
        }
    }

}
