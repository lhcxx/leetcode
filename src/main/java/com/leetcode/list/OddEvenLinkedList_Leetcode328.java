package com.leetcode.list;

import common.ListNode;

/**
 * Created by lhcxx on 18/10/6.
 */
public class OddEvenLinkedList_Leetcode328 {
	public ListNode oddEvenList(ListNode head) {
		if (head == null || head.next == null)
			return null;
		ListNode odd = head;
		ListNode even = head.next;
		while (even != null && even.next != null) {
			odd.next = odd.next.next;
			even.next = even.next.next;
			odd = odd.next;
			even = even.next;
		}
		return head;
	}
}
