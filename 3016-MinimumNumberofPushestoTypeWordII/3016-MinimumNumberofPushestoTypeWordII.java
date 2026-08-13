// Last updated: 8/13/2026, 9:53:33 PM
1class Solution {
2    public ListNode swapPairs(ListNode head) {
3        if (head == null || head.next == null) return head;
4        ListNode temp = head.next;
5        head.next = swapPairs(temp.next);
6        temp.next = head;
7        return temp;
8    }
9}