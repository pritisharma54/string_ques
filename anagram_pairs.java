/*
    Time complexity : O((N * log(N)) + (M * log(M)))
    Space complexity : O(1)

    where N and M are the lengths of the two input strings.
*/

import java.util.Arrays;

public class Solution {

    public static boolean isAnagram(String str1, String str2) {
        
        // Both the strings must have equal length.
        if (str1.length() != str2.length()) {
            return false;
        }

        // Storing the strings to char arrays.
        char[] charArr1 = str1.toCharArray();
        char[] charArr2 = str2.toCharArray();

        // Sorting the char arrays.
        Arrays.sort(charArr1);
        Arrays.sort(charArr2);
		
	
        str1 = String.valueOf(charArr1);
        str2 = String.valueOf(charArr2);


        // Comparing the sorted strings.
        if (str1.equals(str2)) {
            return true;
        }

        return false;
    }

}
