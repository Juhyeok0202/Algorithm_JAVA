import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

/**
 * 문자열을 입력 받는 것이므로, 애초에 문자열만을 입력받는 Buff.Reader를 이용해서 풀이
 * 하여 속도 최적화 한다.
 */
public class   Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int L = Integer.parseInt(br.readLine());
        String str = br.readLine();

        //BigInteger가 문자열로 되어 있기 때문에, 문자열을 인자 값으로 넣어 초기화해줌.
        BigInteger result = new BigInteger("0"); // like int rest=0;
        for (int i = 0; i < L; ++i) {
            result = result.add(BigInteger.valueOf(str.charAt(i) - 96).multiply(BigInteger.valueOf(31).pow(i)))
                    .remainder(BigInteger.valueOf(1234567891));
        }
        System.out.println(result);
    }
}



