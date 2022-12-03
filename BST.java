public class BST {

    class Node {
        int value;
        Node lChild;
        Node rChild;

        public Node(int x) {
            value = x;
            lChild = rChild = null;
        }
    }

    Node root;

    BST(){
        root = null;
    }

    BST(int x){
        root = new Node(x);
    }

    void inOrder() {
        inOrderRecursive(root);
    }

    Node inOrderRecursive(Node rootN){
        if (rootN == null) {
            return rootN;
        }
        else {
            inOrderRecursive(rootN.lChild);
            System.out.println(rootN.value);
            return inOrderRecursive(rootN.rChild);
        }
    }

    void insert(int x) {
        root = insertRecursive(root, x);
    }

    Node insertRecursive(Node rootNode, int x){
        if (rootNode == null) {
            rootNode = new Node(x);
            return rootNode;
        }
        // insert left child
        else if (x < rootNode.value) {
            rootNode.lChild = insertRecursive(rootNode.lChild, x);
        }
        // insert right child
        else if (x > rootNode.value) {
            rootNode.rChild = insertRecursive(rootNode.rChild, x);
        }
        return rootNode;
    }


    public static void main(String[] args) {
        System.out.println("Hello world!");
        BST tree = new BST();
        tree.insert(7);
        tree.insert(2);
        tree.insert(8);
        tree.insert(12);
        tree.insert(6);
        tree.insert(10);
        tree.insert(15);
        System.out.println("#############");
        tree.inOrder();
    }
}
