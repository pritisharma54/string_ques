//https://www.codingninjas.com/codestudio/problems/minimum-deletions-to-make-character-frequencies-unique_1461220?leftPanelTab=0
import java.util.*;
public class Solution 
{
	public static int minDeletions(String s)
	{
	    // Write your code here
		int cnt = 0;
      int[] freq = new int[26];
      Set<Integer> seen = new HashSet<>();
      for (char c : s.toCharArray()) {
        freq[c - 'a']++;
      }
      for (int i = 0; i < 26; i++) {
        while (freq[i] > 0 && seen.contains(freq[i])) {
          freq[i]--;
          cnt++;
        }
        seen.add(freq[i]);
      }
      return cnt;
	}
}
