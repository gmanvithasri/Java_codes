import java.util.*;
class TreeNode {
 int val;
 TreeNode left;
 TreeNode right;
 TreeNode(int val) {
 this.val = val;}}
public class VerticalOrderTraversal {
 public List<List<Integer>> verticalOrder(TreeNode
root) {
 List<List<Integer>> result = new ArrayList<>();
 if (root == null) return result;
 Map<Integer, List<Integer>> map = new
HashMap<>();
 Queue<TreeNode> queue = new LinkedList<>();
 Queue<Integer> cols = new LinkedList<>();
 queue.offer(root);
 cols.offer(0);
 int minCol = 0;
 int maxCol = 0;
 while (!queue.isEmpty()) {
 TreeNode node = queue.poll();
 int col = cols.poll();
 if (!map.containsKey(col)) {
 map.put(col, new ArrayList<>());}
 map.get(col).add(node.val);
 if (node.left != null) {
 queue.offer(node.left);
 cols.offer(col - 1);
 minCol = Math.min(minCol, col - 1);}
 if (node.right != null) {
 queue.offer(node.right);
 cols.offer(col + 1);
 maxCol = Math.max(maxCol, col + 1);}}
   for (int i = minCol; i <= maxCol; i++) {
 if (map.containsKey(i)) {
 result.add(map.get(i));}}
 return result;}
 public static TreeNode constructTree(Scanner sc) {
 int n = sc.nextInt();
 TreeNode[] nodes = new TreeNode[n];
 for (int i = 0; i < n; i++) {
 nodes[i] = new TreeNode(sc.nextInt());
 }
 for (int i = 0; i < n - 1; i++) {
 int parentIndex = sc.nextInt();
 int childIndex = sc.nextInt();
 char direction = sc.next().charAt(0);
 if (direction == 'L') {
 nodes[parentIndex].left =
nodes[childIndex];
 } else {
 nodes[parentIndex].right =
nodes[childIndex];}}
 return nodes[0];}
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 VerticalOrderTraversal vot = new
VerticalOrderTraversal();
 TreeNode root = constructTree(scanner);
 List<List<Integer>> result =
vot.verticalOrder(root);
 System.out.println("Vertical Order Traversal:");
 for (List<Integer> level : result) {
 System.out.println(level);}}}
