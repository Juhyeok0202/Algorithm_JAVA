import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
최대공약수의 경우 [GCD]
이산 구조 시간에 배웠던 간단한 알고리즘이다. GCD를 구현하면 된다.
재귀 방식도 있지만, 재귀는 메모리 stack에 계속해서 쌓이므로, 간단한 문제의 경우 직접 구현해주는 편이
좋다고 배웠으므로, 재귀 방법이 아닌 반복문을 통해서 풀이를 진행한다.

짧은 코드의 문제이므로, 가독성 보다는 빠른 방법을 채택.
 */
public class   Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int num1= Integer.valueOf(st.nextToken()); //num1
        int num2= Integer.valueOf(st.nextToken()); //num2

        int gcd = gcd(num1,num2);
        int lcm = num1 * num2 / gcd;
        System.out.println(gcd);
        System.out.println(lcm);
    }

    static int gcd(int num1, int num2){

        int remain;

        while (num2 != 0) {
            remain= num1 % num2;

            num1=num2;
            num2=remain;
        }
        return num1; //gcd
    }
}
