package sorts_12;

/**
 * Created by wangzheng on 2018/10/16.
 */
public class QuickSort {

    // 快速排序，a是数组，n表示数组的大小
    public static void quickSort(int[] a, int n) {
        quickSortInternally(a, 0, n - 1);
    }

    // 快速排序递归函数，p,r为下标
    private static void quickSortInternally(int[] a, int p, int r) {
        if (p >= r) return;

        int q = partition(a, p, r); // 获取分区点
        quickSortInternally(a, p, q - 1);
        quickSortInternally(a, q + 1, r);
    }

    private static int partition(int[] a, int p, int r) {
        int pivot = a[r];
        int i = p;
        for (int j = p; j < r; ++j) {
            if (a[j] < pivot) {
                if (i == j) {
                    ++i;
                } else {
                    int tmp = a[i];
                    a[i++] = a[j];
                    a[j] = tmp;
                }
            }
        }

        int tmp = a[i];
        a[i] = a[r];
        a[r] = tmp;

//        System.out.println("i=" + i);
        return i;
    }


    //for test purpose
    public static void quickSortAndy(int[] array, int n) {
        quickSortInternallyAndy(array, 0, n - 1);
    }

    private static void quickSortInternallyAndy(int[] array, int i, int j) {
        if (i >= j) {
            return;
        }

        int m = partitionAndy(array, i, j);

        quickSortInternallyAndy(array, i, m - 1);
        quickSortInternallyAndy(array, m + 1, j);
    }

    private static int partitionAndy(int[] array, int i, int j) {
        int pivot = array[j];
        int i1 = i;
        for (int j1 = i; j1 < j; j1++) {
            if (array[j1] < pivot) {
                //swap j1 and i1
                int temp = array[i1];
                array[i1] = array[j1];
                array[j1] = temp;
                i1++;
            }
        }

        int tmp = array[i1];
        array[i1] = pivot;
        array[j] = tmp;
        return i1;
    }
}