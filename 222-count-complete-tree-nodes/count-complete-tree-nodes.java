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
    public int countNodes(TreeNode root) {
        int count = dfs(root);
        return count;
    }

    private int dfs(TreeNode root){
        if(root == null) return 0;
        if(root.left == null && root.right == null) return 1;
        int leftCount = dfs(root.left);
        int rightCount = dfs(root.right);
        return leftCount + rightCount +1;
    }
}