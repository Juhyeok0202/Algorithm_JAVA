import java.util.Scanner;

/**
 * 첫번째 풀이가 너무 비효율 적이어서 수학적인 풀이로 재 해석
 * 첫번째 풀이 방법
 * 1.반복문을 통한 TestCase번 반복
 * 2.double-loop 를 통해서 floorNumber-loop와 roomNumber-loop로 하여 결과값을 받음
 * 따라서, 시간 복잡도가 매우 큼
 * O(WXHXN)으로 W,H,N 값이 크면 클 수록 시간이 기하적으로 증가할 수 있음.
 */
public class   Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T,H,W,N;
        int floorNumber;
        int roomNumber;
        T = in.nextInt();   //#OF TESTCASE

        for(int k=0; k<T ;++k) {
            H = in.nextInt();   //height
            W = in.nextInt();   //width 필요없는 변수
            N = in.nextInt();   //nth customer

            if(N%H==0){
                floorNumber=H*100;
                roomNumber =N/H;
            }else{
                floorNumber = N%H*100;
                roomNumber = N/H +1;
            }
            int roomCode = floorNumber + roomNumber;
            System.out.println(roomCode);
        }
        in.close();

    }
}


