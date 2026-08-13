// Last updated: 8/13/2026, 3:58:37 PM
class Solution {
    public boolean canReach(int[] start, int[] target) {
        int startSum=start[0]+start[1];
        int targetSum=target[0]+target[1];
        return Math.abs(startSum%2)==Math.abs(targetSum%2);
    }
}