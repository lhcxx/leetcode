package leetcode;

import java.util.TreeSet;

public class _220_ContainsDuplicate3 {
	public boolean containsNearByAlmostDuplicate(int[] nums, int k, int t) {
		if (k <= 0 || nums.length < 2)
			return false;
		TreeSet<Long> set = new TreeSet<>();
		int i = 0;
		while (i < nums.length) {
			Long floor = set.floor((long)nums[i]);
			Long ceiling = set.ceiling((long)nums[i]);

			if (floor != null && nums[i] - floor <= t ||
				ceiling != null && ceiling - nums[i] <= t)
				return true;
			if (i >= k)
				set.remove((long)nums[i - k]);
			set.add((long)nums[i++]);
		}
		return false;
	}

	public boolean containsNearByAlmostDuplicate2(int[] nums, int k, int t) {
		for (int i = 0; i < nums.length; i++)
			for (int j = Math.max(i - k, 0); j < i; j++)
				if (Math.abs(nums[i] - nums[j]) <= t)
					return true;
		return false;
	}
}
