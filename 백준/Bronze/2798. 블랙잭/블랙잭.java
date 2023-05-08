import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class   Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int N = in.nextInt(); // N장의 카드
        int M = in.nextInt(); // 딜러가 외친 숫자 M
        int []card = new int[N];

        for (int i = 0; i < card.length; ++i) { //card에 쓰여진 숫자설정
            card[i] = in.nextInt();
        }
//        int[] selectedCard = new int[3];

        /**
         * [Renewal RULE]
         * summation(selectedCard) <= M
         */

        //Broth_Forth Algorithm
        int answer=sumCards(N, M, card);

        System.out.println(answer);
    }

    /**
     *
     * @param N
     * @param M
     * @param card
     * @return
     */
    static int sumCards(int N, int M, int []card) {
        int sumAmongTriCard=0;
        int temp=0;
        for (int i = 0; i < N - 2; ++i) {
            for (int j = i + 1; j < N - 1; ++j) {
                for (int k = j + 1; k < N; ++k) {
                    temp = (card[i]+card[j]+card[k]);
                    if (temp == M) {
                        return temp;
                    }
                    //update
                    if(sumAmongTriCard < temp && temp < M) {
                        sumAmongTriCard = temp;
                    }
                }
            }
        }
        return sumAmongTriCard;
    }
}



