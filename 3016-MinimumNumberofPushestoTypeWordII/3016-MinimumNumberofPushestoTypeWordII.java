// Last updated: 8/13/2026, 9:59:53 PM
1class Solution {
2
3    public void reorderList(ListNode head) {
4
5        if(head == null || head.next == null){
6            return;
7        }
8
9        // Step 1: Find Middle
10
11        ListNode slow = head;
12        ListNode fast = head;
13
14        while(fast.next != null && fast.next.next != null){
15            slow = slow.next;
16            fast = fast.next.next;
17        }
18
19        // Step 2: Split List
20
21        ListNode second = slow.next;
22        slow.next = null;
23
24        // Step 3: Reverse Second Half
25
26        ListNode prev = null;
27
28        while(second != null){
29
30            ListNode next = second.next;
31
32            second.next = prev;
33
34            prev = second;
35            second = next;
36        }
37
38        second = prev;
39
40        // Step 4: Merge Both Halves
41
42        ListNode first = head;
43
44        while(second != null){
45
46            ListNode temp1 = first.next;
47            ListNode temp2 = second.next;
48
49            first.next = second;
50            second.next = temp1;
51
52            first = temp1;
53            second = temp2;
54        }
55    }
56}