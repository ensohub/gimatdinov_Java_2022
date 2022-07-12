public class Solution {
    public boolean isValid(String s) {
        Map<Character, Character> dic = new HashMap<>();
        dic.put( ')', '(');
        dic.put( ']', '[');
        dic.put( '}', '{');
        Stack<Character> stk = new Stack<>();

        int len = s.length();
        for( int i = 0; i < len; i++ ){
            char c = s.charAt(i);
            if( c == '(' || c == '[' || c == '{' ){
                stk.push(c);
            }else{
                if( stk.empty() ) return false;
                if( dic.get(c) != stk.pop()  ) return false;
            }
        }
        return stk.empty();
    }
}