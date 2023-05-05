import java.util.Scanner;

public class   Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int theNumOfSubject;    //과목 수
        int M = -2147000000;  //max_score

        theNumOfSubject = in.nextInt();
        double score[] = new double[theNumOfSubject]; //과목 수에 따른 점수 40 80 60
        int scoreArrSize = score.length;
        for (int i = 0; i < scoreArrSize; ++i) {
            score[i] = in.nextInt();
        }

        for (double i:score) { // M값 도출
            M = (int)Math.max(i, M);
        }

        double sum=0;

        for (int i = 0; i < scoreArrSize; ++i) { //점수 고치기
            score[i]= score[i]/M*100;
            sum+=score[i];
        }

        double avg = sum / theNumOfSubject;
        System.out.println(avg);

        in.close();
    }
}


