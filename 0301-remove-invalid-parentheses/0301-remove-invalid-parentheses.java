class Solution {
    private Set<String> st = new HashSet<>();
    private int n;
    private int maxLen;

    private void backtracking(String s, int i, StringBuilder curr, int count){
        if(count < 0){   // invalid 
            return;
        }
        if(i == n){
            if(count == 0){
                if(curr.length() > maxLen){  //found a longer valid string
                    maxLen = curr.length();
                    st.clear();
                }

                if(curr.length() == maxLen){
                    st.add(curr.toString());
                }
            }
            return;
        }
        char c = s.charAt(i);
        if(c != '(' && c != ')'){    //letter always keep
            curr.append(c);
            backtracking(s, i+1, curr, count);
            curr.deleteCharAt(curr.length()-1);
            return;
        }
        //do
        curr.append(c);

        //explore
        backtracking(s, i+1, curr, count +(c == '(' ? 1 : -1));

        //undo and explore
        curr.deleteCharAt(curr.length()-1);
        backtracking(s, i+1, curr, count);
        
    }
    public List<String> removeInvalidParentheses(String s) {
        n = s.length();
        maxLen = 0;
        st.clear();
        backtracking(s, 0, new StringBuilder(), 0);

        return new ArrayList<>(st);
    }
}