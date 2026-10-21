// Last updated: 10/21/2026, 10:27:17 AM
1class Solution {
2    public String removeKdigits(String num, int k) {
3        Stack<Character> stack = new Stack<>();
4        
5        for (char digit : num.toCharArray()) {
6            while (!stack.isEmpty() && k > 0 && stack.peek() > digit) {
7                stack.pop();
8                k--;
9            }
10            stack.push(digit);
11        }
12        
13        // Remove remaining k digits from the end of the stack
14        while (k > 0 && !stack.isEmpty()) {
15            stack.pop();
16            k--;
17        }
18        
19        // Construct the resulting string from the stack
20        StringBuilder sb = new StringBuilder();
21        while (!stack.isEmpty()) {
22            sb.append(stack.pop());
23        }
24        sb.reverse(); // Reverse to get the correct order
25        
26        // Remove leading zeros
27        while (sb.length() > 0 && sb.charAt(0) == '0') {
28            sb.deleteCharAt(0);
29        }
30        
31        // Handle edge case where result might be empty
32        return sb.length() > 0 ? sb.toString() : "0";
33    }
34}