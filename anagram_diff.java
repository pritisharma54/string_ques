//https://www.codingninjas.com/codestudio/problems/anagram-difference_799485?topList=top-adobe-coding-interview-questions&leftPanelTab=0
public class Solution {
	public static int getMinimumAnagramDifference(String str1, String str2) {
		int n = str1.length();

		// Array for storing frequencies.
		int freq[] = new int[26];

		// Store the frequencies of characters of first string.
		for (int i = 0; i < n; i++) {
			freq[str1.charAt(i) - 'a']++;
		}

		// Subtract the frequencies of characters of second string.
		for (int i = 0; i < n; i++) {
			freq[str2.charAt(i) - 'a']--;
		}

		// Variable to store the total absolute frequencies difference.
		int freqDiff = 0;

		// Iterating for all alphabets to cacluclate the total absolute frequencies difference.
		for (int i = 0; i < 26; i++) {
			freqDiff += Math.abs(freq[i]);
		}

		// Return minimum manipulations required to make string anagram.
		return freqDiff/2;
	}
}
