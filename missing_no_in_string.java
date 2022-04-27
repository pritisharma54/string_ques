/*
	Time Complexity: O(N)
	Space complexity: O(1)

	Where 'N' is the size of the given string.
  https://www.codingninjas.com/codestudio/problems/find-the-missing-number-in-a-string-of-numbers-with-no-separator_985295?leftPanelTab=0
*/

public class Solution {
    public static String missingNumber(String s) {

        String missing = "-1";
        int n = s.length();

        // We try every possible length for first number.
        for (int len = 1; len <= 6 && len <= n; ++len) {

            // We can't consider a number which start from zero except 0 itself.
            if (len != 1 && s.charAt(0) == '0') continue;

            int number = Integer.parseInt(s.substring(0, len));

            // The count will tell us how many number we missed so far.
            int count = 0;

            // We should start checking after the index of first number.
            int i = len;
            boolean found = true;

            while (count < 2 && i < n) {
                int nextNumber = number + 1;
                String temp = String.valueOf(nextNumber);
                int j = 0;
                // We store the stating index in a variable k.
                int k = i;

                while (j < temp.length() && k < n) {

                    /*
                        We check if every digit of next number 
                        is present in our string or not.
                    */
                    if (temp.charAt(j) != s.charAt(k)) {
                        break;
                    } 
                    else {
                        ++k;
                        ++j;
                    }
                }

                /*
                    We came at the end of next number 
                    that means each digit is present out 
                    string so we update our index.
                */                
                if (j == temp.length()) {
                    i = k;
                } 
                else if (k == n) {

	                /*
	                    If we came at the end of our string 
                        before matching all the digits that means
	                    the string is not valid according to 
                        current length that we are considering.
	                */
                    found = false;
                    break;
                } 
                else {
                    /*
                        Else this number will be our 
                        missing number and we increment 
                        the count of missing number found so far.
                    */                   
                    missing = temp;
                    ++count;
                }

                number = nextNumber;
            }

            /*
                After checking for a particular length 
                if the count of missing number is 1  
                that means we found our answer
                or if count is zero that means all 
                the number present in string are 
                consecutive so our missing number
                will be next number of the sequence.
            */

            /*
                After checking for a particular length 
                if count is one that means 
                we found our correct missing number.
            */
            if (count == 1 && found) {
                break;
            } 
            else {
                missing = "-1";
            }
        }

        return missing;
    }

}

