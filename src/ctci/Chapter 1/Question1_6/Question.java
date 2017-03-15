package Question1_6;

import CtCILibrary.*;

/**
 * Given an image represented by an NxN matrix, where each pixel in the image is 4 bytes,
 * write a method to rotate the image by 90 degrees. Can you do this in place?
 */
public class Question {

	//可以理解为，以中心点为圆心，一圈一圈的转动，如果边长为奇数，则刚好就是中心点不用转动
	public static void rotate(int[][] matrix, int n) {
		for (int layer = 0; layer < n / 2; ++layer) {
			System.out.println("layer loop: layer="+layer);
			int first = layer;
			int last = n - 1 - layer;
			for(int i = first; i < last; ++i) {
				int offset = i - first;
				int top = matrix[first][i]; // save top

				// left -> top
				int i1 = last - offset;
				matrix[first][i] = matrix[(i1)][first];

				// bottom -> left
				matrix[(i1)][first] = matrix[last][(i1)];

				// right -> bottom
				matrix[last][(i1)] = matrix[i][last];

				// top -> right
				matrix[i][last] = top; // right <- saved top
			}
		}
	}
	
	public static void main(String[] args) {
//		int[][] matrix = AssortedMethods.randomMatrix(7, 7, 0, 9);
		int[][] matrix = AssortedMethods.randomMatrix(6, 6, 0, 9);
		AssortedMethods.printMatrix(matrix);
		rotate2(matrix, 6);
		System.out.println();
		AssortedMethods.printMatrix(matrix);
	}

	//这个是我写的
	public static void rotate2(int[][] matrix, int n) {
		int outLoopCount = n/2;
		for (int i = 0; i < outLoopCount; i++) {
			int innerLoopCount = n - i -1;

			for (int j = i; j < innerLoopCount; j++) {
				int top = matrix[i][n-1-j];
				matrix[i][n-1-j] = matrix[j][i]; //left -> top
				matrix[j][i] = matrix[n-1-i][j];//bottom -> left
				matrix[n-1-i][j]= matrix[n-1-j][n-1-i];//right -> bottom
				matrix[n-1-j][n-1-i] = top;//top -> right
			}
		}
	}
}
