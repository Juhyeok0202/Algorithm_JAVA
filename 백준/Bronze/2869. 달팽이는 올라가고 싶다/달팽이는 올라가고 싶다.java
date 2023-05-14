import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/*
Day1
daytime : A
night   : A-B
Day2
daytime : (A-B)+A
night   : (A-B)(A-B)
~~~~
Day n
daytime : (A-B)*(n-1)+A

이 때, 낮에만 달팽이가 위로 올라가므로, daytime에서의 location과 V의 값이 같다는 방정식을 세운다.
(A-B)*(n-1)+A = V
An-A-Bn+B+A = (A-B)n+B =V
therefore => n=(V-B)/(A-B)이다.
이때, 값의 결과가 소수점이 나오면, 한 칸 더 올라가야하므로, 1일을 추가해준다.
 */
public class   Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int a = Integer.valueOf(st.nextToken());
        int b = Integer.valueOf(st.nextToken());
        int v = Integer.valueOf(st.nextToken());
        int day=(v-b)/(a-b);

        if((v-b)%(a-b)!=0) day++;

        System.out.println(day);

    }
}
