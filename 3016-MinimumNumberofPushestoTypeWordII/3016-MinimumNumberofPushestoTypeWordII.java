// Last updated: 8/13/2026, 9:50:28 PM
1class Solution {
2
3    public int[] topKFrequent(int[] nums, int k) {
4
5        int n = nums.length;
6
7        // Step 1: Count frequency of each number
8        HashMap<Integer, Integer> map = new HashMap<>();
9
10        for (int num : nums) {
11            map.put(num, map.getOrDefault(num, 0) + 1);
12        }
13
14        // bucket[i] stores numbers having frequency i
15        List<Integer>[] bucket = new ArrayList[n + 1];
16
17        // Step 2: Place numbers into their frequency bucket
18        for (int key : map.keySet()) {
19
20            int freq = map.get(key);
21
22            // Create list if bucket is empty
23            if (bucket[freq] == null) {
24                bucket[freq] = new ArrayList<>();
25            }
26
27            // Add number into its frequency bucket
28            bucket[freq].add(key);
29        }
30
31        int[] ans = new int[k];
32        int index = 0;
33
34        // Step 3: Traverse from highest frequency bucket
35        for (int i = bucket.length - 1; i >= 0 && index < k; i--) {
36
37            // Skip empty buckets
38            if (bucket[i] != null) {
39
40                // Take all numbers from current bucket
41                for (int num : bucket[i]) {
42
43                    ans[index++] = num;
44
45                    // Stop once k elements are collected
46                    if (index == k)
47                        break;
48                }
49            }
50        }
51
52        return ans;
53    }
54}