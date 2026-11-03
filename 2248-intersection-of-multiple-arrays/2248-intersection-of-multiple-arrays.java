class Solution {
    public List<Integer> intersection(int[][] nums) {
        int n = nums.length;
        HashMap<Integer, Integer> map =  new HashMap<>();

        //find the frequiency of each element using hashmap
        for(int i=0; i < nums.length; i++) {
            for(int j=0; j < nums[i].length; j++) {
                int item = nums[i][j];
                map.put(item, map.getOrDefault(item, 0) + 1 );
            }
        }
        List<Integer> result = new ArrayList<>();

        //iteration of hashmap using lambda function
        map.forEach((key, value) -> {
            if(value == n) {
                result.add(key);
            }
        });
        return result;

    }
}