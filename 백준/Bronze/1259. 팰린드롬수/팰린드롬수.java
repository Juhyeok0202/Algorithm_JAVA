import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/*
이 문제 C++이었으면, 포인터로 Queue 만들어서 풀면 좋을 듯.
 */
public class   Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int front;
        int rear;
        boolean isPalindrome;
        while(true){
            isPalindrome=true;

            String num = br.readLine(); // received to ith line
            front=0;
            rear = num.length()-1; //input string의 마지막 index number를 가르킴

            if(num.equals("0"))break;

            while(front<rear){
                if(num.charAt(front++)!=num.charAt(rear--)){
                    isPalindrome=false;
                    break;
                }else{
                    isPalindrome=true;
                }
            }
            if(isPalindrome==true) sb.append("yes\n");
            else sb.append("no\n");
        }
        // out of loop
        System.out.println(sb);
    }
}



