class Solution {
    public String intToRoman(int num) {
        String result = "";
        int[] value =  {1000,900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbol = {"M","CM", "D", "CD", "C","XC","L","XL","X","IX","V","IV","I"};

        for(int i=0; i<13; i++){
            if(num == 0){
                break;
            }
            int count = num / value[i];
            for(int j = 1; j <= count; j++){
                result += symbol[i];
            }
            num = num % value[i];
        }
        return result;

    }
}