import java.util.*;

class Main {
    static ArrayList<String> s = new ArrayList<String>();

    public static void perm(char[] arr, int fi) {
        int n = arr.length;
        if (fi == n - 1) {
            s.add(new String(arr));
            return;
        }
        for (int i = fi; i < n; i++) {
            swap(arr, fi, i);
            perm(arr, fi + 1);
            swap(arr, fi, i);
        }
    }

    public static void swap(char[] arr, int fi, int i) {
        char temp = arr[fi];
        arr[fi] = arr[i];
        arr[i] = temp;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        char[] arr = input.toCharArray();
        perm(arr, 0);
        Collections.sort(s);
        for (String str : s)
            System.out.println(str);
    }
}
