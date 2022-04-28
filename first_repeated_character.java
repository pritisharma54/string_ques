/*
	Time complexity: O(N) 
	Space complexity: O(1)
	
    Where 'N' is the size of the string.
    https://www.codingninjas.com/codestudio/problems/first-repeated-character_1214646?leftPanelTab=0
*/

public class Solution {
	public static char repeatedCharacter(String str) {
		// Create a boolean array to store weather the character is visited or not.
		boolean[] visited = new boolean[26];

		// Traverse through the boolean array and mark all as not visited.
		for (int i = 0; i < 26; i++) {
			// 'false' means the character has not been visited.
			visited[i] = false;
		}

		// Initialise index to store the index of the first repeating character.
		int index = -1;

		// Traverse from right and update the index as soon as we see a visited character..
		for (int i = str.length() - 1; i >= 0; i--) {
			/*
			   If you come through a character for the first time, mark it as visited.
			   So that once you visit it again it will be already visited and you can store its index.
			*/
			if (visited[str.charAt(i) - 'a'] == false) {
				visited[str.charAt(i) - 'a'] = true;
			} else {
				index = i;
			}
		}
		// If index found before reaching the end of the string then return the character at that index.
		if (index >= 0) {
			return str.charAt(index);
		}
		// Else return '%' as asked in the problem statement.
		else {
			return '%';
		}
	}
}
