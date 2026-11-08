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

    int total;

    public int pathSum(TreeNode root, int targetSum) {

        total = 0;
        
        if(root == null) {
            return 0;
        }
        HashMap<Long, Integer> map = new HashMap<>();

        map.put(0L,1);
        findPath(root, 0, targetSum, map);
        return total;
    }

    private void findPath(TreeNode curr, long sum, int targetSum, HashMap<Long, Integer> map){
        if(curr == null ){
            return;
        }

        sum += curr.val;

        if(map.containsKey(sum - targetSum)){
            total += map.get(sum - targetSum);
        }

        map.put(sum, map.getOrDefault(sum,0) + 1);

        findPath(curr.left, sum, targetSum, map);
        findPath(curr.right, sum, targetSum, map);

        map.put(sum, map.get(sum) - 1);

        return ;
    }

}