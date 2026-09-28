class Solution {
    public int maxDepth(String s) {
        int max = 0;
        int result = 0;
       for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '('){
                max++;
            }
            if(max > result){
                result = max;
            }
            if(s.charAt(i) == ')'){
                max--;
            }
        } 
        return result;
    }
}