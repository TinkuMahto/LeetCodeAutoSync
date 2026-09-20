class Solution {
    public boolean checkIfExist(int[] arr) {
        Set<Integer> set = new HashSet<>();
        int zeroCount = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] != 0){
                set.add(arr[i]);
            }else{
                zeroCount++;
            }
            
        }
        for(int i=0; i<arr.length; i++){
            if(set.contains(arr[i] * 2)){
                return true;
            }
        }
        if(zeroCount >=2){
            return true;
        }
        return false;
    }
}