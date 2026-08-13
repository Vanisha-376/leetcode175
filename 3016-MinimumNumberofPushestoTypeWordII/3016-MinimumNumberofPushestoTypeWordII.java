// Last updated: 8/13/2026, 9:40:44 PM
1class Solution {
2   public String convert(String s, int nRows) {
3    char[] c = s.toCharArray();
4    int len = c.length;
5    StringBuffer[] sb = new StringBuffer[nRows];
6    for (int i = 0; i < sb.length; i++) sb[i] = new StringBuffer();
7    
8    int i = 0;
9    while (i < len) {
10        for (int idx = 0; idx < nRows && i < len; idx++) // vertically down
11            sb[idx].append(c[i++]);
12        for (int idx = nRows-2; idx >= 1 && i < len; idx--) // obliquely up
13            sb[idx].append(c[i++]);
14    }
15    for (int idx = 1; idx < sb.length; idx++)
16        sb[0].append(sb[idx]);
17    return sb[0].toString();
18}
19}