package binarysearch;

import org.junit.Test;

public class BinarySearch16 {
    public static void main(String[] args) {
//        test0();

//        int[] test1 = {1, 2, 3, 3, 3, 4, 5, 6};
//        int index = binarySearch16.bsearch1(test1, test1.length, 3);
//        System.out.println(String.format("第一个等于给定值得数的index=%d", index));
//
//        index = binarySearch16.bsearch2(test1, test1.length, 3);
//        System.out.println(String.format("最后一个值等于给定值的元素的index=%d", index));

//        test4();
    }

    private static void test0() {
        BinarySearch16 binarySearch16 = new BinarySearch16();
        int[] test1 = {1, 2, 3, 3, 3, 4, 5, 6};

        int index = binarySearch16.bsearch(test1, test1.length, 15);
        assert index == -1;
        index = binarySearch16.bsearch(test1, test1.length, 5);
        assert index == 6;
    }

    //变体四：查找最后一个小于等于给定值的元素。
    // eg:2,3,4,7中最后一个小于等于5的应该是4
    // eg:2,3,4,7中最后一个小于等于8的应该是7
    // eg:2,3,4,4,7中最后一个小于等于4的应该是第二个4
    @Test
    public void test4() {
        int index = -1;
        BinarySearch16 binarySearch16 = new BinarySearch16();
        int[] test1 = new int[]{2, 3, 4, 7};
        index = binarySearch16.bsearch4(test1, test1.length, 5);
        assert index == 2;

        test1 = new int[]{2, 3, 4, 7};
        index = binarySearch16.bsearch4(test1, test1.length, 8);
        assert index == 3;

        test1 = new int[]{2, 3, 4, 4, 7};
        index = binarySearch16.bsearch4(test1, test1.length, 4);
        assert index == 3;
    }

    public int bsearch(int[] a, int n, int value) {
        int low = 0;
        int high = n - 1;
        while (low <= high) {
            int mid = low + ((high - low) >> 1);
            if (a[mid] == value) {
                return mid;
            } else if (a[mid] > value) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }


    //变体一：查找第一个值等于给定值的元素
    public int bsearch1(int[] a, int n, int value) {
        int low = 0;
        int high = n - 1;
        while (low <= high) {
            int mid = low + ((high - low) >> 1);
            if (a[mid] > value) {
                high = mid - 1;
            } else if (a[mid] < value) {
                low = mid + 1;
            } else {
                if ((mid == 0) || (a[mid - 1] != value)) return mid;
                else high = mid - 1;
            }
        }
        return -1;
    }

    //变体二：查找最后一个值等于给定值的元素
    public int bsearch2(int[] a, int n, int value) {
        int low = 0;
        int high = n - 1;
        while (low <= high) {
            int mid = low + ((high - low) >> 1);
            if (a[mid] > value) {
                high = mid - 1;
            } else if (a[mid] < value) {
                low = mid + 1;
            } else {
                if ((mid == n - 1) || (a[mid + 1] != value)) return mid;
                else low = mid + 1;
            }
        }
        return -1;
    }

    //变体三：查找第一个大于等于给定值的元素。eg:2，3，4，5中第一个大于等于3的元素，应该是3
    public int bsearch3(int[] a, int n, int value) {
        int low = 0;
        int high = n - 1;
        while (low <= high) {
            int mid = low + ((high - low) >> 1);
            if (a[mid] >= value) {
                if ((mid == 0) || (a[mid - 1] < value)) return mid;
                else high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    //变体四：查找最后一个小于等于给定值的元素。
    // eg:2,3,4,7中最后一个小于等于5的应该是4
    // eg:2,3,4,7中最后一个小于等于8的应该是7
    // eg:2,3,4,4,7中最后一个小于等于4的应该是第二个4
    public int bsearch4(int[] a, int n, int value) {
        return -1;
    }

//    public int bsearch4(int[] a, int n, int value) {
//        int low = 0;
//        int high = n - 1;
//        while (low <= high) {
//            int mid = low + ((high - low) >> 1);
//            if (a[mid] > value) {
//                high = mid - 1;
//            } else {
//                if ((mid == n - 1) || (a[mid + 1] > value)) return mid;
//                else low = mid + 1;
//            }
//        }
//        return -1;
//    }
}
