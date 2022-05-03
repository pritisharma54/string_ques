//https://www.codingninjas.com/codestudio/problems/mnfrj_1075018?leftPanelTab=0
public class Solution {
	public static int minimumParentheses(String p) {
		// Write your code here.
		int n=p.length();
		int opnBr=0,clsBr=0;
		int count=0;
		
		for(int i=0;i<n;i++){
			
			if(p.charAt(i)=='(')
				opnBr++;
			else
				clsBr++;
			
			if(clsBr>opnBr){
				count+=clsBr-opnBr;
				opnBr=0;
				clsBr=0;
			}
			
		}
		if(opnBr>clsBr)
				count+=opnBr-clsBr;
		return count;
	}
}
