class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {

        //store the knowledge in HashMap
        HashMap<String, String> map = new HashMap<>();
        for(List<String>pair: knowledge){
            map.put(pair.get(0), pair.get(1));
        }
        //start building the result 
        StringBuilder result = new StringBuilder();

        for(int i=0; i<s.length(); i++){

            //For normal Character
            if(s.charAt(i) != '('){
                result.append(s.charAt(i));
            }

            //Bracket pair
            else{
                int j = s.indexOf(')', i);
                String key = s.substring(i+1,j);
                String value = map.getOrDefault(key,"?");
                result.append(value);
                i = j;
            }
             
        }
        return result.toString();
    }
}