package leetcode;

public class _134_GasStation {
	public int canCompleteCircuit(int[] gas, int[] cost) {
		int sum = 0, total = 0, start = 0;
		for(int i = 0; i < gas.length; i++) {
			total += (gas[i] - cost[i]);
			if (sum < 0) {
				start = i;
				sum = gas[i] - cost[i];
			} else {
				sum += (gas[i] - cost[i]);
			}
		}
		return total < 0 ? -1 : start;
	}
}
