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
		int[][] matrix = AssortedMethods.randomMatrix(7, 7, 0, 9);
		AssortedMethods.printMatrix(matrix);
		rotate(matrix, 7);
		System.out.println();
		AssortedMethods.printMatrix(matrix);
	}

}
