//https://www.codingninjas.com/codestudio/problems/minimum-rotations_1115767?leftPanelTab=1
/*
	Time Complexity: O(N^2)
	Space Complexity: O(1),

	where N is the length of the string S.
*/

public class Solution 
{

	public static int minimumRotations(int n, String s) 
    {
		String concat = s + s;
        
        // Iterate i from 1 to N - 1
        for (int i = 1; i < n; i++) 
        {
			String currSubstring = concat.substring(i, i + n);
			
            // Checking if the current substring of length n equals s or not.
            if (s.equals(currSubstring)) 
            {
				return i;
			}
		}
		
        // Return the length of the string
		return n;
	}

}	
//do kmp approach
