class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        paragraph = paragraph.toLowerCase();

        String[] words = paragraph.split("[ !?',;.]+");
        HashMap<String, Integer> map = new HashMap<>();
        Set<String> bannedWord = new HashSet<>();
        
        for(String wd : banned){
            bannedWord.add(wd);
        }

        for(String word : words){
            if(!bannedWord.contains(word)){
                map.put(word, map.getOrDefault(word,0)+1);
            }
        }
        int maxFreq = 0;
        String result ="";
        for(String word : map.keySet()){
            int value = map.get(word);
            if(value > maxFreq){
                maxFreq = value;
                result = word;
            }
        }
        return result;
    }
}