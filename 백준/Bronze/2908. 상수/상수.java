import java.util.Scanner;

public class   Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String A,B;
        A = in.next();
        B = in.next();
        in.close();
        
        StringBuffer sb_A = new StringBuffer(A);
        StringBuffer sb_B = new StringBuffer(B);

        //reverse
        int sgViewInpue_A = Integer.parseInt(sb_A.reverse().toString());
        int sgViewInpue_B = Integer.parseInt(sb_B.reverse().toString());

        //comparision
        System.out.println(sgViewInpue_A>sgViewInpue_B ? sgViewInpue_A : sgViewInpue_B);
    }
}


