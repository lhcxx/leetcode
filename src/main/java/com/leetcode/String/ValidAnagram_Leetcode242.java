package com.leetcode.String;

/**
 * Created by lhcxx on 18/9/26.
 */
public class ValidAnagram_Leetcode242 {
	public boolean isAnagram(String s, String t) {
		if (s.length() != t.length())
			return false;
		int[] count = new int[26];
		for (int i = 0; i < s.length(); i++) {
			count[s.charAt(i) - 'a']++;
			count[t.charAt(i) - 'a']--;
		}
		for (int num : count)
			if (num != 0)
				return false;
		return true;
	}
}
