class Solution {
    public boolean isValid(String s) {
   
        Stack<Character> st = new Stack<>();
        for( int  i =0; i < s.length() ;i++){
              char ch = s.charAt(i);
           if( ch == '(' || ch == '{' || ch == '['){
            st.push(ch);
           }
           else {
            if( st.size()==0){
                return false;
            }
            if(( st.peek()=='(' && ch == ')')||
            ( st.peek()=='[' && ch == ']')||
            ( st.peek()=='{' && ch == '}')){
                st.pop();
            }
            else {
                return false;
            }
           }     
        }
        return st.size()==0;
    }
}
// Another method
class Solution {
    public boolean isValid(String s) {
        HashMap<Character, Character> br= new HashMap<>();
        br.put(')','(');
        br.put('}','{');
        br.put(']','[');
        Stack<Character> stack = new Stack<>();
        int len = s.length();
        for(int i=0;i<len;i++){
            char b = s.charAt(i);
            if(b=='(' || b=='{' || b=='['){
                stack.push(b);
            }
            else{
                if(stack.isEmpty()) return false;
                else{
                char top = stack.pop();
                if(top!=br.get(b)){
                    return false;
                }
                }
            }
        }
        return stack.isEmpty();
    }
}
