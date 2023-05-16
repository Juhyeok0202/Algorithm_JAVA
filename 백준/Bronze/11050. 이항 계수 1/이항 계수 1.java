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
        System.out.println(binomialCoefficient(N,K));
    }

    static int binomialCoefficient(int N, int K) {
        if(N==K | K==0) return 1;

        return binomialCoefficient(N - 1, K - 1) + binomialCoefficient(N - 1, K);
    }
}
