//https://www.codingninjas.com/codestudio/problems/minimum-rotations_1115767?leftPanelTab=1
/*
	Time Complexity: O(N^2) for down
	Space Complexity: O(1),

	where N is the length of the string S.
*/
//kmp m+n
public class Solution 
{

	public static int kmp(String s, String c) 
    {	
        int m = s.length();
		int n = c.length();
		int[] lps = new int[m];
		
        for (int i = 0; i < m; i++) 
        {
			lps[i] = 0;
		}

		int i = 1;
        int j = 0;

		while (i < m) 
        {
			// Storing j+1 in lps[i]
			if (s.charAt(i) == s.charAt(j)) 
            {
				lps[i] = j + 1;
				j++;
				i++;
			}
			
            // If j is positive and s[i]!=s[j], then we make j = lps[j-1].
			else if (j > 0) 
            {
				j = lps[j - 1];
			}
			else 
            {
				lps[i] = 0;
				i++;
			}
		}

		i = 0; 
        j = 0;

		while (i < n && j < m) 
        {	
            // If c[i] equals s[j], then increment i and j.
			if (c.charAt(i) == s.charAt(j)) 
            {
				i++;
				j++;
			}
			
            // If c[i]!=s[j] and j > 0, then we make j = lps[j-1].
			else if (j > 0) 
			{
				j = lps[j - 1];
			}
			else 
            {
				i++;
			}
		}

		int ans = i - j;

		// If j is equal to m, then we will return ans
		if (j == m) 
        {
			return ans;
		}
		else 
        {
			return n - 1;
		}
	}

	public static int minimumRotations(int n, String s) 
    {
		String c = s.substring(1, n) + s;
		return 1 + kmp(s, c);
	}

}

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
