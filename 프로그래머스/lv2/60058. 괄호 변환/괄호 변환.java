import java.util.Stack;

class Solution {
     public static boolean isCorrect(String p) {
        Stack<Character> stk = new Stack<>();
        for (int i = 0; i < p.length(); ++i) {
            char c = p.charAt(i);

            if(c=='(') stk.add(c);
            else {
                if(stk.isEmpty())
                    return false;
                else stk.pop();
            }
        }
        return stk.isEmpty();
    }
    
    private String dfs(String p) {
        if(p.length()==0)
            return "";

        String u = "";
        String v = "";

        int open =0, close=0;
        
        for (int i = 0; i < p.length(); ++i) {
            char c = p.charAt(i);
            if(c=='(')
                open++;
            else
                close++;
            if((open != 0 && close != 0) && open == close){
                u = p.substring(0, i + 1);
                if(i!=p.length()-1)
                    v=p.substring(i+1,p.length());
            }
            break;
        }

        if(!isCorrect(u)){
            String temp = "("+dfs(v);
            temp += ")";
            u=u.substring(1,p.length()-1);
            u=u.replace("(",".");
            u=u.replace(")","(");
            u=u.replace(".", ")");
            temp+=u;
            return temp;
        }
        else{
            return u+dfs(v);
        }
    }
    public String solution(String p) {
        if(isCorrect(p))
            return p;
        return dfs(p);
    }
}
 
