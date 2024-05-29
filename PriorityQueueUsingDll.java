import java.util.*;

class Main {
    static LinkedList<Node> queue = new LinkedList<>();

    static class Node {
        int info;
        int priority;

        Node(int info, int priority) {
            this.info = info;
            this.priority = priority;
        }
    }

    static void push(int n, int p) {
        Node newNode = new Node(n, p);
        if (queue.isEmpty() || p <= queue.getFirst().priority) {
            queue.addFirst(newNode);
        } else {
            int index = 0;
            for (Node node : queue) {
                if (node.priority > p) {
                    break;
                }
                index++;
            }
            queue.add(index, newNode);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        int res = celebritySolution(matrix);
        if (res == -1) {
            System.out.println("There is no celebrity in the party");
        } else {
            System.out.println(res + " is the celebrity in the party");
        }
    }

    static int celebritySolution(int[][] matrix) {
        // Implementation of celebrity solution goes here.
        return -1; // Placeholder return value
    }
}
