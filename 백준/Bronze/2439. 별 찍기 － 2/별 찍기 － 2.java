import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int N;
        Scanner in = new Scanner(System.in);
        N = in.nextInt();
        for (int i = 0; i < N; ++i) {
            //space
            for(int j=N-1; j>i; --j){
                System.out.print(" ");
            }
            //star
            for (int j = 0; j < i+1; ++j) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
