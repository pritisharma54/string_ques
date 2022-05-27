//https://leetcode.com/problems/add-binary/
class Solution {
    public String addBinary(String str1, String str2) {
         // initialize an empty res variable
		List<String> res = new ArrayList<String>();

		// initialize the carry as 0
		int carry = 0;

		// set two pointers, `p1` and `p2`, that point to the end
		// of `str1` and `str2`, respectively
		int p1 = str1.length() - 1;
		int p2 = str2.length() - 1;

		// traverse the strings from the end using `p1` and `p2`
		// and stop when both strings are done
		while (p1 >= 0 || p2 >= 0) {
			int x1=0;
			int x2=0;

			if (p1 >= 0)
				// set x1 equal to a digit from string str1 at index p1
				x1=str1.charAt(p1)-'0';
			

			if (p2 >= 0)
				// set x2 equal to a digit from string str2 at index p2
				x2=str2.charAt(p2)-'0';
			
			// compute the current value
			int value = (x1 + x2 + carry) % 2;

			// update the carry
			carry = (int) Math.floor((x1 + x2 + carry) / 2);

			// append the current value to the result
			res.add(String.valueOf(value));
			p1 -= 1;
			p2 -= 1;
		}
		// If both of the strings are traversed but the carry is still non-zero,
		// we will append the carry to res
		if (carry != 0)
			res.add(String.valueOf(carry));
		// At last, we will reverse the result, convert it to a string, and return that string
		Collections.reverse(res);
		return String.join("", res);
        
    }
}
