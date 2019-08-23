package interviewQuestions;

//import java.util.Scanner;

public class reverseStringRecursion {

    public static void main(String[] args) {
        String str = "Hello World!";
        
//        Scanner scanner = new Scanner(System.in);
//        str = scanner.nextLine();
//        scanner.close();
        
        String reversed = reverseString(str);
        System.out.println("The reversed string is: " + reversed);
    }

    public static String reverseString(String str)
    {
        if (str.isEmpty())
            return str;
        //Calling Function Recursively
        return reverseString(str.substring(1)) + str.charAt(0);
    }
}