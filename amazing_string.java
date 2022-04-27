/*

    Time Complexity : O(N)
    Space Complexity : O(1)

    Where N denotes the maximum length of strings from 'FIRST', 'SECOND' and 'THIRD'.
    https://www.codingninjas.com/codestudio/problems/amazing-strings_893182?leftPanelTab=0

*/


public class Solution {

    public static String amazingStrings(String first, String second, String third) {
    
        // Declaring an array 's1','s2' and 's3' to keep the number of occurrences of
        // that particular ASCII valued letter of the string 'FIRST','SECOND' and 'THIRD'.
        int s1[] = new int[26];
        int s2[] = new int[26];
        int s3[] = new int[26];
        
        // Iterating from starting of string FIRST to ending of it.
        for (int i = 0; i < first.length(); i++) {
            
            // Incrementing the value of the index having ASCII value same as the current character.
            s1[first.charAt(i) - 'A'] += 1;
        }
        
        // Similarly we will calculate all occurances for string 'SECOND'.
        for (int i = 0; i < second.length(); i++) {
            s2[second.charAt(i) - 'A'] += 1;
        }
        
        // Similarly we will calculate all occurances for string 'THIRD'.
        for (int i = 0; i < third.length(); i++) {
            s3[third.charAt(i) - 'A'] += 1;
        }
        
    
        // Iterating through entire to check total sum of each character.
        for (int i = 0; i < 26; i++) {
            
            // If for any alphabet the sum of 'FIRST' and 'SECOND' is not equal to
            // 'THIRD' then it means that either string has extra or less no. of
            // occurances of that alphabet.
            if (s1[i] + s2[i] != s3[i]) {
                
                // Thus, we will return "NO".
                return "NO";
            }
        }
        
        // Atlast we will return "YES" if everything is satisfied.
        return "YES";
    
    }
}
