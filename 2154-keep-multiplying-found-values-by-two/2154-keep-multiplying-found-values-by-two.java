class Solution {
    public int findFinalValue(int[] nums, int original) {
        Set<Integer> set = new HashSet<>();
        for(int i=0; i<nums.length; i++){
            set.add(nums[i]);
        }
        int result = original;
        while(true){
            if(!set.contains(result)){
                break;
            }
            result *= 2;
        }
        return result;
        
    }
}