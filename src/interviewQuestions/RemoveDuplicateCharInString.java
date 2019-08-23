package interviewQuestions;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;
import interviewQuestions.CharArrayToString;

public class RemoveDuplicateCharInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Method 1
		Linear("AaaBbbCcDde"); // Using for loop
		LinkedHashMapp("AaaBbbCcDde"); //using LinkedHashMap
		System.out.println(removeDuplicates("AaaBbbCcDde")); ///using Stream
		System.out.println(removeDupes("AaaBbbCcDde".toCharArray()));
	}

	public static void Linear(String input) {
 
	    String result = "";
	    for (int i = 0; i < input.length(); i++) {
	        if(!result.contains(String.valueOf(input.charAt(i)))) {
	            result += String.valueOf(input.charAt(i));
	        }
	    }
    System.out.println(result);
}
	
	
	public static void LinkedHashMapp(String input){
		char[] chars = input.toCharArray();
		Set<Character> charSet = new LinkedHashSet<Character>();
		for (char c : chars) {
		    charSet.add(c);
		}

		StringBuilder sb = new StringBuilder();
		for (Character character : charSet) {
		    sb.append(character);
		}
		System.out.println(sb.toString());
	}
	
    public static String removeDuplicates(String myString) {
        return Arrays.asList(myString.split(""))
                     .stream()
                     .distinct()
                     .collect(Collectors.joining());
    }
    
    public static char[] removeDupes(char[] arr){
        if (arr == null || arr.length < 2)
            return arr;
        int len = arr.length;
        int tail = 1;
        for(int x = 1; x < len; x++){
            int y;
            for(y = 0; y < tail; y++){
                if (arr[x] == arr[y]) break;
            }
            if (y == tail){
                arr[tail] = arr[x];
                tail++;
            }
        }
        return Arrays.copyOfRange(arr, 0, tail);
    }
}