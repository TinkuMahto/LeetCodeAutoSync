class Solution {
    public int longestMonotonicSubarray(int[] nums) {

        int result = 1;

        //non-decreasing 
        int currLen = 1;
        for(int i=0; i<nums.length-1; i++) {
            if(nums[i] < nums[i+1]) {
                currLen++;
            }else{
                result = Math.max(result, currLen);
                currLen = 1;
            }
            result = Math.max(result, currLen);
        }

        //non-increasing
        currLen = 1;
        for(int i=0; i<nums.length-1; i++) {
            if(nums[i] > nums[i+1]) {
                currLen++;
            }else{
                result = Math.max(result, currLen);
                currLen = 1;
            }
            result = Math.max(result, currLen);
            
        }
        return result;
    }
}