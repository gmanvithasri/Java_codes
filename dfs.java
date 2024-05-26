import java.util.*;

class Graph {
    int vertices;
    LinkedList<Integer>[] adjList;

    Graph(int vertices) {
        this.vertices = vertices;
        adjList = new LinkedList[vertices];
        for (int i = 0; i < vertices; ++i)
            adjList[i] = new LinkedList<>();
    }

    void addEdge(int u, int v) {
        adjList[u].add(v);
    }

    void dfsUtil(int v, boolean[] visited) {
        visited[v] = true;
        System.out.print(v + " ");
        for (int neighbor : adjList[v]) {
            if (!visited[neighbor]) {
                dfsUtil(neighbor, visited);
            }
        }
    }

    void dfs(int startNode) {
        boolean[] visited = new boolean[vertices];
        dfsUtil(startNode, visited);
    }
}

class BinaryHeap {
    private int[] heap;
    private int size;

    public BinaryHeap(int capacity) {
        heap = new int[capacity];
        size = 0;
    }

    public void insert(int value) {
        if (size == heap.length) throw new IllegalStateException("Heap is full");
        heap[size] = value;
        heapifyUp(size);
        size++;
    }

    public int poll() {
        if (size == 0) throw new NoSuchElementException("Heap is empty");
        int root = heap[0];
        heap[0] = heap[size - 1];
        size--;
        heapifyDown(0);
        return root;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    private void heapifyUp(int index) {
        int parentIndex = (index - 1) / 2;
        while (index > 0 && heap[index] < heap[parentIndex]) {
            swap(index, parentIndex);
            index = parentIndex;
            parentIndex = (index - 1) / 2;
        }
    }

    private void heapifyDown(int index) {
        while (index < size) {
            int leftChildIndex = 2 * index + 1;
            int rightChildIndex = 2 * index + 2;
            int smallerChildIndex = leftChildIndex;

            if (rightChildIndex < size && heap[rightChildIndex] < heap[leftChildIndex]) {
                smallerChildIndex = rightChildIndex;
            }

            if (leftChildIndex >= size || heap[index] <= heap[smallerChildIndex]) {
                break;
            }

            swap(index, smallerChildIndex);
            index = smallerChildIndex;
        }
    }

    private void swap(int i, int j) {
        int temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Graph operations
        System.out.print("Enter number of vertices in the graph: ");
        int vertices = scanner.nextInt();
        Graph graph = new Graph(vertices);

        System.out.println("Enter edges in the format 'u v' (without quotes) and -1 to stop:");
        while (true) {
            int u = scanner.nextInt();
            if (u == -1) break;
            int v = scanner.nextInt();
            graph.addEdge(u, v);
        }

        System.out.print("Enter start node for DFS: ");
        int startNode = scanner.nextInt();
        System.out.println("DFS traversal of the graph:");
        graph.dfs(startNode);
        System.out.println();

        // BinaryHeap operations
        System.out.print("Enter capacity of the min-heap: ");
        int capacity = scanner.nextInt();
        BinaryHeap minHeap = new BinaryHeap(capacity);

        System.out.println("Enter values to insert into the heap and -1 to stop:");
        while (true) {
            int value = scanner.nextInt();
            if (value == -1) {
                break;
            }
            minHeap.insert(value);
        }

        System.out.println("Elements polled from the min-heap:");
        while (!minHeap.isEmpty()) {
            System.out.println(minHeap.poll());
        }
    }
}
