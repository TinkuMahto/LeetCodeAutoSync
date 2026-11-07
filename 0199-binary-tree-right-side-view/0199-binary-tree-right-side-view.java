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
    public List<Integer> rightSideView(TreeNode root) {


        List<Integer> result = new ArrayList<>();

        //if no node present in the tree
        if(root == null) return result;

        Queue<TreeNode> q = new LinkedList<>();

        q.offer(root);
    
        

        while(!q.isEmpty()){
            int size = q.size();

            for(int i=0; i<size; i++) {

                TreeNode curr = q.poll();

                // Add the last node of each level
                if(i == size-1) {
                    result.add(curr.val);
                }

                if(curr.left != null) {
                    q.offer(curr.left);
                }
                if(curr.right != null) {
                    q.offer(curr.right);
                }
            }
        }
        return result;

    }
}