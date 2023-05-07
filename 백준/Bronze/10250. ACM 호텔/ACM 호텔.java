import java.util.Scanner;

public class   Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T,H,W,N;

        T = in.nextInt();   //#OF TESTCASE

        for(int k=0; k<T ;++k){
            H = in.nextInt();   //height
            W = in.nextInt();   //width
            N = in.nextInt();   //nth customer


            int [][]hotel = new int [W][H];

//        50 40 30 20 10 00 51 41 31 21 11 10 52 41~~~5 11 4 11 3 11 2 11 1 11 0 11
            int count=0;
            int result=0;
            for (int j = 1; j <=W; ++j) { // 같은 층 호수
                for (int i = 1; i <= H; ++i) { //층 위치
                    count++;
                    result = i*100 + j;
                    if (count == N) break;
                }
                if(count==N)break;
            }

            System.out.println(result);
        }
        in.close();

    }
}


