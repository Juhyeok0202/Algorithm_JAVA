import java.io.*;
import java.lang.reflect.Array;
import java.util.Arrays;

public class   Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.valueOf(br.readLine());
        int[] arr = new int[n];
        
        
        // Input
        for (int i = 0; i < n; ++i) {
            arr[i] = Integer.valueOf(br.readLine());
        }
        //Quick sorting
        Arrays.sort(arr);

        for (int i = 0; i < n; ++i) {
            bw.write(arr[i]+"\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
