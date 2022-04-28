/*
    Time Complexity: O(N)
    Space Complexity: O(N),

    where 'N' is the length of the string.
    https://www.codingninjas.com/codestudio/problems/number-following-a-pattern_1214624?leftPanelTab=0
*/
    
import java.util.*;

public class Solution {
	public static String numFollowingPattern(String s) {
		int n = s.length();
	    // Create an empty stack.
	    Stack <Integer> st = new Stack<Integer>();
	    // Create an empty string for the output.
	    String ans = "";

	    /*
	        As the length of the output string is one more than the
	        input string, so run a loop from i = 0 to i <= S.length().
	    */
	    for (int i = 0; i <= n; i++)
	    {
	        // Always push i+1 into the stack.
	        st.push(i + 1);

	        /*
	             If we are at the last or current character is I, then
	             pop the element and add it into the ans string
	             until the stack becomes empty.
	        */
	        if (i == n || s.charAt(i) == 'I')
	        {
	            while (!st.empty())
	            {
	                ans += String.valueOf(st.pop());
	            }

	        }

	    }

	    return ans;
	}
}
