//https://leetcode.com/problems/repeated-substring-pattern/
class Solution {
   
    public boolean repeatedSubstringPattern(String s) {
        int m = s.length();
		
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
        System.out.println(Arrays.toString(lps));
        
         if (lps[m - 1] == 0) return false;
        
        return (lps[m - 1] % (m - lps[m - 1]) == 0);
    }
}
