class index {
    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    Node root;

    index() {
        root = null;
    }

    public void insertData(int data) {
        Node newNode = new Node(data);
        if (root == null) {
            root = newNode;
            return;
        }

        Node currentNode = root;
        Node parent = null;
        while (currentNode != null) {
            parent = currentNode;
            if (data <= currentNode.data) {
                currentNode = currentNode.left;
            } else {
                currentNode = currentNode.right;
            }
        }
        if (data < parent.data) {
            parent.left = newNode;
        } else {
            parent.right = newNode;
        }
    }

    public void inorder(Node node) {
        if (node != null) {
            inorder(node.left);
            System.out.println(node.data);
            inorder(node.right);
        }
    }

    public void preOrder(Node node) {
        if (node != null) {
            System.out.println(node.data);
            preOrder(node.left);
            preOrder(node.right);
        }
    }

    public void postOrder(Node node) {
        if (node != null) {
            postOrder(node.left);
            postOrder(node.right);
            System.out.println(node.data);
        }
    }

    public Node deleteNode(Node root, int key) {
        if (root == null) {
            return null; // Node not found
        }

        if (key < root.data) {
            root.left = deleteNode(root.left, key);
        } else if (key > root.data) {
            root.right = deleteNode(root.right, key);
        } else {
            // Node found
            if (root.left == null) {
                return root.right; // Case 1 or 2
            } else if (root.right == null) {
                return root.left; // Case 1 or 2
            }

            // Case 3: Node with two children
            Node successor = minValueNode(root.right); // find inorder successor
            root.data = successor.data; // copy successor data
            root.right = deleteNode(root.right, successor.data); // delete successor
        }

        return root;
    }

    // Helper function to find minimum node in a subtree
    private Node minValueNode(Node node) {
        Node current = node;
        while (current.left != null) {
            current = current.left;
        }
        return current;
    }

    public static void main(String args[]) {
        System.out.println("hello from java");
        index tree = new index();
        tree.insertData(3);
        tree.insertData(4);
        tree.insertData(5);
        tree.insertData(6);
        // tree.inorder(tree.root);
        System.out.println("");
        // tree.postOrder(tree.root);
        System.out.println("");
        tree.deleteNode(tree.root, 5);
        tree.preOrder(tree.root);
    }
}
