import java.util.Scanner;

public class   Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int passedCount=1;
        int range =2;

        if (N == 1) {
            System.out.println(1);
        } else {
            while(range <= N){
                range+=(passedCount++)*6;
            }
            System.out.println(passedCount);
        }
        in.close();
    }
}



