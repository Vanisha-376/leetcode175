// Last updated: 8/13/2026, 10:03:43 PM
1class Solution {
2    public boolean canSplit(int[] nums, int n, int k, int maxSum) {
3        int subarrayCount = 1;
4        int currentSum = 0;
5
6        for (int i = 0; i < n; i++) {
7            if (nums[i] > maxSum) {
8                return false;
9            }
10            if (currentSum + nums[i] <= maxSum) {
11                currentSum += nums[i];
12            } else {
13                subarrayCount++;
14                currentSum = nums[i];
15            }
16        }
17
18        return subarrayCount <= k;
19    }
20
21    public int splitArray(int[] nums, int k) {
22        int n = nums.length;
23        int sum = 0;
24        int ans = -1;
25
26        for (int i = 0; i < n; i++) {
27            sum += nums[i];
28        }
29
30        int start = 0;
31        int end = sum;
32
33        while (start <= end) {
34            int mid = start + (end - start) / 2;
35            if (canSplit(nums, n, k, mid)) {
36                ans = mid;
37                end = mid - 1;
38            } else {
39                start = mid + 1;
40            }
41        }
42
43        return ans;
44    }
45}