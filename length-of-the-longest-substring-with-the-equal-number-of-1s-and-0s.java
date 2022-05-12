//https://www.codingninjas.com/codestudio/problems/length-of-the-longest-substring-with-the-equal-number-of-1s-and-0s_1215003?leftPanelTab=0
import java.util.*;
public class Solution {
    public static int longestSubstring(String s, int n) {
        // Write your code here.
		HashMap<Integer,Integer> mp= new HashMap<>();
		int sum=0;
		int maxLen=0;
		mp.put(0,-1);
		for(int i=0;i<s.length();i++){
			char ch=s.charAt(i);
			
			if(ch=='1')
				sum+=1;
			else
				sum-=1;
			if(mp.containsKey(sum)){
				maxLen=Math.max(maxLen,i-mp.get(sum));
			}
			else
				mp.put(sum,i);
				
		}
		return maxLen;
    }
}
