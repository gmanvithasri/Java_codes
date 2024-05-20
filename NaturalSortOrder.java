import java.util.*;
public class Main {
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 List<String> s = new ArrayList<>();
 int n = sc.nextInt();
 for (int i = 0; i < n; i++) {
 s.add(sc.next());
 }
 s.sort(Comparator.naturalOrder());
 s.forEach(System.out::println);
 }
}
