/*
    Time Complexity: O(N^2)
    Space Complexity: O(N^2),

    where N is the number of words
    //https://www.codingninjas.com/codestudio/problems/word-wrap_982931?leftPanelTab=0
*/

import java.util.ArrayList;

public class Solution 
{
    // This is helper function used to calculate the cost
    public static int calculateCost(int word, int line, int[] wordsLength, int[][] dp, int m) 
    {
        // Array wordsLength is storing the length of words.
        int n = wordsLength.length;
        
        if (word == n) 
        {
            return 0;
        }

        /* 
        	This 2 Dimensional DP array dp[word][line] indicates the
        	cost to put words from index word to line in a single line.
        */
        int res = dp[word][line];
        
        if (res != -1) 
        {
            return res;
        }

        int ans = 10000000;
        int current = 0;
        
        for (int w = word; w <= n - 1; w++) 
        {
            // Here we are making sure that we don't cross the maximum limit m.
            if (current + wordsLength[w] <= m) 
            {
                // After pushing this word (wordsLength[w]) in the line we will update the line's capacity.
                current += wordsLength[w] + 1;
                
                // cost is the cost calculated till now till now .
                int cost = m - current+1;
                
                // ans2 is the cost if we move to the next line on this word only.
                int ans2 = (cost * cost * cost) + calculateCost(w + 1, line + 1, wordsLength, dp, m);
                
                if (ans > ans2) 
                {
                    ans = ans2;
                }
            }
        }

        return  dp[word][line] = ans;
    }

    public static int wordWrap(String[] words, int m, int n) 
    {
        int[][] dp = new int[n + 1][n + 1];
        
        for (int i = 0; i <= n; i++) 
        {
            for (int j = 0; j <= n; j++) 
            {
                dp[i][j] = -1;
            }
        }
        
        int[] wordsLength = new int[n];
        
        for (int i = 0; i < n; i++) 
        {
            wordsLength[i] = (words[i].length());
        }

        int ans = calculateCost(0, 0, wordsLength, dp, m);
        return ans;
    }
}
