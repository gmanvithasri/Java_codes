import java.util.*;
class Solution {
 static int[] bellman_ford(int V,
ArrayList<ArrayList<Integer>> edges, int S){
 int[] dist = new int[V];
 for (int i = 0; i < V; i++)
 dist[i] = Integer.MAX_VALUE;
 dist[S] = 0;
 for (int i = 0; i < V - 1; i++) {
 for (ArrayList<Integer> it : edges) {
 int u = it.get(0);
 int v = it.get(1);
 int wt = it.get(2);
 if (dist[u] != Integer.MAX_VALUE &&
dist[u] + wt < dist[v]) {
 dist[v] = dist[u] + wt;}}}
 for (ArrayList<Integer> it : edges) {
 int u = it.get(0);
 int v = it.get(1);
 int wt = it.get(2);
 if (dist[u] != Integer.MAX_VALUE &&
dist[u] + wt < dist[v]) {
 int temp[] = new int[1];
 temp[0] = -1;
 return temp;}}
 return dist;}}
