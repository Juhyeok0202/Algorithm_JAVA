import java.util.Scanner;

public class   Main {

    static int [] stk;
    static int top=-1;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        stk = new int[N];
        int item=0;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; ++i) {
            String cmd = in.next();
            if(cmd.equals("push")) item = in.nextInt();

            switch (cmd) {
                case "push":
                    push(item);
                    break;
                case "pop":
                    sb.append(pop()+"\n");
                    break;
                case "size":
                    sb.append(size()+"\n");
                    break;
                case "empty":
                    sb.append(empty()+"\n");
                    break;
                case "top":
                    sb.append(top() + "\n");
                    break;
                default:
                    System.out.println("예외 발생");
                    break;
            }
        }
        System.out.println(sb);

        in.close();
    }

    static void push (int item) {
        stk[++top] = item;
    }

    static int empty() {
        //empty is 1
        //not empty is 0
        return top==-1 ? 1 : 0;
    }

    static int pop() {
        int del;

        if (empty() == 1) {
            del=-1;
        }else {
            del = stk[top--];
        }
        return del;
    }

    static int size() {
        return top+1;
    }

    static int top() {
        if (empty() == 1) {
            return -1;
        } else {
            return stk[top];
        }
    }
}
