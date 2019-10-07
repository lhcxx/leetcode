package com.leetcode.misc;

public class StringToInteger_8 {
	public int myAtoi(String str) {
		str = str.trim();
		if (str == null || str.length() == 0)
			return 0;
		char firstChar = str.charAt(0);
		int sign = 1, start = 0;
		long res = 0;
		if (firstChar == '+') {
			start++;
		} else if (firstChar == '-') {
			sign = -1;
			start++;
		}
		for (int i = start; i < str.length(); i++) {
			if (!Character.isDigit(str.charAt(i)))
				return (int) res * sign;
			res = res * 10 + str.charAt(i) - '0';
		}
		return (int) res * sign;
	}
}
