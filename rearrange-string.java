//https://www.codingninjas.com/codestudio/problems/rearrange-string_985247?leftPanelTab=0
public class Solution {
	public static String rearrangeString(String s) {
		// Write your code here.
		int n=s.length();
		int[] hash= new int[26];
		int index=0;
		char []ans= new char[n];
		int mostFreq=0;
		
		for(int i=0;i<n;i++){
			index=s.charAt(i)-'a';
			hash[index]+=1;
			if(hash[index]>hash[mostFreq])
				mostFreq=index;
		}
		
		if (hash[mostFreq] > (n + 1) / 2) {
			return "NO SOLUTION";
		}

		
		int temp=hash[mostFreq];
		int itrAns=0;
		
		while(temp-->0){
			ans[itrAns] = (char) ((int) 'a' + mostFreq);
			hash[mostFreq]--;
			itrAns+=2;
	
		}
		
		for(int i=0;i<26;i++){
		while(hash[i]>0){
			if (itrAns >= s.length()) {
					itrAns = 1;
				}
			ans[itrAns] = (char) ((int) 'a' + i);
			hash[i]--;
			itrAns+=2;
			}
		}
		
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < n; i++) {
			result.append(ans[i]);
		}
		return result.toString();
	}
}
