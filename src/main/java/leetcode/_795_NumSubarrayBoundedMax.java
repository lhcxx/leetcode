package leetcode;

public class _795_NumSubarrayBoundedMax {
	public int numSubarrayBoundedMax(int[] A, int L, int R) {
		return count(A, R) - count(A, L - 1);
	}

	private int count(int[] A, int bound) {
		int res = 0, cur = 0;

		for (int x : A) {
			cur = x <= bound ? cur + 1 : 0;
			res += cur;
		}
		return res;
	}

	private int count2(int[] A, int bound) {
		int res = 0;
		for(int i = 0, j = 0; i < bound; ) {
			if (A[i] < bound) {
				i++;
				res += i - j;
 			} else {
				i++;
				j = i;
			}
		}
		return res;
	}

}
