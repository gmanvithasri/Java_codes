import java.util.*;
public class distribute {
 static boolean checkCount(int arr[], int n,
int k) {
 HashMap<Integer, Integer> hash = new
HashMap<>();
 for (int i = 0; i < n; i++) {
 if (!hash.containsKey(arr[i]))
 hash.put(arr[i], 0);
 hash.put(arr[i], hash.get(arr[i]) + 1);}
 for (Map.Entry<Integer, Integer> entry :
hash.entrySet()) {
 if (entry.getValue() > 2 * k)
 return false;}
 return true;
 }
 public static void main(String[] args) {
 int arr[] = { 1, 1, 2, 3, 1 };
 int n = arr.length;
 int k = 2;
 if (checkCount(arr, n, k))
 System.out.println("Yes");
 else
 System.out.println("No");
 }
}
