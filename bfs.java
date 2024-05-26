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

    void bfs(int startNode) {
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[vertices];
        visited[startNode] = true;
        queue.add(startNode);

        while (!queue.isEmpty()) {
            int currentNode = queue.poll();
            System.out.print(currentNode + " ");
            for (int neighbor : adjList[currentNode]) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }
    }
}

public static void restoreDown(int[] arr, int len, int index, int k) {
    int[] child = new int[k + 1];
    while (true) {
        for (int i = 1; i <= k; i++)
            child[i] = (k * index + i) < len ? (k * index + i) : -1;

        int maxChild = -1, maxChildIndex = 0;
        for (int i = 1; i <= k; i++) {
            if (child[i] != -1 && arr[child[i]] > maxChild) {
                maxChildIndex = child[i];
                maxChild = arr[child[i]];
            }
        }
        if (maxChild == -1) break;
        if (arr[index] < arr[maxChildIndex])
            swap(arr, index, maxChildIndex);

        index = maxChildIndex;
    }
}

public static void restoreUp(int[] arr, int index, int k) {
    int parent = (index - 1) / k;
    while (parent >= 0) {
        if (arr[index] > arr[parent]) {
            swap(arr, index, parent);
            index = parent;
            parent = (index - 1) / k;
        } else break;
    }
}

public static void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
}
