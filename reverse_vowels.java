//https://www.codingninjas.com/codestudio/problems/reverse-vowels-in-a-string_1231000?leftPanelTab=0
public class Solution {
    // Function to check whether a given character is vowel.
    public static boolean isVowel(char a)
    {
        return (a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u');
    }

    public static String reverseVowels(String s){
       // Defining the two pointers.
        int l = 0, r = s.length() - 1;
        char[] newS = s.toCharArray();

        // Iterating through string S.
        while (l < r)
        {
            // Checking if both pointers are currently pointing to vowels.
            if (isVowel(newS[l]) && isVowel(newS[r]))
            {
                // Swapping.
                char tmp = newS[l];
                newS[l] = newS[r];
                newS[r] = tmp;
                l++;
                r--;
                continue;
            }

            // If a pointer is not pointing to vowel then we will move it ahead.
            if (!(isVowel(newS[l])))
            {
                l++;
            }
            else if (!(isVowel(newS[r])))
            {
                r--;
            }
        }

        return new String(newS);
    }
}
