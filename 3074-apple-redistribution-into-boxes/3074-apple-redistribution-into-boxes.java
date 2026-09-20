class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        Arrays.sort(capacity);
        int appleSum = 0;
        int countBox = 0;
        for(int i=0; i< apple.length; i++){
            appleSum += apple[i];
        }
        int idx = capacity.length - 1;
        while(appleSum > 0){
            appleSum -= capacity[idx--];
            countBox++;
        }
        return countBox;
    }
}