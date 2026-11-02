class Solution {
    public int minMoves(int[] nums) {
        int n = nums.length;
        int min = Integer.MAX_VALUE;

        long sum = 0;

        for(int i=0; i < n; i++) {

            sum += nums[i];

            if(min > nums[i]) {
                min = nums[i];
            }
        }

        return (int)sum - n * min;
    }
}