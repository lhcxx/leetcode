package com.leetcode.DP;

public class LongestPalindrome {
	public String longestPalindrome(String s) {
		if (s == null || s.length() == 0)
			return s;
		String res = "";
		boolean[][] dp = new boolean[s.length()][s.length()];
		int max = 0;
		for (int j = 0; j < s.length(); j++)
			for (int i = 0; i <= j; i++) {
				dp[i][j] = s.charAt(i) == s.charAt(j) && (j - i <= 2 || dp[i+1][j-1]);
				if(dp[i][j]) {
					max = j - i + 1;
					res = s.substring(i, j + 1);
				}
			}
			return res;
	}

	public String res = "";

	public String longestPalindrome2(String s) {
		if (s == null || s.length() == 0)
			return s;
		for (int i = 0; i < s.length(); i++) {
			helper(s, i, i);
			helper(s, i, i + 1);
		}
		return res;
	}

	private void helper(String s, int left, int right) {
		while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
			left--;
			right++;
		}
		String cur = s.substring(left + 1, right);
		if (cur.length() > res.length())
			res = cur;
	}


}
