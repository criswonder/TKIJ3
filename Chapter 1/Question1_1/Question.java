package Question1_1;

//1.1 Implement an algorithm to determine if a string has all unique characters.
// What if you can not use additional data structures?
public class Question {

	public static boolean isUniqueChars(String str) {
		if (str.length() > 128) {
			return false;
		}
		int checker = 0;
		for (int i = 0; i < str.length(); i++) {
			int val = str.charAt(i) - 'a';
			if ((checker & (1 << val)) > 0) return false;
			checker |= (1 << val);
		}
		return true;
	}


	public boolean isUniqueCharString(String str){
		int mask = 0;
		for (int i = 0; i < str.length(); i++) {
			int bit = str.charAt(i) - 'a';
			if((mask & 1 << bit) > 0)return false;
			mask |=(1<<bit);
		}
		return true;
	}
	
	public static boolean isUniqueChars2(String str) {
		if (str.length() > 128) {
			return false;
		}
		boolean[] char_set = new boolean[128];
		for (int i = 0; i < str.length(); i++) {
			int val = str.charAt(i);
			if (char_set[val]) return false;
			char_set[val] = true;
		}
		return true;
	}
	
	public static void main(String[] args) {
		String[] words = {"aBBde", "hello", "apple", "kite", "padle"};
		for (String word : words) {
			System.out.println(word + ": " + isUniqueChars(word) + " " + isUniqueChars2(word));
		}
//
		System.out.println(1 << -1);
		System.out.println(1 << 31);

		System.out.println(1 << -2);
		System.out.println(1 << 30);
//		System.out.println(1 >> 2);
//
//		System.out.println(1 << 33);
//		System.out.println(Integer.MAX_VALUE);

//		String print128 = print128();
//		System.out.println(print128 + ": " + isUniqueChars(print128) + " " + isUniqueChars2(print128));
	}

	public static String print128(){
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i <128; i++) {
			sb.append((char)i);
		}
		return sb.toString();
	}


}
