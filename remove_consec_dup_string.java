//https://www.codingninjas.com/codestudio/problems/remove-consecutive-duplicates-from-string_630473?leftPanelTab=0
public class Solution 
{
    public static String removeConsecutive(StringBuilder str) 
    {
        int i=0,j=0;
		int n=str.length();
		
		while(j<n){
			
			
			if(str.charAt(i)!=str.charAt(j)){
				i++;
				str.setCharAt(i,str.charAt(j));
			}
			
			j++;
				
		}
		
		return str.substring(0,i+1);
    }
