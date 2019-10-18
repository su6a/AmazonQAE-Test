package interviewQuestions;

public class NearestPalidromeInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(nearestPalindromic("110"));
	}
	    public static String nearestPalindromic(String n) {
	        long num = Long.parseLong(n);
	        for (long i = 1;; i++) {
	            if (isPalindrome(num - i))
	                return "" + (num - i);
	            if (isPalindrome(num + i))
	                return "" + (num + i);
	        }
	    }
	    public static boolean isPalindrome(long x) {
	        long t = x, rev = 0;
	        while (t > 0) {
	            rev = 10 * rev + t % 10;
	            t /= 10;
	        }
	        return rev == x;
	    }
}
