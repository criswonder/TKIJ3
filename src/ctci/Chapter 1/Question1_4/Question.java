package Question1_4;

import CtCILibrary.AssortedMethods;
//1.5 Write a method to replace all spaces in a string with ‘%20’.
public class Question {
	// Assume string has sufficient free space at the end
	//从后面替换，写入的位置都是原位置不需要的位置
	public static void replaceSpaces(char[] str, int length) {
		int spaceCount = 0, index, i = 0;
		for (i = 0; i < length; i++) {
			if (str[i] == ' ') {
				spaceCount++;
			}
		}
		index = length + spaceCount * 2;
		str[index] = '\0';
		for (i = length - 1; i >= 0; i--) {
			if (str[i] == ' ') {
				str[index - 1] = '0';
				str[index - 2] = '2';
				str[index - 3] = '%';
				index = index - 3;
			} else {
				str[index - 1] = str[i];
				index--;
			}
		}
	}

	// 尝试从前面替换写入，会发现问题，如果遇到空格需要写三个char，这些会把不是空格的char覆盖掉，只用一个char[]是有问题的，除非像从后面写入一样，在前面添加 空格数x3 的位置
	public static void replaceSpaces2(char[] str, int length) {
		int spaceCount = 0, index, i = 0;
		for (i = 0; i < length; i++) {
			if (str[i] == ' ') {
				spaceCount++;
			}
		}
		index = length + spaceCount * 2;
		str[index] = '\0';
		for (i = length - 1; i >= 0; i--) {
			if (str[i] == ' ') {
				str[index - 1] = '0';
				str[index - 2] = '2';
				str[index - 3] = '%';
				index = index - 3;
			} else {
				str[index - 1] = str[i];
				index--;
			}
		}
	}
	
	public static void main(String[] args) {
		String str = "abc d e f";
		int strLength = str.length();
		int newCharLength = strLength + 3 * 2 + 1;
		char[] arr = new char[newCharLength];
		for (int i = 0; i < strLength; i++) {
			arr[i] = str.charAt(i);
		}
		replaceSpaces(arr, strLength);
		String resultString = AssortedMethods.charArrayToString(arr);
		System.out.println("strLength=" +strLength+",newCharLength="+newCharLength+",resultString.length="+resultString.length());
		System.out.println("\"" + resultString + "\"");
//		String str2 = "abc d e f";
//		System.out.println(str2.replace(" ","%20"));
		int a = '\1';
		int char1 = 'a';
		System.out.println(char1);

	}
}
