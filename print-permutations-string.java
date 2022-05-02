//https://www.codingninjas.com/codestudio/problems/print-permutations-string_758958?leftPanelTab=0
import java.util.*;
public class Solution {
	public static  List<String> result= new ArrayList<>();
	// Swaping two alphabets in a string.
    private static void swap(char[] a, int i, int j) {
        char te = a[i];
        a[i] = a[j];
        a[j] = te;
    }
    public static void generatePermutationsHelper(char[] str , int l,int r)
	{  
		 if (l == r)
		{	
			StringBuilder res = new StringBuilder();
			for (int i = 0; i < str.length; i++) {
				res.append(str[i]);
		}
		
		result.add(res.toString());
		return;
		}
		for (int i = l; i <= r; i++)
		{
			swap(str,l,i);
			generatePermutationsHelper(str, l + 1, r);
			// backtrack
			swap(str,l,i);
		}
    }	
    public static List<String> findPermutations(String s) {
        // Write your code here.
		int n=s.length();
		char[] arr = s.toCharArray();
		generatePermutationsHelper(arr,0,n-1);
		
		return result;
    }
}
