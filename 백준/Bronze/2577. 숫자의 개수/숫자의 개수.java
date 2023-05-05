import java.util.Scanner;

public class   Main {
    public static void main(String[] args) {
        int arr[] = new int[10]; // 계산 결과 값은 10진수로 표현된다.
        int A,B,C;

        Scanner in = new Scanner(System.in);
        A = in.nextInt();
        B = in.nextInt();
        C = in.nextInt();

        String result = Integer.toString(A*B*C);

        int resultSize=result.length();
        for (int i = 0; i < resultSize; ++i) {
            arr[result.charAt(i)-48]++;
        }

        int arrSize = arr.length;
        for (int i = 0; i < arrSize; ++i) {
            System.out.println(arr[i]);
        }
    }
}


