import java.util.Scanner;

public class KarrayHeap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int capacity = sc.nextInt();
        int[] arr = new int[capacity];
        for (int i = 0; i < capacity; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int n = capacity;
        buildHeap(arr, n, k);
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
        
        int element = sc.nextInt();
        insert(arr, n, k, element);
        n++;
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
        
        System.out.println("Extracted max is " + extractMax(arr, n, k));
        n--;
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void buildHeap(int[] arr, int n, int k) {
        for (int i = (n - 1) / k; i >= 0; i--)
            restoreDown(arr, n, i, k);
    }

    public static void insert(int[] arr, int n, int k, int elem) {
        arr[n - 1] = elem;
        restoreUp(arr, n - 1, k);
    }

    public static int extractMax(int[] arr, int n, int k) {
        int max = arr[0];
        arr[0] = arr[n - 1];
        restoreDown(arr, n - 1, 0, k);
        return max;
    }

    private static void restoreDown(int[] arr, int n, int i, int k) {
        int childIndex;
        int maxIndex = i;
        while ((childIndex = k * i + 1) < n) {
            for (int j = 0; j < k && childIndex + j < n; j++) {
                if (arr[childIndex + j] > arr[maxIndex]) {
                    maxIndex = childIndex + j;
                }
            }
            if (maxIndex == i) {
                break;
            }
            swap(arr, i, maxIndex);
            i = maxIndex;
        }
    }

    private static void restoreUp(int[] arr, int i, int k) {
        int parentIndex = (i - 1) / k;
        while (i > 0 && arr[i] > arr[parentIndex]) {
            swap(arr, i, parentIndex);
            i = parentIndex;
            parentIndex = (i - 1) / k;
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

class Graph {
    private final int vertices;
    private final LinkedList<Integer>[] adjList;

    public Graph(int vertices) {
        this.vertices = vertices;
        adjList = new LinkedList[vertices];
        for (int i = 0; i < vertices; i++) {
            adjList[i] = new LinkedList<>();
        }
    }

    public void addEdge(int from, int to) {
        adjList[from].add(to);
    }

    public void bfs(int startVertex) {
        boolean[] visited = new boolean[vertices];
        LinkedList<Integer> queue = new LinkedList<>();
        visited[startVertex] = true;
        queue.add(startVertex);

        while (queue.size() != 0) {
            startVertex = queue.poll();
            System.out.print(startVertex + " ");

            for (int adj : adjList[startVertex]) {
                if (!visited[adj]) {
                    visited[adj] = true;
                    queue.add(adj);
                }
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int vertices = sc.nextInt();
        Graph graph = new Graph(vertices);
        int edges = sc.nextInt();
        System.out.println("Enter the edges (from to):");
        for (int i = 0; i < edges; i++) {
            int from = sc.nextInt();
            int to = sc.nextInt();
            graph.addEdge(from, to);
        }
        int s = sc.nextInt();
        graph.bfs(s);
    }
}
