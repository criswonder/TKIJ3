package Question5_1;

import CtCILibrary.AssortedMethods;
//5.1 You are given two 32-bit numbers, N and M, and two bit positions, i and j. Write a method to set all bits
// between i and j in N equal to M (e.g., M becomes a substring of N located at i and starting at j).
// EXAMPLE: Input: N = 10000000000, M = 10101, i = 2, j = 6 Output: N = 10001010100
public class Question {

	public static int updateBits(int n, int m, int i, int j) {
		// Validation
		if (i >= 32 || j < i) {
			return 0;
		}
		
		/* Create a mask to clear bits i through j in n
		/* EXAMPLE: i = 2, j = 4. Result should be 11100011.
		 * (Using 8 bits for this example.  This is obviously not actually 8 bits.)
		 */
		int allOnes = ~0; // allOnes = 11111111
		
		int left = allOnes << (j + 1); // 1s through position j, then 0s. left = 11100000	
	  	int right = ((1 << i) - 1); // 1�s after position i.  right = 00000011
		int mask = left | right; // All 1s, except for 0s between i and j. mask = 11100011

		/* Clear i through j, then put m in there */
		int n_cleared = n & mask; // Clear bits j through i.
		int m_shifted = m << i; // Move m into correct position.
		
		/* OR them, and we're done! */
		return n_cleared | m_shifted; 
	}
	
	public static void main(String[] args) {
		int a = 103217;
		System.out.println(AssortedMethods.toFullBinaryString(a));
		int b = 13;
		System.out.println(AssortedMethods.toFullBinaryString(b));
		int c = updateBits(a, b, 4, 12);
		System.out.println(AssortedMethods.toFullBinaryString(c));


		//下面是我的测试代码
//		int test =(( 1 << 4)-1);
//		System.out.println(AssortedMethods.toFullBinaryString(test));
//		int test2 = 1 << 4;
//		System.out.println(AssortedMethods.toFullBinaryString(test2));
	}

}
