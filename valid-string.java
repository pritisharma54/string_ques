//https://www.codingninjas.com/codestudio/problems/valid-string_762939?leftPanelTab=0
import java.util.*;
public class Solution {
	public static boolean checkValidString(String s) {
      int open = 0, close = 0, stars = 0;
      for (int i=0;i<s.length();i++)
      {
			char ch=s.charAt(i);
			if (ch == '(')
			  open++;
			if (ch == '*')
			  stars++;
			if (ch == ')')
			  close++;
			if (close > (open + stars))
			  return false;
      }
	  open = 0;
	  close = 0;
	  stars = 0;
      for(int i=s.length()-1;i>0;i--)
      {
		//because we are traversing backwords close and open are swapped.
			char ch=s.charAt(i);
			if (ch == '(')
			  open++;
			if (ch == '*')
			  stars++;
			if (ch == ')')
			  close++;

			if (open > (close + stars))
			  return false;
      }
	return true;
		

	}
}
