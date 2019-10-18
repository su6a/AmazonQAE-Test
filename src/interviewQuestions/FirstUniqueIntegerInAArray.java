package interviewQuestions;

import java.util.HashMap;
import java.util.Map;

public class FirstUniqueIntegerInAArray {

	static int firstNonRepeating(int arr[], int n) 
    { 
        // Insert all array elements in hash 
        // table 
  
        Map<Integer, Integer> m = new HashMap<>(); 
        for (int i = 0; i < n; i++) { 
            if (m.containsKey(arr[i])) { 
                m.put(arr[i], m.get(arr[i]) + 1); 
            } 
            else { 
                m.put(arr[i], 1); 
            } 
            
        } 
        for (int i = 0; i < n; i++) 
            if (m.get(arr[i]) == 1) 
                return arr[i]; 
        return -1; 
    } 
    // Driver code 
    public static void main(String[] args) 
    { 
        int arr[] = { 1,2,3,4,5,4,3,1 }; 
        int n = arr.length; 
        System.out.println(firstNonRepeating(arr, n)); 
    } 
} 

