public class Main {
 public static void main(String[] args) {
 int n = 5;
 int r = 3;
 int p = fact(n)/fact(n - r);
 int c = fact(n)/(fact(r)*fact(n-r));
 System.out.println(p+" "+c);
 }
 public static int fact(int n) {
 if (n <= 1) {
 return 1;}
 return n * fact(n - 1);}
}
