// Last updated: 8/13/2026, 3:58:42 PM
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    private int dominantCount=0;
    public int countDominantNodes(TreeNode root) {
        dominantCount=0;
        helper(root);
        return dominantCount;
    }
    private int helper(TreeNode node){
        if(node==null){
            return Integer.MIN_VALUE;
        }
        int leftMax=helper(node.left);
        int rightMax=helper(node.right);
        int currentSubtreeMax=Math.max(node.val,Math.max(leftMax,rightMax));
        if(node.val==currentSubtreeMax){
            dominantCount++;
    }
    return currentSubtreeMax;
    }
    
}