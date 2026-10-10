class Solution {
    public long minSumSquareDiff(int[] nums1, int[] nums2, int k1, int k2) {
        int n = nums1.length;
        long k = (long)k1 + k2;
        int len = 1_00_000 +1;
        
        int[] countDiff = new int[len];
        for(int i=0; i<n; i++){
            int d = Math.abs(nums1[i]-nums2[i]);
            countDiff[d]++;
        }
        for(int currDiff = len-1; currDiff>0 && k > 0; currDiff--){
            long countOpr = Math.min(k, countDiff[currDiff]);
            countDiff[currDiff] -= countOpr;
            countDiff[currDiff-1] += countOpr;
            k -= countOpr;

        }
        long result = 0;
        for(int i=0; i<len; i++){
            result += ((long) countDiff[i] * i * i);
        }

        return result;
    }
}