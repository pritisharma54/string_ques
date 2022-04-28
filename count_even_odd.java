/*
	Time Complexity: O(N)
	Space Complexity: O(1)

	Where N is the number of elements in array
  https://www.codingninjas.com/codestudio/problems/count-even-odd_1069244?leftPanelTab=0
*/

public class Solution {

	public static String evenodd(String str) {
		int m = 0;
		// Hash array to store frequency
		int hash[] = new int[26];
		for (int i = 0; i < str.length(); i++) {
			hash[str.charAt(i) - 'a'] += 1;
		}

		for (int i = 0; i < 26; i++) {
			int count = hash[i];
			// As character does not exist in the string
			if (count == 0) {
				continue;
			}
			int pos = i + 1;
			// When COUNT is even, ANS and POS are both even
			if (count % 2 == 0 && pos % 2 == 0) {
				m += 1;
			}
			// When COUNT is odd and POS is odd
			if (count % 2 == 1 && pos % 2 == 1) {
				m += 1;
			}
		}
		if ((m) % 2 == 0) {
			return "EVEN";
		} else {
			return "ODD";
		}
	}

}
