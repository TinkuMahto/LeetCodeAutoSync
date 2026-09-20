class Solution {
    public int reverseDegree(String s) {
        int result = 0;
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            result += (i+1) * (122 - ch + 1);

        }
        return result;
    }
}