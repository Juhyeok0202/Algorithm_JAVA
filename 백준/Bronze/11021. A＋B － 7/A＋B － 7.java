import java.io.*;
import java.util.StringTokenizer;

public class   Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int result=0;

        for (int i = 0; i < T; ++i) {
            st=new StringTokenizer(br.readLine()," ");
            result = Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken());

            bw.write("Case #"+(i+1)+": "+result+"\n");
        }
        br.close();
        bw.flush();;
        bw.close();
    }
}
