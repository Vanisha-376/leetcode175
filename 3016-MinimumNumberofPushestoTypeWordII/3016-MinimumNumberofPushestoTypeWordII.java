// Last updated: 8/13/2026, 9:39:40 PM
1class Solution {
2    public String countAndSay(int n) {
3        if (n == 1) {
4            return "1";
5        }
6
7        String say = countAndSay(n - 1);
8
9        String result = "";
10
11        for (int i = 0; i < say.length(); i++) {
12            char ch = say.charAt(i);
13            int count = 1;
14
15            while (i < say.length() - 1 && say.charAt(i) == say.charAt(i + 1)) {
16                count++;
17                i++;
18            }
19
20            result += count + "" + ch;
21        }
22
23        return result;
24    }
25}