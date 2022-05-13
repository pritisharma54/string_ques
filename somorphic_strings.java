public class Solution {
	//https://www.codingninjas.com/codestudio/problems/check-if-two-given-strings-are-isomorphic-to-each-other_1117636?leftPanelTab=0
  public static boolean areIsomorphic(String str1, String str2) {
		// Write your code here.
		int n = str1.length();
		int m = str2.length();

		// Length of both strings must be same for one to one corresponance
		if (m != n) 
        {
			return false;
		}
		int[] hash= new int[26];
		boolean[] marked= new boolean[26];
		for (int i = 0; i < 26; i++) 
        {
			hash[i] = -1;
		}
		for(int i=0;i<str1.length();i++){
			if(hash[str1.charAt(i)-'a']==-1){
				if(marked[str2.charAt(i)-'a']== true)
					return false;
				hash[str1.charAt(i)-'a']=str2.charAt(i);
				marked[str2.charAt(i)-'a']= true;
			}
			else {
				if(hash[str1.charAt(i)-'a']!=str2.charAt(i))
					return false;
				
			}
			
			

		}
		return true;
	}
}
