package sorts_12;

public class PrintUtils {
    public static <T extends Object> void printArray(T[] array) {
        if (array == null) {
            return;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            sb.append(i);
        }

        System.out.println(sb.toString());
    }

    public static void printArray(int[] array) {
        if (array == null) {
            return;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            sb.append(array[i]);
            sb.append(",");
        }
        sb.deleteCharAt(sb.length() - 1);

        System.out.println(sb.toString());
    }
}
