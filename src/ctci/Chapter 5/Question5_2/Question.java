package Question5_2;

/*
原文：

Given a (decimal - e.g. 3.72) number that is passed in as a string, print the binary representation.
If the number can not be represented accurately in binary, print “ERROR”.

译文：

给定一个字符串类型(string)表示的小数，打印出它的二进制表示。 如果这个数无法精确地表示为二进制形式，输出”ERROR”
* */
public class Question {
	public static String printBinary(double num) {
		if (num >= 1 || num <= 0) {
			return "ERROR";
		}
	
		StringBuilder binary = new StringBuilder();
		binary.append(".");
		while (num > 0) {
			/* Setting a limit on length: 32 characters */
			if (binary.length() > 32) {
				return "ERROR";
			}
			double r = num * 2;
			if (r >= 1) {
				binary.append(1);
				num = r - 1;
			} else {
				binary.append(0);
				num = r;
			}
		}
		return binary.toString();
	}

	//这个我比较看的懂一点
	public static String printBinary2(double num) {
		if (num >= 1 || num <= 0) {
			return "ERROR";
		}
	
		StringBuilder binary = new StringBuilder();
		double frac = 0.5;
		binary.append(".");
		while (num > 0) {
			/* Setting a limit on length: 32 characters */
			if (binary.length() >= 32) {
				return "ERROR";
			}
			if (num >= frac) {
				binary.append(1);
				num -= frac;
			} else {
				binary.append(0);
			}
			frac /= 2;
		}
		return binary.toString();
	}	
	
	public static void main(String[] args) {
		String bs = printBinary(.125);
		System.out.println(bs);
		
		for (int i = 0; i < 1000; i++) {
			double num = i / 1000.0;
			String binary = printBinary(num);
			String binary2 = printBinary2(num);
			if (!binary.equals("ERROR") || !binary2.equals("ERROR")) {
				System.out.println(num + " : " + binary + " " + binary2);
			}
		}
	}
}
