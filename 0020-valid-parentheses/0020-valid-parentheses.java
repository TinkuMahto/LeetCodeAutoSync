class Solution {
    public boolean isValid(String s){
        Stack<Character> stack = new Stack<>();
        HashMap<Character,Character> map = new HashMap<>();
        map.put(')','(');
        map.put('}','{');
        map.put(']','[');

        for(char ch: s.toCharArray()) {
            //if ch is a closing bracket
            if (map.containsKey(ch)) {
                if (stack.isEmpty() || stack.peek() != map.get(ch)) {
                    return false;
                } else {
                    stack.pop();
                }
            }else{
                // if opening bracket
                stack.push(ch);
            }
        }
        return stack.isEmpty();
    }
}