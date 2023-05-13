import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class   Main {
    public static void main(String[] args) throws IOException {
      int [][]apt= makeAPT(new int[15][15]);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder(); //answer 값을 넣을 sb

        int T = Integer.valueOf(br.readLine());
        int k;
        int n;

        for (int i = 0; i < T; ++i) { //test case 만큼 입력값을 받는다.
            k = Integer.valueOf(br.readLine());
            n = Integer.valueOf(br.readLine());

            sb.append(apt[k][n]);
            sb.append("\n");
        }
        System.out.println(sb);
    }

    static int[][] makeAPT(int [][]apt){   //apt 000호부터 1414호까지 인원 수 초기화
        //0층 initialization {1,2,3,4,5,6,7,8,9,10,11,12,13,14}
        for (int floor = 0; floor < 15; floor++) {
            apt[floor][1]=1;    //x01호는 무조건 1명
            apt[0][floor] = floor;  //해당 코드는 0층 0호도 초기화를 시킴.(불필요하긴 하다.)
        }

        for (int floor = 1; floor < 15; ++floor) { //0층에 대해서는 이미 초기화 해두었다.
            for (int room = 2; room < 15; ++room) { //1호에 대해서는 이미 초기화 해두었다. ; 1명
                apt[floor][room]=apt[floor-1][room]+apt[floor][room-1];
            }
        }
        return apt;
    }
}
