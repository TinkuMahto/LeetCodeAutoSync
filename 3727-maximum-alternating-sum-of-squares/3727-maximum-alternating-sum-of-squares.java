class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n = nums.length;
        
        //make all elements to Positive
        for(int i=0; i<n; i++){
            nums[i] = Math.abs(nums[i]);
        }
        //sort in non-decreasing order
        Arrays.sort(nums);

        long result = 0;
        int i = 0;
        
        while(i < n/2){
           result -= nums[i] * nums[i];
           i++;
        }
        while(i < n){
            result += nums[i] * nums[i];
            i++;
        }
        return result;
    }
}