/*
    Time Complexity: O(N)
    Space Complexity: O(1)

    where N is the length of input string S.
    https://www.codingninjas.com/codestudio/problems/next-greater-number_980529?leftPanelTab=2
*/

import java.util.ArrayList;
import java.util.Collections;

public class Solution 
{
	public static ArrayList<Integer> nextPermutation(ArrayList<Integer> arr) 
	{
       // Write your code here.
         if(arr==null || arr.size()<=1)  return arr;
        
        int i=arr.size()-2;
        for(;i>=0;i--)
            if(arr.get(i)<arr.get(i+1))
                   break;
        if(i<0){
            Collections.sort(arr);
            return arr;
         }
            
        
        for(int j=arr.size()-1;j>i;j--){
            
            if(arr.get(j)>arr.get(i)){
                Collections.swap(arr,i,j);
                break;
            }
                
        }
        
       
        Collections.sort(arr.subList(i+1, arr.size()));
       
        return arr;
	}
}
!@@@@@@@@@@@@@@@@@@@@

import java.util.Arrays;

public class Solution {

    // Function to swap two digit
    static void swap(char ar[], int i, int j) {
        char temp = ar[i];
        ar[i] = ar[j];
        ar[j] = temp;
    }

    public static String nextGreater(String str) {

        char S[] = str.toCharArray();
        int i = str.length() - 2;

        // Traversing from right to find the number x which is smaller than the next one
        for (; i >= 0; i--) {
            if (S[i] < S[i + 1]) {
                break;
            }
        }

        // If it doesn't exist, return -1
        if (i < 0) {
            return "-1";
        }

        // Finding the number x' in the right side which is just greater than x
        for (int j = S.length - 1; j > i; j--) {
            if (S[j] > S[i]) {
                swap(S, i, j);
                break;
            }
        }

        // Reversing the right side to make it in increasing order
        Arrays.sort(S, i + 1, S.length);
        return String.valueOf(S);
    }
}
