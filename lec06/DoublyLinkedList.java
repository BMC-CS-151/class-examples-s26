public class DoublyLinkedList<T> {

    private Node head;
    private Node tail; //NOTICE TAIL
    private int size;

    public DoublyLinkedList() {
        head = new Node();
        tail = new Node();
        head.next = tail;
        tail.prev = head;
    }

    private class Node<T> {

        public T data;
        public Node next;
        public Node prev;

        public Node() {
            this.next = null;
            this.prev = null;
        }

        public Node(T data) {
            this.data = data;
        }
    }

    //TODO 2: copy over and fix insertHead 
    public void insertHead(T data) {
        // 1. Create new node
        Node newNode = new Node(data);
        // 2. have new node next point to first element
        newNode.next = head.next;
        newNode.prev = head;
        // 3. update the head to point to the new node
        head.next.prev = newNode;
        head.next = newNode;
    }


    //TODO 3: copy over and fix insertTail 
    public void insertTail(T data) {
        // 1. create a new node
        Node newNode = new Node(data);

        // 2. update new nodes links
        newNode.next = tail;
        newNode.prev = tail.prev;

        // 3. make the last node point to newest
        tail.prev.next = newNode;
        tail.prev = newNode;
    }

    public String toString() {
        String s = "";
        Node currNode = head.next;

        while (currNode != tail) {
            if (currNode.next == tail) {
                s += currNode.data;
            } else {
                s += currNode.data + " -> ";
            }

            currNode = currNode.next;
        }

        return s; 
    }


    public void moveToFront(String data) {
        //find the node to move
        
        Node cur = head.next;
        while (!cur.data.equals(data)) {
            cur = cur.next;
        }

        cur.prev.next = cur.next;
        cur.next.prev = cur.prev;
        cur.prev = head;
        cur.next = head.next;
        head.next.prev = cur;
        head.next = cur;
    }

    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.insertHead("B");
        dll.insertHead("A");
        dll.insertHead("D");
        dll.insertTail("C");
        System.out.println(dll);

    }
}
