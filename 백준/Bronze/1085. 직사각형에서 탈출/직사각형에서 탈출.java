import java.util.Scanner;

public class   Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x,y,w,h;
        int min = 217000000;
        /**
         * (x,y) 한수의 좌표
         * (w,h) 오른쪽 위 꼭지점 좌표
         * (0,0) 직사각형의 왼쪽 아래 꼭지점 좌표
         * 왼쪽 변과의 거리    = x
         * 오른쪽 변과의 거리  = abs(x-w) = w-x
         * 위쪽 변과의 거리    = abs(y-h) = h-y
         * 아래쪽 변과의 거리  = y
         */
        x = in.nextInt();
        y = in.nextInt();
        w = in.nextInt();
        h = in.nextInt();

        int dist_min_x = Math.min(x,w-x);
        int dist_min_y = Math.min(y,h-y);
        System.out.println(Math.min(dist_min_y,dist_min_x));
    }
}


