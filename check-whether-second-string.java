/*
	Time Complexity: O(N + M)
	Space Complexity: O(1)
	
	where 'N' is the length of the first string
	and 'M' is the length of the second string.
  https://www.codingninjas.com/codestudio/problems/check-whether-second-string-can-be-formed-from-characters-of-first-string_920467?leftPanelTab=0
*/

public class Solution{

	public static String canFormSecondString(String str1, String str2)
	{
		int cnt[] = new int[256];
		
		for (int i = 0; i < str1.length(); ++i)
		{
			cnt[str1.charAt(i)]++;
		}
		
		for (int i = 0; i < str2.length(); ++i)
		{
			cnt[str2.charAt(i)]--;
		
			if(cnt[str2.charAt(i)] < 0)
			{
				return "NO";
			}
		}
		
		return "YES";
	}
}
