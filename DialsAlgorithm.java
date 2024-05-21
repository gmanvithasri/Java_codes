import java.util.*;
public class Dial {
 static final int INF = Integer.MAX_VALUE;
 private int V;
 private ArrayList<ArrayList<Tuple>> adj;
 public Dial(int v) {
 this.V = v;
 this.adj = new
ArrayList<ArrayList<Tuple>>();
 for (int i = 0; i < v; i++)
 this.adj.add(new ArrayList<Tuple>());}
 public void addEdge(int u, int v, int w) {
 adj.get(u).add(new Tuple(v, w));
 adj.get(v).add(new Tuple(u, w));}
 public void shortestPath(int src, int W) {
 int[] dist = new int[V];
 Arrays.fill(dist, INF);
 ArrayList<Integer>[] B = new ArrayList[W *
V + 1];
 for (int i = 0; i < W * V + 1; i++)
 B[i] = new ArrayList<Integer>();
 B[0].add(src);
 dist[src] = 0;
 int idx = 0;
 while (true) {
 while (B[idx].isEmpty() && idx < W * V)
 idx++;
 if (idx == W * V) break;
