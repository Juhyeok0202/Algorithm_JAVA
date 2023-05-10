import java.util.Scanner;

/*
이 문제 C++이었으면, 포인터로 Queue 만들어서 풀면 좋을 듯.
 */
public class   Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String num ;
        StringBuilder sb = new StringBuilder();
        boolean isPalindrome=true;
        while(true){

            num = in.next();

            if(num.equals("0")) break;

            int front=0;    // 숫자의 첫번째
            int rear=num.length()-1;  //맨 마지막 숫자


                while(front<rear){
                    if(num.charAt(front++)!=num.charAt(rear--)){
                        isPalindrome=false;
                        break;
                    }
                }
                if(isPalindrome==false) sb.append("no\n");
                else sb.append("yes\n");
                isPalindrome=true;
        }
        System.out.println(sb);
    }
}



