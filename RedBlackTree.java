class RedBlackTree {

    private static final boolean RED = true;
    private static final boolean BLACK = false;

    private class Node {
        int key;
        Node left, right, parent;
        boolean color;

        Node(int key) {
            this.key = key;
            this.color = RED;
        }
    }

    private Node root;

    public void insert(int key) {
        Node newNode = new Node(key);
        root = bstInsert(root, newNode);
        fixViolation(newNode);
    }

    private Node bstInsert(Node root, Node newNode) {
        if (root == null)
            return newNode;

        if (newNode.key < root.key) {
            root.left = bstInsert(root.left, newNode);
            root.left.parent = root;
        } else if (newNode.key > root.key) {
            root.right = bstInsert(root.right, newNode);
            root.right.parent = root;
        }
        return root;
    }

    private void rotateLeft(Node x) {
        Node y = x.right;
        x.right = y.left;
        if (y.left != null)
            y.left.parent = x;

        y.parent = x.parent;
        if (x.parent == null)
            root = y;
        else if (x == x.parent.left)
            x.parent.left = y;
        else
            x.parent.right = y;

        y.left = x;
        x.parent = y;
    }

    private void rotateRight(Node x) {
        Node y = x.left;
        x.left = y.right;
        if (y.right != null)
            y.right.parent = x;

        y.parent = x.parent;
        if (x.parent == null)
            root = y;
        else if (x == x.parent.left)
            x.parent.left = y;
        else
            x.parent.right = y;

        y.right = x;
        x.parent = y;
    }

    private void fixViolation(Node z) {
        while (z.parent != null && z.parent.color == RED) {
            if (z.parent == z.parent.parent.left) {
                Node y = z.parent.parent.right;
                if (y != null && y.color == RED) {
                    z.parent.color = BLACK;
                    y.color = BLACK;
                    z.parent.parent.color = RED;
                    z = z.parent.parent;
                } else {
                    if (z == z.parent.right) {
                        z = z.parent;
                        rotateLeft(z);
                    }
                    z.parent.color = BLACK;
                    z.parent.parent.color = RED;
                    rotateRight(z.parent.parent);
                }
            } else {
                Node y = z.parent.parent.left;
                if (y != null && y.color == RED) {
                    z.parent.color = BLACK;
                    y.color = BLACK;
                    z.parent.parent.color = RED;
                    z = z.parent.parent;
                } else {
                    if (z == z.parent.left) {
                        z = z.parent;
                        rotateRight(z);
                    }
                    z.parent.color = BLACK;
                    z.parent.parent.color = RED;
                    rotateLeft(z.parent.parent);
                }
            }
        }
        root.color = BLACK;
    }

    public void inOrderTraversal() {
        inOrderHelper(root);
        System.out.println();
    }

    private void inOrderHelper(Node node) {
        if (node != null) {
            inOrderHelper(node.left);
            System.out.print(node.key + " ");
            inOrderHelper(node.right);
        }
    }

    public static void main(String[] args) {
        RedBlackTree tree = new RedBlackTree();

        int[] keys = {20, 15, 25, 10, 5, 30, 35};
        for (int key : keys) {
            tree.insert(key);
        }

        System.out.println("In-order traversal of the Red-Black Tree:");
        tree.inOrderTraversal();
    }
}
