class Solution {
    public String maxSumOfSquares(int num, int sum) {
        //corner case
        if(sum > num * 9){
            return "";
        }
        int nines = sum / 9;  //find the no of possible 9's
        int rem = sum % 9;    //find the remainder

        StringBuilder result = new StringBuilder();
        for(int i=1; i<=nines; i++){
            result.append("9");
        }
        if(rem > 0){
            result.append(""+rem);
        }
        
        for(int i=num-result.length(); i>0 ;i--){
            result.append("0");
        }
        return result.toString();

    }
}