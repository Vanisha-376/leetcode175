// Last updated: 8/13/2026, 9:58:32 PM
1
2class Solution {
3    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
4      ListNode l3 = new ListNode(0);  
5      ListNode head = l3;
6      int carry=0;
7      while(l1!=null || l2!=null || carry!=0){
8             int v1 = (l1!=null)? l1.val:0;
9             int v2 = (l2!=null)? l2.val:0;
10             int sum = v1+v2+carry;
11             carry =sum/10;
12             int digit = sum%10;
13             l3.next =new ListNode(digit);
14             l3=l3.next;
15             l1=(l1!=null)?l1.next:null;
16             l2=(l2!=null)?l2.next:null;
17
18      }
19      return head.next;
20    }
21}
22