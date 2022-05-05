mport java.util.ArrayList;

//https://www.codingninjas.com/codestudio/problems/minimum-cost-to-move-balls-in-one-place_1460607?leftPanelTab=0
public class Solution
{
	public static int minCost(ArrayList<Integer> location, int n)
	{
		/*
		Initializing variable to store count of balls
		at even and odd positions.
		*/
		int even = 0;
		int odd = 0;

		// Iterate through location of all balls.
		for (int i = 0; i < n; i++)
		{

			// If location is even, increment 'even'.
			if (location.get(i) % 2 == 0)
			{
				even = even + 1;
			}

			// Otherwise, increment 'odd'.
			else
			{
				odd = odd + 1;
			}
		}

		// Minimum of odd and even give minimum cost.
		int ans = Math.min(odd, even);

		return ans;
	}
}
