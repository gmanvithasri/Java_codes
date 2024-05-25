import java.util.Scanner;

public class BinaryHeap {
    private int[] heap;
    private int size;
    private int capacity;

    public BinaryHeap(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        this.heap = new int[capacity];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int peek() {
        if (isEmpty()) throw new IllegalStateException();
        return heap[0];
    }

    public void insert(int value) {
        if (size == capacity) throw new IllegalStateException();
        heap[size] = value;
        heapifyUp(size);
        size++;
    }

    public int poll() {
        if (isEmpty()) throw new IllegalStateException();
        int root = heap[0];
        heap[0] = heap[size - 1];
        size--;
        heapifyDown(0);
        return root;
    }

    private void heapifyUp(int index) {
        int parentIndex = (index - 1) / 2;
        while (index > 0 && heap[parentIndex] > heap[index]) {
            swap(parentIndex, index);
            index = parentIndex;
            parentIndex = (index - 1) / 2;
        }
    }

    private void heapifyDown(int index) {
        int leftChildIndex = 2 * index + 1;
        int rightChildIndex = 2 * index + 2;
        int smallest = index;

        if (leftChildIndex < size && heap[leftChildIndex] < heap[smallest]) {
            smallest = leftChildIndex;
        }

        if (rightChildIndex < size && heap[rightChildIndex] < heap[smallest]) {
            smallest = rightChildIndex;
        }

        if (smallest != index) {
            swap(index, smallest);
            heapifyDown(smallest);
        }
    }

    private void swap(int index1, int index2) {
        int temp = heap[index1];
        heap[index1] = heap[index2];
        heap[index2] = temp;
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

    public void dfs(int startVertex) {
        boolean[] visited = new boolean[vertices];
        dfsUtil(startVertex, visited);
    }

    private void dfsUtil(int vertex, boolean[] visited) {
        visited[vertex] = true;
        System.out.print(vertex + " ");

        for (int adj : adjList[vertex]) {
            if (!visited[adj]) {
                dfsUtil(adj, visited);
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
        graph.dfs(s);
    }
}
