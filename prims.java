import java.util.Arrays;
import java.util.Scanner;

public class Primsalgorithm {
    public void prim(int graph[][], int vertices) {
        boolean[] selected = new boolean[vertices];
        Arrays.fill(selected, false);
        selected[0] = true;
        System.out.println("Edge : Weight");
        int noedge = 0;
        int totalDistance = 0;
        int count = 0;
        while (noedge < vertices - 1) {
            int min = Integer.MAX_VALUE;
            int x = 0;
            int y = 0;
            for (int i = 0; i < vertices; i++) {
                count++;
                if (selected[i]) {
                    count++;
                    for (int j = 0; j < vertices; j++) {
                        count++;
                        if (!selected[j] && graph[i][j] != 0 && graph[i][j] < min) {
                            min = graph[i][j];
                            x = i;
                            y = j;
                            count++;
                        }
                    }
                    count++;
                }
            }
            count++;
            if (min != Integer.MAX_VALUE) {
                System.out.println(x + " - " + y + " : " + graph[x][y]);
                selected[y] = true;
                noedge++;
                totalDistance += graph[x][y];
                count++;
            }
        }
        System.out.println("Total Distance from node 0 to last node: " + totalDistance);
        System.out.println("Total number of steps: " + count);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Primsalgorithm g = new Primsalgorithm();
        int vertices = s.nextInt();
        int[][] graph = new int[vertices][vertices];
        for (int i = 0; i < vertices; i++) {
            for (int j = 0; j < vertices; j++) {
                graph[i][j] = s.nextInt();
            }
        }
        g.prim(graph, vertices);
        s.close();
    }
}
