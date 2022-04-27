/*
	Time Complexity: O(N)
	Space Complexity: O(N)

	where N is the length input sentence S.
  https://www.codingninjas.com/codestudio/problems/check-if-the-word-is-present-in-sentence-or-not_920440?leftPanelTab=0
*/

public class Solution 
{

	public static boolean findWord(String S, String W) 
	{

		// Creating string stream
		String arr[] = S.split(" ");

		int i = 0;

		while (i < arr.length) 
		{

			// Comparing the current word temp with W
			if (arr[i].compareTo(W) == 0) 
			{
				return true;
			}
			
			i++;
		}
		return false;

	}

}
