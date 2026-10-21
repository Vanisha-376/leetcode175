// Last updated: 10/21/2026, 10:30:46 AM
1class Solution {
2    public boolean searchMatrix(int[][] matrix, int target) {
3        int top = 0;
4        int bot = matrix.length - 1;
5
6        while (top <= bot) {
7            int mid = (top + bot) / 2;
8
9            if (matrix[mid][0] < target && matrix[mid][matrix[mid].length - 1] > target) {
10                break;
11            } else if (matrix[mid][0] > target) {
12                bot = mid - 1;
13            } else {
14                top = mid + 1;
15            }
16        }
17
18        int row = (top + bot) / 2;
19
20        int left = 0;
21        int right = matrix[row].length - 1;
22
23        while (left <= right) {
24            int mid = (left + right) / 2;
25
26            if (matrix[row][mid] == target) {
27                return true;
28            } else if (matrix[row][mid] > target) {
29                right = mid - 1;
30            } else {
31                left = mid + 1;
32            }
33        }
34
35        return false;        
36    }
37}