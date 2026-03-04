public class LinkedBinaryTreeImpl<E extends Comparable<E>> {
    Node<E> root;

    public LinkedBinaryTreeImpl() {
        root = null;
    }

    public LinkedBinaryTreeImpl(E data) {
        root = new Node(data);
    }

    private class Node<E> {
        private E element;
        private Node<E> left;
        private Node<E> right;

        public Node() {
            //init empty tree
            this.left = null;
            this.right = null;
        }

        public Node(E data) {
            this.element = data;
            this.left = null;
            this.right = null;
        }

    }

    public Node search(E key) {
        return search(root, key);
    }

    private Node search(Node node, E key) {
        if (node == null) {
            return null;
        }

        //CASE 1: we found it!
        if (key.compareTo((E) node.element) == 0) {
            return node;
        }

        //CASE 2: larger than
        if (key.compareTo((E) node.element) > 0) {
            return search(node.right, key);
        } 

        //(key.compareTo((E) node.element) < 0) {
        //CASE 3: smaller than
        return search(node.left, key);
    }

    public void InOrderTraversal(Node n) {
        if (n == null) return;
        InOrderTraversal(n.left);
        System.out.println(n.element);
        InOrderTraversal(n.right);
    }


    public void PreOrderTraversal(Node n) {
        if (n == null) return;
        System.out.println(n.element);
        PreOrderTraversal(n.left);
        PreOrderTraversal(n.right);
    }


    public void PostOrderTraversal(Node n) {
        if (n == null) return;
        PostOrderTraversal(n.left);
        PostOrderTraversal(n.right);
        System.out.println(n.element);
    }

}
