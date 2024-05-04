import java.util.*;

public class krushkalsalgorithm {
    public static int count = 0;

    static class Edge implements Comparable<Edge> {
        int src, dest, weight;

        public Edge(int src, int dest, int weight) {
            this.src = src;
            this.dest = dest;
            this.weight = weight;
        }

        @Override
        public int compareTo(Edge o) {
            return Integer.compare(this.weight, o.weight);
        }
    }

    public static int[] parent;

    public void k(int graph[][], int vertices) {
        Edge[] edges = getEdges(graph, vertices);
        Arrays.sort(edges);
        parent = new int[vertices];
        for (int i = 0; i < vertices; i++) {
            count++;
            parent[i] = i;
            count++;
        }
        count++;
        System.out.println("Edge : Weight");
        int noEdge = 0;
        int totalDistance = 0;
        for (int i = 0; noEdge < vertices - 1 && i < edges.length; i++) {
            count++;
            int x = findRoot(edges[i].src);
            int y = findRoot(edges[i].dest);
            if (x != y) {
                System.out.println(edges[i].src + " - " + edges[i].dest +
                        " : " + edges[i].weight);
                union(x, y);
                noEdge++;
                totalDistance = totalDistance + edges[i].weight;
                count++;
            }
        }
        count++;
        System.out.println("Total Distance : " + totalDistance);
    }

    public void union(int x, int y) {
        int rootX = findRoot(x);
        int rootY = findRoot(y);
        parent[rootX] = rootY;
    }

    public int findRoot(int i) {
        while (parent[i] != i) {
            i = parent[i];
        }
        return i;
    }

    public Edge[] getEdges(int[][] graph, int vertices) {
        int edgeCount = 0;
        Edge[] edges = new Edge[vertices * (vertices - 1) / 2];
        for (int i = 0; i < vertices; i++) {
            count++;
            for (int j = i + 1; j < vertices; j++) {
                if (graph[i][j] != 0) {
                    count++;
                    edges[edgeCount++] = new Edge(i, j, graph[i][j]);
                    count++;
                }
            }
            count++;
        }
        count++;
        System.out.println("Total number of steps : " + count);
        return Arrays.copyOf(edges, edgeCount);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int vertices = s.nextInt();
        int[][] graph = new int[vertices][vertices];
        krushkalsalgorithm k = new krushkalsalgorithm();
        for (int i = 0; i < vertices; i++) {
            count++;
            for (int j = 0; j < vertices; j++) {
                count++;
                graph[i][j] = s.nextInt();
                count += 2;
            }
            count++;
        }
        count++;
        k.k(graph, vertices);
        System.out.println("Total number of steps: " + count);
        s.close();
    }
}
