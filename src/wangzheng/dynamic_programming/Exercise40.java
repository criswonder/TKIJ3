package dynamic_programming;

public class Exercise40 {
    private static int[][] data = {
            {5},
            {7, 8},
            {2, 3, 4},
            {4, 9, 6, 1},
            {5, 7, 9, 4, 5}};

    public static void main(String[] args) {
        int[] tmpSum = new int[data.length];
        tmpSum[0] = data[0][0];
        int row = 1;
        int preLevelLen = 1;
        while (row < data.length) {
            int j = 0;
            int[] tmpSumCopy = new int[data.length];
            while (j <= row) {
                int currentNode = data[row][j];
                if (j >= preLevelLen) {
                    tmpSumCopy[j] = tmpSum[j - 1] + currentNode;
                } else if (j == 0) {
                    tmpSumCopy[j] = tmpSum[j] + currentNode;
                } else {
                    tmpSumCopy[j] = Math.min(tmpSum[j - 1], tmpSum[j]) + currentNode;
                }
                j++;
            }
            for (int i = 0; i < data.length; i++) {
                tmpSum[i] = tmpSumCopy[i];
            }

            row++;
            preLevelLen = row;
        }

        int min = tmpSum[0];
        for (int i = 1; i < tmpSum.length; i++) {
            if (tmpSum[i] < min) min = tmpSum[i];
        }

        System.out.println(min);
    }


}
