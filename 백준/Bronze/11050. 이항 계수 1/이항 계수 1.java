import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class   Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int result = binomialCoefficient(N,K);
        System.out.println(result);
    }

    static int factorial(int n) {
        int result=1;
        for (int i = 1; i <= n; ++i) {
            result=result*i;
        }
        return result;
    }

    static int binomialCoefficient(int N, int K){
        int result = factorial(N)/(factorial(N-K)*factorial(K));
        return result;
    }
}
