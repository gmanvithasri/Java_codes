import java.util.*;
class TreeNode {
 int val;TreeNode left;TreeNode right;
 TreeNode(int val) {
 this.val = val;}}
public class BoundaryTraversal {
 public List<Integer>
boundaryOfBinaryTree(TreeNode root) {
 List<Integer> result = new ArrayList<>();
 if (root == null) return result;
 result.add(root.val);
 leftBoundary(root.left, result);
 leaves(root.left, result);
 leaves(root.right, result);
 rightBoundary(root.right, result);
 return result; }
 private void leftBoundary(TreeNode node,
List<Integer> result) {
 if (node == null || (node.left == null &&
node.right == null)) return;
 result.add(node.val);
 if (node.left != null) {
 leftBoundary(node.left, result);
 } else {
 leftBoundary(node.right, result);}}
 private void rightBoundary(TreeNode node,
List<Integer> result) {
 if (node == null || (node.left == null &&
node.right == null)) return;
 if (node.right != null) {
 rightBoundary(node.right, result);
 }
   public static TreeNode constructBST(Scanner
scanner) {
 String[] elements = scanner.nextLine().split(" ");
 TreeNode root = null;
 for (String element : elements) {
 root = insert(root,
Integer.parseInt(element));}
 return root;}
 private static TreeNode insert(TreeNode root, int
val) {
 if (root == null) {
 return new TreeNode(val);}
 if (val < root.val) {
 root.left = insert(root.left, val);
 } else {
 root.right = insert(root.right, val);}
 return root;}
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 RecoverBST recoverBST = new RecoverBST();
 TreeNode root = constructBST(sc);
 printInOrder(root);
 recoverBST.recoverTree(root);
 System.out.println("\nBST after recovery:");
 printInOrder(root);}
 private static void printInOrder(TreeNode root) {
 if (root == null) return;
 printInOrder(root.left);
 System.out.print(root.val + " ");
 printInOrder(root.right);}}
