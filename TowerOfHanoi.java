import java.util.Scanner;
public class Main {
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 int n = sc.nextInt();
 toh(n, 'A', 'C', 'B');}
 public static void toh(int n, char s, char d,
char a) {
 if (n == 1) {
 System.out.println("Move disk 1 from
"+s+" to "+d);
 return; }
 toh(n - 1,s,a,d);
 System.out.println("Move disk "+n+" from
"+s+" to "+d);
 toh(n - 1, a, d, s);
 }
}
