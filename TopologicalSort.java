import java.util.*;

public class TopologicalSort {

    public static void topologicalSort(int vertices, List<List<Integer>> graph) {
        int[] indegree = new int[vertices];

        // calculate indegree of each vertex
        for (int i = 0; i < vertices; i++) {
            for (int neighbor : graph.get(i)) {
                indegree[neighbor]++;
            }
        }

        Queue<Integer> queue = new LinkedList<>();

        // add all vertices with indegree 0
        for (int i = 0; i < vertices; i++) {
            if (indegree[i] == 0) {
                queue.add(i);
            }
        }

        List<Integer> topoOrder = new ArrayList<>();

        while (!queue.isEmpty()) {
            int node = queue.poll();
            topoOrder.add(node);

            for (int neighbor : graph.get(node)) {
                indegree[neighbor]--;
                if (indegree[neighbor] == 0) {
                    queue.add(neighbor);
                }
            }
        }

        // check for cycle
        if (topoOrder.size() != vertices) {
            System.out.println("Graph contains a cycle. Topological sort not possible.");
            return;
        }

        System.out.println("Topological Sort Order:");
        for (int node : topoOrder) {
            System.out.print(node + " ");
        }
    }

    public static void main(String[] args) {
        int vertices = 6;
        List<List<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < vertices; i++) {
            graph.add(new ArrayList<>());
        }

        // directed edges
        graph.get(5).add(2);
        graph.get(5).add(0);
        graph.get(4).add(0);
        graph.get(4).add(1);
        graph.get(2).add(3);
        graph.get(3).add(1);

        topologicalSort(vertices, graph);
    }
}
