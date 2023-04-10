import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N;
        N = in.nextInt();

        Info[] info_p = new Info[N];

        for (int i = 0; i < N; ++i) {
            info_p[i] = new Info(in.nextInt(), in.next());
        }

        Arrays.sort(info_p, (a,b) -> a.age - b.age);

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; ++i) {
            sb.append(info_p[i]);
        }
        System.out.println(sb);
    }
}

class Info {
    int age;
    String name;

    public Info(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return age+" "+name+"\n";
    }
}
