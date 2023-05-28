import java.util.Scanner;
import java.util.Stack;

public class Main {
    //PS ( ) 로만 구성된 문자열
    //VPS 한쌍의 괄호 기호로된 "()" 문자열
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int numOftest = in.nextInt();
        String ps="";
        boolean isValid;
        for (int i = 0; i < numOftest; ++i) {
            ps = in.next();

            isValid=isVPS(ps);

            if (isValid == true) {
                sb.append("YES\n");
            } else {
                sb.append("NO\n");
            }
        }
        System.out.println(sb);
        in.close();
    }

    static public boolean isVPS(String ps) {
        Stack<Character> stk;
        boolean isValid = false;
        int psLength = ps.length();
        stk = new Stack<Character>();
        int cnt=0;
        for (int i = 0; i < psLength; ++i) {
            if (ps.charAt(i) == '(') {
                stk.push(ps.charAt(i));
                cnt++;
            } else {
                cnt--;
                if (stk.empty()==false) stk.pop();

            }
        }

        if(stk.empty()&&cnt==0) isValid=true;


        return isValid;
    }

}
