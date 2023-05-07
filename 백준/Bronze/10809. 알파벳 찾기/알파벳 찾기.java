import java.util.Arrays;
import java.util.Scanner;

public class   Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String word = in.next();
        in.close();

        int[] alphArr = new int[26]; //알파벳은 총 26개 a~z

        alphArr= Arrays.stream(alphArr).map(idx -> idx=-1).toArray(); //-1로 전체 초기화

        for (int i = 0; i < word.length(); ++i) { //알파벳 배열에 값 할당을 위한 반복문
            if(alphArr[word.charAt(i)-97]==-1){ //바뀌지 않은 초기값(-1)이면, 변경
                alphArr[word.charAt(i)-97]=i;
            }//아니면, 행동 X
        }

        for (int i = 0; i < alphArr.length; ++i) {
            System.out.print(alphArr[i]+" ");
        }
    }
}


