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
    int result = 0;
    public int averageOfSubtree(TreeNode root) {
        return solve(root);
    }

    private int  solve(TreeNode root){
        if(root == null){
            return 0 ;
        }
        
        int[] count = {0};

        int sum = findSum(root, count);
        if(root.val == sum/count[0]){
            result++;
        }

        solve(root.left);
        solve(root.right);

        return result;
    }
    private int findSum(TreeNode root, int[] count){
        if(root == null){
            return 0;
        }
        count[0]++;

        int leftSum = findSum(root.left , count);
        int rightSum = findSum(root.right, count);

        return leftSum + rightSum + root.val;
    }
}