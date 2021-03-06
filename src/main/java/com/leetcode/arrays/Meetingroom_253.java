package com.leetcode.arrays;

import com.leetcode.utils.Interval;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Meetingroom_253 {
/**
 * 253. Meeting Rooms II


 |___| |____|
   |_____| |___|

 start:
 | |   |   |
 i
 end :
     |   |  |  |
 end

 time : O(nlogn) space : O(n)*/

 public int minMeetingRooms(Interval[] intervals) {
		if (intervals == null || intervals.length == 0)
			return 0;
		int[] starts = new int[intervals.length];
		int[] ends = new int[intervals.length];
		for (int i = 0; i < intervals.length; i++) {
			starts[i] = intervals[i].start;
			ends[i] = intervals[i].end;
		}

		Arrays.sort(starts);
		Arrays.sort(ends);
		int res = 0;
		int end = 0;
		for (int i = 0; i < intervals.length; i++) {
			if (starts[i] < ends[end])
				res++;
			else
				end++;
		}
		return res;
	}
}
