package Question1_3;

public class QuestionB {
	//permutation 排列，置换的意思
	public static boolean permutation(String s, String t) {
		if (s.length() != t.length()) {
			return false;
		}
		
		int[] letters = new int[128];
		 
		char[] s_array = s.toCharArray();
		for (char c : s_array) { // count number of each char in s.
			letters[c]++;  
		}
		  
		for (int i = 0; i < t.length(); i++) {
			int c = (int) t.charAt(i);
		    if (--letters[c] < 0) {
		    	return false;
		    }
		}
		  
		return true;
	}
	
	public static void main(String[] args) {
		String[][] pairs = {{"apple", "papel"}, {"carrot", "tarroc"}, {"hello", "llloh"}};
		for (String[] pair : pairs) {
			String word1 = pair[0];
			String word2 = pair[1];
			//anagram 单词的意思： 相同字母异序词，易位构词，变位词
			boolean anagram = permutation(word1, word2);
			System.out.println(word1 + ", " + word2 + ": " + anagram);
		}
	}
}
