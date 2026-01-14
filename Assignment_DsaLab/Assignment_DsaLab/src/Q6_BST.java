public class Q6_BST {
    private static class Node {
        int data;
        Node left, right;
        Node(int data) { this.data = data; }
    }

    private Node root;

    // Insert: average O(log n), worst O(n)
    public void insert(int value) {
        root = insertRec(root, value);
    }

    private Node insertRec(Node node, int value) {
        if (node == null) return new Node(value);
        if (value < node.data) node.left = insertRec(node.left, value);
        else if (value > node.data) node.right = insertRec(node.right, value);
        // ignore duplicates (simple choice)
        return node;
    }

    // Traversals: O(n)
    public void inorder() {
        inorderRec(root);
        System.out.println();
    }

    private void inorderRec(Node node) {
        if (node == null) return;
        inorderRec(node.left);
        System.out.print(node.data + " ");
        inorderRec(node.right);
    }

    public void preorder() {
        preorderRec(root);
        System.out.println();
    }

    private void preorderRec(Node node) {
        if (node == null) return;
        System.out.print(node.data + " ");
        preorderRec(node.left);
        preorderRec(node.right);
    }

    public void postorder() {
        postorderRec(root);
        System.out.println();
    }

    private void postorderRec(Node node) {
        if (node == null) return;
        postorderRec(node.left);
        postorderRec(node.right);
        System.out.print(node.data + " ");
    }

    // Search: average O(log n), worst O(n)
    public boolean search(int value) {
        Node cur = root;
        while (cur != null) {
            if (cur.data == value) return true;
            if (value < cur.data) cur = cur.left;
            else cur = cur.right;
        }
        return false;
    }

    // Delete: average O(log n), worst O(n)
    public boolean delete(int value) {
        int before = countNodes();
        root = deleteRec(root, value);
        int after = countNodes();
        return after != before;
    }

    private Node deleteRec(Node node, int value) {
        if (node == null) return null;

        if (value < node.data) {
            node.left = deleteRec(node.left, value);
        } else if (value > node.data) {
            node.right = deleteRec(node.right, value);
        } else {
            // node found
            if (node.left == null && node.right == null) return null;        // 0 child
            if (node.left == null) return node.right;                        // 1 child
            if (node.right == null) return node.left;                        // 1 child

            // 2 children: replace with inorder successor (min in right subtree)
            Node succ = minNode(node.right);
            node.data = succ.data;
            node.right = deleteRec(node.right, succ.data);
        }
        return node;
    }

    // Min/Max: average O(log n), worst O(n)
    public Integer findMin() {
        if (root == null) return null;
        return minNode(root).data;
    }

    private Node minNode(Node node) {
        Node cur = node;
        while (cur.left != null) cur = cur.left;
        return cur;
    }

    public Integer findMax() {
        if (root == null) return null;
        Node cur = root;
        while (cur.right != null) cur = cur.right;
        return cur.data;
    }

    // Count total nodes: O(n)
    public int countNodes() {
        return countNodesRec(root);
    }

    private int countNodesRec(Node node) {
        if (node == null) return 0;
        return 1 + countNodesRec(node.left) + countNodesRec(node.right);
    }

    // Count leaf nodes: O(n)
    public int countLeafNodes() {
        return countLeafRec(root);
    }

    private int countLeafRec(Node node) {
        if (node == null) return 0;
        if (node.left == null && node.right == null) return 1;
        return countLeafRec(node.left) + countLeafRec(node.right);
    }

    // Height: O(n)
    // Height definition used here: number of edges on longest path from root to leaf
    // Empty tree -> -1, single node -> 0
    public int height() {
        return heightRec(root);
    }

    private int heightRec(Node node) {
        if (node == null) return -1;
        int lh = heightRec(node.left);
        int rh = heightRec(node.right);
        return 1 + (lh > rh ? lh : rh);
    }
}
