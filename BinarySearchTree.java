// Java program for a basic Binary Search Tree implementation
public class BinarySearchTree {

    // Node class representing each node in the tree
    static class Node {
        int key;
        Node left, right;

        public Node(int item) {
            key = item;
            left = right = null;
        }
    }

    // Root of the BST
    Node root;

    // Constructor to initialize the BST
    public BinarySearchTree() {
        root = null;
    }

    // Insert a new key in the BST
    void insert(int key) {
        root = insertRec(root, key);
    }

    // A recursive function to insert a new key in BST
    Node insertRec(Node root, int key) {
        // If the tree is empty, return a new node
        if (root == null) {
            root = new Node(key);
            return root;
        }
        // Recur down the tree
        if (key < root.key) {
            root.left = insertRec(root.left, key);
        } else if (key > root.key) {
            root.right = insertRec(root.right, key);
        }
        // return the unchanged node pointer
        return root;
    }

    // Method for in-order traversal of BST
    void inorder() {
        inorderRec(root);
    }

    // A recursive function to do in-order traversal of BST
    void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.key + " ");
            inorderRec(root.right);
        }
    }

    // Method to search a key in BST
    boolean search(int key) {
        return searchRec(root, key);
    }

    // A recursive function to search a key in BST
    boolean searchRec(Node root, int key) {
        // Base cases: root is null or key is present at root
        if (root == null) {
            return false;
        }
        if (root.key == key) {
            return true;
        }
        // Key is greater than root's key
        if (root.key > key) {
            return searchRec(root.left, key);
        }
        // Key is less than root's key
        return searchRec(root.right, key);
    }

    // Main method to test the Binary Search Tree
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();

        // Insert nodes in the BST
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);

        // Print in-order traversal
        System.out.println("In-order traversal of the BST:");
        tree.inorder();

        // Search for a key in the BST
        int keyToSearch = 60;
        if (tree.search(keyToSearch)) {
            System.out.println("\nKey " + keyToSearch + " found in the BST.");
        } else {
            System.out.println("\nKey " + keyToSearch + " not found in the BST.");
        }
    }
}
