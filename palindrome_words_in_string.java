/*
    Time Complexity:O(N). 
    Space Complexity:O(1).
    
    Where N is the length of the input string.
    https://www.codingninjas.com/codestudio/problems/count-palindrome-words-in-a-sentence_975378?leftPanelTab=2
*/

public class Solution 
{

    private static boolean isPalindrome(String s) 
	{

        if (s.equals("")) 
		{

            return false;
        }

        s = s.toLowerCase();
        int i, n = s.length();

        for (i = 0; i < n / 2; i++) 
		{
            if (s.charAt(i) != s.charAt(n - i - 1)) 
			{
                return false;
            }
        }

        return true;
    }

    public static int countNumberOfPalindromeWords(String s) 
	{

        int i, n = s.length();
        String temp = "";
        int ans = 0;

        for (i = 0; i < n; i++) 
		{

            // Check whether the current character is empty or not
            if (s.charAt(i) != ' ') 
			{

                // Add the current character to the temp string
                temp += s.charAt(i);

            } 
			else 
			{

                // Ignore the empty strings
                if (temp.equals("")) 
				{
                    continue;
                }

                // If it is a palindome, increase the answer by 1
                if (isPalindrome(temp)) 
				{
                    ans++;
                }

                // Make the temp string empty again
                temp = "";
            }
        }

        // Check for the last word
        if (isPalindrome(temp)) 
		{
            ans++;
        }

        return ans;
    }
}
