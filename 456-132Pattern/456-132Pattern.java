// Last updated: 10/21/2026, 10:27:49 AM
1class Solution {
2    public boolean find132pattern(int[] nums) {
3        Deque<Integer> st = new ArrayDeque<>();
4        int last = Integer.MIN_VALUE;
5        for (int i = nums.length - 1; i >= 0; i--) {
6            if (nums[i] < last) return true;
7            while (!st.isEmpty() && st.peek() < nums[i]) {
8                last = st.peek();
9                st.pop();
10            }
11            st.push(nums[i]);
12        }
13        return false;
14    }
15}