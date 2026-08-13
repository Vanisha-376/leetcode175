// Last updated: 8/13/2026, 9:52:59 PM
1class Solution {
2    public ListNode removeNthFromEnd(ListNode head, int n) {
3        ListNode fast = head, slow = head;
4        for (int i = 0; i < n; i++) fast = fast.next;
5        if (fast == null) return head.next;
6        while (fast.next != null) {
7            fast = fast.next;
8            slow = slow.next;
9        }
10        slow.next = slow.next.next;
11        return head;
12    }
13}