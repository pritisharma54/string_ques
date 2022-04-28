/*
    Time Complexity: O(N * M)
    Space Complexity: O(N * M)

    Where 'N' is the length of string 'A' and 'M' is the length of string 'B'.
    https://www.codingninjas.com/codestudio/problems/distinct-occurences_981316?leftPanelTab=0
*/

public class Solution {
    public static int distinctOccurences(String a, String b, int n, int m) {
        // If length of 'B' is greater than 'A', then return 0.
        if (m > n) {
            return 0;
        }

        // dp[i][j] stores the count of occurences of B(1..i) in A(1..j).
        int dp[][] = new int[m + 1][n + 1];

        // Initializing first column with all 0s. And empty string can't have another string as subsequence.
        for (int i = 1; i <= m; i++) {
            dp[i][0] = 0;
        }

        // Initializing first row with all 1s. AN empty string is a subsequence of all.
        for (int j = 0; j <= n; j++) {
            dp[0][j] = 1;
        }

        // Fill dp[][] in bottom up manner.
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (a.charAt(j - 1) != b.charAt(i - 1)) {
                    dp[i][j] = dp[i][j - 1];
                }
                else {
                    dp[i][j] = dp[i][j - 1] + dp[i - 1][j - 1];
                }
            }
        }
        // Return the count of subsequence.
        return dp[m][n];
    }
}
