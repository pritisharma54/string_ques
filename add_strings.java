class Solution {
    public String addStrings(String num1, String num2) {
        // Write your code here.
        //https://leetcode.com/problems/add-strings/
        
        StringBuilder ans= new StringBuilder();
        int p1=num1.length()-1;
        int p2=num2.length()-1;
        int x1=0,x2=0,carry=0;
        int value;
        
        while(p1>=0||p2>=0){
           x1=0;
           x2=0;
            
           if(p1>=0)
               x1=num1.charAt(p1)-'0';
           if(p2>=0)
               x2=num2.charAt(p2)-'0';
            
           value=(x1+x2+carry)%10;
           carry=(x1+x2+carry)/10;
            
           ans.append(value);
            
           p1--;
           p2--;
     
        }
        
        if(carry!=0) ans.append(carry);
        
        return ans.reverse().toString();
    }
}
