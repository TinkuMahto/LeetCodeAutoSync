class Solution {

    private long findCost(int[] nums, int[] cost, int target) {

        long total = 0;

        for(int i = 0; i<nums.length; i++) {
            total += (long)Math.abs(nums[i] - target) * cost[i];
        }

        return total;
    }
    public long minCost(int[] nums, int[] cost) {
        long answer = Integer.MAX_VALUE;

        int l = Integer.MAX_VALUE;
        int r = Integer.MIN_VALUE;

        for(int num : nums) {
            l = Math.min(l, num);
            r = Math.max(r, num);
        }

        while(l < r) {

            int mid = l + (r - l)/2;

            long cost1 = findCost(nums, cost, mid);
            long cost2 = findCost(nums, cost, mid+1);

            if(cost2 > cost1) {
                r = mid;
            }else{
                l = mid + 1;
            }
        }

        return findCost(nums, cost, l);
    }
}