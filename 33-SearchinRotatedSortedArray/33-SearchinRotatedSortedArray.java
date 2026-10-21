// Last updated: 10/21/2026, 10:28:43 AM
1class Solution {
2    public int search(int[] nums, int target) {
3        int n = nums.length;
4        int left = 0, right = n - 1;
5
6        while (left < right) {
7            int mid = (left + right) >> 1;
8            if (nums[0] <= nums[mid]) {
9                if (nums[0] <= target && target <= nums[mid]) {
10                    right = mid;
11                } else {
12                    left = mid + 1;
13                }
14            } else {
15                if (nums[mid] < target && target <= nums[n - 1]) {
16                    left = mid + 1;
17                } else {
18                    right = mid;
19                }
20            }
21        }
22        return nums[left] == target ? left : -1;
23    }
24}