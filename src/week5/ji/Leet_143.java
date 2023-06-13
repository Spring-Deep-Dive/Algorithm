class Solution {

	public void reorderList(ListNode head) {
		if (head == null || head.next == null) {
			return;
		}

		// Step 1: Find the middle of the list and split it into two halves
		ListNode mid = findMiddle(head);
		ListNode secondHalf = mid.next;
		mid.next = null;

		// Step 2: Reverse the second half of the list
		secondHalf = reverseList(secondHalf);

		// Step 3: Merge the two halves
		mergeLists(head, secondHalf);
	}

	// Helper method to find the middle of the list
	private ListNode findMiddle(ListNode head) {
		ListNode slow = head;
		ListNode fast = head.next;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}

	// Helper method to reverse a linked list
	private ListNode reverseList(ListNode head) {
		ListNode prev = null;
		ListNode curr = head;
		while (curr != null) {
			ListNode next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		return prev;
	}

	// Helper method to merge two linked lists alternatively
	private void mergeLists(ListNode first, ListNode second) {
		while (second != null) {
			ListNode nextFirst = first.next;
			ListNode nextSecond = second.next;
			first.next = second;
			second.next = nextFirst;
			first = nextFirst;
			second = nextSecond;
		}
	}
}
