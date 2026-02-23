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
    int maxSum = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        dfs(root);
        return maxSum;
    }

    private int dfs(TreeNode root){
        if(root == null) return 0;

        int leftGain = Math.max(dfs(root.left),0);
        int rightGain = Math.max(dfs(root.right),0);

        int priceNewPath = root.val + leftGain + rightGain;
        maxSum = Math.max(priceNewPath,maxSum);
        return root.val + Math.max(leftGain,rightGain);
    }
}