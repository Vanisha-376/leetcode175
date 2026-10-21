// Last updated: 10/21/2026, 10:29:11 AM
1class Solution {
2    public int mySqrt(int x) {
3        // For special cases when x is 0 or 1, return x.
4        if (x == 0 || x == 1)
5            return x;
6
7        // Initialize the search range for the square root.
8        int start = 1;
9        int end = x;
10        int mid = -1;
11
12        // Perform binary search to find the square root of x.
13        while (start <= end) {
14            // Calculate the middle point using "start + (end - start) / 2" to avoid integer overflow.
15            mid = start + (end - start) / 2;
16
17            // If the square of the middle value is greater than x, move the "end" to the left (mid - 1).
18            if ((long) mid * mid > (long) x)
19                end = mid - 1;
20            else if (mid * mid == x)
21                // If the square of the middle value is equal to x, we found the square root.
22                return mid;
23            else
24                // If the square of the middle value is less than x, move the "start" to the right (mid + 1).
25                start = mid + 1;
26        }
27
28        // The loop ends when "start" becomes greater than "end", and "end" is the integer value of the square root.
29        // However, since we might have been using integer division in the calculations,
30        // we round down the value of "end" to the nearest integer to get the correct square root.
31        return Math.round(end);
32    }
33}