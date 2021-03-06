package leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class _491_IncreasingSubsequences {
	public List<List<Integer>> findSubsequences(int[] nums) {
		HashSet<List<Integer>> set = new HashSet<>();
		if (nums == null || nums.length == 0)
			return new ArrayList<>();
		helper(set, new ArrayList<>(), nums, 0);
		return new ArrayList<>(set);
	}


	private void helper(HashSet<List<Integer>> res, List<Integer> list, int[] nums, int start) {
		if (list.size() >= 2)
			res.add(new ArrayList<>(list));

		for (int i = start; i< nums.length; i++) {
			if (list.size() == 0 || list.get(list.size() - 1) <= nums[i]) {
				list.add(nums[i]);
				helper(res, list, nums, i + 1);
				list.remove(list.size() - 1);
			}
		}
	}
}
