import java.util.*;

public class Main {
    public int[] calculateSpan(int[] sp) {
        int n = sp.length;
        int[] span = new int[n];
        span[0] = 1;
        for (int i = 1; i < n; i++) {
            span[i] = 1;
            int j = i - 1;
            while (j >= 0 && sp[i] >= sp[j]) {
                span[i]++;
                j--;
            }
        }
        return span;
    }

    public static void main(String[] args) {
        Main cal = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] sp = new int[n];
        for (int i = 0; i < n; i++) {
            sp[i] = sc.nextInt();
        }
        int[] spans = cal.calculateSpan(sp);
        System.out.println("Stock Prices: " + Arrays.toString(sp));
        System.out.println("Stock Spans: " + Arrays.toString(spans));
    }
}
