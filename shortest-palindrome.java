//https://leetcode.com/problems/shortest-palindrome/
import java.util.*;

class Solution {
    public String shortestPalindrome(String s) {
        if(s.length()==0) return s;
        int len=LPS(s + "#" + new StringBuilder(s).reverse().toString());
        
        return new StringBuilder(s.substring(len)).reverse().toString()+s;
    }
    
    public int LPS(String s){
        int lps[]=new int[s.length()];
        
        int len=0;
        int i=1;
        
        while(i<s.length()){
            if(s.charAt(i)==s.charAt(len)){
                len++;
                lps[i++]=len;
            }
            else{
                if(len>0) len=lps[len-1];
                else i++;
            }
        }
        System.out.println(Arrays.toString(lps));
        return lps[lps.length-1];
    }
// First check for input string if input string is palindrome
// Then find out at which our input string is palindrome.
// for example if we have 'aababaavf'
// In above input string 'aababaa' is palindrome
// Nor from that point take the rest string(fv) in stringbuilder and reverse it(fv).
// Now append input string in stringbuilder (fv+aababaavf =fvaababaavf here is your answer
    public String shortestPalindrome(String s) {
        
        if(isPalindrome(s)){
            return s;
        }
        
        int start,end;
        
        start=0;
        end=s.length()-1;
        
        while(start<end){
            if(isPalindrome(s.substring(start,end))){
                break;
            }else{
                end--;
            }
        }
        
        StringBuilder sb=new StringBuilder(s.substring(end));
        sb.reverse();
        sb.append(s);       
        
        return sb.toString();
    }
    
    public boolean isPalindrome(String s){
      
        int mid=s.length()/2;
        if(s.length()%2==0){
            for(int i=mid-1,j=mid;i>=0;i--,j++){
                if(s.charAt(i)!=s.charAt(j)){                    
                    return false;
                }
            }
        }else{
            for(int i=mid-1,j=mid+1;i>=0;i--,j++){
                if(s.charAt(i)!=s.charAt(j)){
                    return false;
                }
            }
        }
       
        return true;
    }
}

