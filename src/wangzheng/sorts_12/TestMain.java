package sorts_12;

public class TestMain {
    public static void main(String[] args) {
        int[] testArray = new int[]{6, 11, 3, 9, 8};
//        QuickSort.quickSort(testArray,testArray.length);
        QuickSort.quickSortAndy(testArray,testArray.length);
        PrintUtils.printArray(testArray);
    }
}
