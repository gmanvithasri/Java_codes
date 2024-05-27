import java.util.*;

class Main {
    static Stack<Integer> s = new Stack<Integer>();
    static Stack<Integer> a = new Stack<Integer>();

    static void push(int x) {
        if (s.isEmpty()) {
            s.push(x);
            a.push(x);
        } else {
            s.push(x);
            if (x < a.peek()) {
                a.push(x);
            }
        }
    }

    static void min() {
        if (s.isEmpty()) {
            System.out.print("stack is empty");
        } else {
            System.out.print(a.peek());
        }
    }

    public static void main(String ar[]) {
        Scanner sw = new Scanner(System.in);
        int n = sw.nextInt();
        for (int i = 0; i < n; i++) {
            push(sw.nextInt());
        }
        min();
    }
}
