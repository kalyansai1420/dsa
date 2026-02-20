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
    int postIndex;
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        Map<Integer,Integer> inMap = new HashMap<>();
        postIndex = postorder.length-1;
        for(int i=0;i<inorder.length;i++){
            inMap.put(inorder[i],i);
        }
        return build(postorder,inMap,0,inorder.length-1);
    }

    private TreeNode build(int[] postorder,Map<Integer,Integer> inMap,int left, int right){
        if(left > right) return null;
        TreeNode root = new TreeNode(postorder[postIndex--]);
        int mid = inMap.get(root.val);
        root.right = build(postorder,inMap,mid+1,right);
        root.left = build(postorder,inMap,left,mid-1);
        return root;
    }
}