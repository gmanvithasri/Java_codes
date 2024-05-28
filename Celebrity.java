import java.util.*;

public class Celebrity {

    public static int celebritySolution(int[][] mat) {
        Stack<Integer> stk = new Stack<>();
        for (int i = 0; i < mat.length; i++) {
            stk.push(i);
        }
        while (stk.size() > 1) {
            int col = stk.pop();
            int row = stk.pop();
            if (mat[row][col] == 1) {
                stk.push(col);
            } else {
                stk.push(row);
            }
        }
        int x = stk.pop();
        for (int j = 0; j < mat.length; j++) {
            if (j == x) continue;
            if (mat[x][j] == 1) {
                return -1;
            }
        }
        for (int i = 0; i < mat.length; i++) {
            if (i == x) continue;
            if (mat[i][x] == 0) {
                return -1;
            }
        }
        return x;
    }

    static LinkedList<Node> queue = new LinkedList<>();

    static class Node {
        int info;
        int priority;

        Node(int info, int priority) {
            this.info = info;
            this.priority = priority;
        }
    }

    static void push(int element, int priority) {
        Node newNode = new Node(element, priority);
        queue.add(newNode);
        queue.sort(Comparator.comparingInt(a -> a.priority));
    }

    static int peek() {
        return queue.getFirst().info;
    }

    static int pop() {
        return queue.removeFirst().info;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n = sc.nextInt();
        System.out.println("Enter elements and their priorities:");
        for (int i = 0; i < n; i++) {
            int element = sc.nextInt();
            int priority = sc.nextInt();
            push(element, priority);
        }
        System.out.println("Popped element: " + pop());
        System.out.println("Peeked element: " + peek());
    }
}
