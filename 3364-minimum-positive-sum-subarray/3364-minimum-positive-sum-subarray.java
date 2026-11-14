class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {

        int minSum = Integer.MAX_VALUE;

        int n = nums.size();
        
        while (l <= r) {

            int size = l;

            for (int i = 0; i < n && size <= n; i++) {
                int currSum = 0;
                for (int j = i; j < size; j++) {
                    currSum += nums.get(j);
                }
                if (currSum > 0) {
                    minSum = Math.min(currSum, minSum);
                }
                size++;
            }
            l++;
        }

        return minSum == Integer.MAX_VALUE ? -1 : minSum;

    }
}