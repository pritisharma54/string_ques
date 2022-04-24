//https://www.codingninjas.com/codestudio/problems/compress-the-string_893402?leftPanelTab=0
public class Solution {
	public static String compressTheString(String s) {
		// Write your code here
		int n = s.length(); 
		String compressString = "";
		char currentCharacter;
		for (int i = 0; i < n; i++) { 

			// Count occurrences of current character 
			int count = 1; 
			currentCharacter = s.charAt(i);
			while (i < n - 1 && 
				s.charAt(i) == s.charAt(i + 1)) { 
				count++; 
				i++; 
			}
			if (count == 1) 
				compressString = compressString + currentCharacter;
			else 
				compressString = compressString + currentCharacter + String.valueOf(count);
			
		}
		
		return compressString;
	}

}

