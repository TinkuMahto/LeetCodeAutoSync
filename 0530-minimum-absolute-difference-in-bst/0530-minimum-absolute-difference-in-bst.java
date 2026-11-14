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

 //bst inorder is sorted 
class Solution {

    int min;
    TreeNode prev;

    public int getMinimumDifference(TreeNode root) {
        min = Integer.MAX_VALUE;
        prev = null;

        dfs(root);

        return min;

    }

    private void dfs(TreeNode root) {

        if(root == null){
            return;
        }

        //left traversal
        dfs(root.left);

        if(prev != null) {
            min = Math.min(min, root.val - prev.val);
        }
        prev = root;

        //right traversal
        dfs(root.right);
        return;

    }
}