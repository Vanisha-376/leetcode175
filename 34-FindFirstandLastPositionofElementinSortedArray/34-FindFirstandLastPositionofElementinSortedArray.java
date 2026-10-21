// Last updated: 10/21/2026, 10:30:18 AM
1class Solution {
2
3    public static int firstoccurrence(int[] nums, int target){
4        int low = 0;
5        int high = nums.length - 1;
6        int first = -1;
7
8        while(low <= high){
9            int mid = low + (high - low)/2;
10
11            if(nums[mid] == target){
12                first = mid;
13                high = mid - 1;
14            }
15            else if(nums[mid] < target){
16                low = mid + 1;
17            }
18            else{
19                high = mid - 1;
20            }
21        }
22        return first;
23    }
24
25    public static int lastoccurrence(int[] nums, int target){
26        int low = 0;
27        int high = nums.length - 1;
28        int last = -1;
29
30        while(low <= high){
31            int mid = low + (high - low)/2;
32
33            if(nums[mid] == target){
34                last = mid;
35                low = mid + 1;
36            }
37            else if(nums[mid] < target){
38                low = mid + 1;
39            }
40            else{
41                high = mid - 1;
42            }
43        }
44        return last;
45    }
46
47    public int[] searchRange(int[] nums, int target) {
48        int first = firstoccurrence(nums, target);
49        if(first == -1){
50            return new int[]{-1, -1};
51        }
52
53        int last = lastoccurrence(nums, target);
54        return new int[]{first, last};
55    }
56}