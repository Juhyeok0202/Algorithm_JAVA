import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class   Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        /*
            여태 Integer.valueOf가 더 직관적이어서 해당 메서드를 사용했는데, 이는 리턴타입이
            객체타입이고, parseInt는 기본 자료형을 리턴해준다.

            pareInt는 2nd 파라미터에 radix를 주어 원하는 가중값을 곱할 수 있다.
         */
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] chosenCard = new int[N];
        int chosenCardSize = chosenCard.length;
        st=new StringTokenizer(br.readLine()," ");
        for (int i = 0; i < chosenCardSize; ++i) {
            chosenCard[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(backTracking_search(chosenCard,N,M));
    }

    static int backTracking_search(int[] arr, int N, int M) {
        int result=0;
        int temp=0;
        for (int i = 0; i < N - 2; ++i) {

            if(arr[i]>M) continue;

            for (int j = i + 1; j < N - 1; ++j) {
                if (arr[i]+arr[j]>M)continue;

                for (int k = j + 1; k < N; ++k) {
                    temp=arr[i]+arr[j]+arr[k];
                    if(temp==M) return temp;
                    if(temp<M && temp>result){
                        result=temp;
                    }
                }
            }
        }

        return result;
    }
}
