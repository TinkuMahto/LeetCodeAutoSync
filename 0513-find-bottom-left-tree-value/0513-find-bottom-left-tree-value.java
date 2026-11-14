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

    int leftMost;
    int height = 0;

    public int findBottomLeftValue(TreeNode root) {
        leftMost = root.val;
        solve(root,0);
        return leftMost;
    }

    private void solve(TreeNode root, int h) {
        if(root == null) {
            return;
        }

        solve(root.left, h+1);

        if(h > height) {
            height = h;
            leftMost = root.val;
        }

        solve(root.right, h+1);

        return;

    }
}