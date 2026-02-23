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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root == null) return res;
        Deque<TreeNode> deque = new ArrayDeque<>();
        deque.push(root);
        while(!deque.isEmpty()){
            int len = deque.size();
            List<Integer> level = new ArrayList<>();
            if(res.size()%2==0){
                for(int i=0;i<len;i++){

                TreeNode curr = deque.pollFirst();
                level.add(curr.val);
                if(curr.left!=null)deque.addLast(curr.left);
                if(curr.right!=null)deque.addLast(curr.right);
                }
            } else {

                for(int i=0;i<len;i++){

                TreeNode curr = deque.pollLast();
                level.add(curr.val);
                if(curr.right!=null)deque.addFirst(curr.right);
                if(curr.left!=null)deque.addFirst(curr.left);
                }
            }
            res.add(level);
        }
        return res;
    }
}