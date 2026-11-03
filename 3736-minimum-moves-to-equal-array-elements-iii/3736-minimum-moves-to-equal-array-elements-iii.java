class Solution {
    public int minMoves(int[] nums) {

        int minMoves = 0;
        int max = Integer.MIN_VALUE;

        for(int i=0; i<nums.length; i++) {
            if(max < nums[i]) {
                max = nums[i];
            }
        }

        for(int i = 0; i < nums.length; i++) {
            minMoves += max - nums[i];
        }

        return minMoves;
    }
}