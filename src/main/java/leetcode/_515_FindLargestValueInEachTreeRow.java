package leetcode;

import com.leetcode.common.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class _515_FindLargestValueInEachTreeRow {
	public List<Integer> largestValue(TreeNode root) {
		List<Integer> res = new ArrayList<>();
		if (root == null)
			return res;
		Queue<TreeNode> queue = new LinkedList<>();
		queue.offer(root);
		int max = Integer.MIN_VALUE;

		while (!queue.isEmpty()) {
			int size = queue.size();
			for (int i = 0; i < size; i++) {
				TreeNode cur = queue.poll();
				max = Math.max(max, cur.value);
				if (cur.left != null)
					queue.offer(cur.left);
				if (cur.right != null)
					queue.offer(cur.right);
			}
			res.add(max);
			max = Integer.MIN_VALUE;
		}
		return res;
	}
}
