/*
    Time Complexity: O(N)
    Space Complexity: O(N),

    where 'N' is the length of the given string.
    https://www.codingninjas.com/codestudio/problems/length-of-the-longest-substring-with-the-equal-number-of-1s-and-0s_1215003?leftPanelTab=0
*/

import java.util.*;

public class Solution {
    public static int longestSubstring(String s, int n) {
        // Variables to store the answer and sum.
	    int ans = 0, sum = 0;
	    // Hashmap to store the occurence of any particular sum.
	    Map<Integer, Integer> prefSum = new HashMap<Integer, Integer>();
	    prefSum.put(0, -1);
	    for (int i = 0; i < n; i++) {
	        // If 0 is found we see it as -1 and add -1 to our sum variable.
	        if (s.charAt(i) == '0') {
	            sum -= 1;
	        }
	        // If 1 is found simply add 1 to sum.
	        else {
	            sum += 1;
	        }

	        // Checking if the current sum has occured before or not.
	        if (!prefSum.containsKey(sum)) {
	            /* 
	            	If the current sum has not been occured before then fill the 
	            	hashmap with current index.
	            */
	            prefSum.put(sum, i);
	        }
	        else {
	            // If the current sum was seen before then update the answer.
	            ans = Math.max(ans, i - prefSum.get(sum));
	        }

	    }

	    // Return the answer.
	    return ans;
    }
}
