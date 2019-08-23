package interviewQuestions;

import java.util.Arrays;

public class CharArrayToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char[] chars = {'H', 'e', 'l', 'l', 'o', '!', ' ',
				'S', 'u', 'r', 'e', 'n', 'd', 'a', 'r'};

// Method 1		
		
		String string = Arrays.toString(chars)
					.substring(1, 3*chars.length-1)
					.replaceAll(", ", "");
		System.out.println(string);
	
		
// Method 2
	
		StringBuilder sb = new StringBuilder();
		for (char ch: chars) {
			sb.append(ch);
		}
		String str = sb.toString();
		System.out.println(str);
		
		
//Method 3
		String string1 = String.copyValueOf(chars);
		System.out.println(string1);
	}
}
