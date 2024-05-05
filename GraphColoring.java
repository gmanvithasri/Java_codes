Graphcoloring
import java.util.*;
public class GraphColoring {
    static int V;
    static int[][] graph;
    static void showColors(int[] color) {
        for (int i = 0; i < V; i++) {
            System.out.print(color[i] + " "); }
        System.out.println();}
    static boolean isValid(int v, int[] color, int c) {
        for (int i = 0; i < V; i++) {
            if (graph[v][i] == 1 && c == color[i]) {
                return false;}}
        return true;}
    static boolean graphColoring(int colors, int[] color, int vertex) {
        if (vertex == V) {
            return true;}
        for (int col = 1; col <= colors; col++) {
            if (isValid(vertex, color, col)) {
                color[vertex] = col;
               if (graphColoring(colors, color, vertex + 1)){
                    return true;  }
                color[vertex] = 0;}}
        return false;}
    static boolean checkSolution(int m) {
        int[] color = new int[V];
        for (int i = 0; i < V; i++) {
            color[i] = 0;}
        if (!graphColoring(m, color, 0)) {
            System.out.println("No Solution");
            return false;}
        showColors(color);
        return true; }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        V = s.nextInt();
        graph = new int[V][V];
        for (int i = 0; i < V; i++) {
            for (int j = 0; j < V; j++) {
                graph[i][j] = s.nextInt();}}
        int colors = s.nextInt();
        checkSolution(colors);
        s.close();}}
