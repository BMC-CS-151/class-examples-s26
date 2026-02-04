public class LinkedList<T> {

  private Node head;
  private int size;

  public LinkedList() {
        head = new Node(); 
        size = 0;
  }

  private class Node<T> {
    public T data;
    public Node next;

    public Node() {
      this.data = null;
      this.next = null;
    }

    public Node(T data) {
      this.data = data;
    }
  }

  public Node find(T data) {
    return null;
    //start at the head and loop until 
    // (a) you hit the tail (node.next == null) OR
    // (b) you find the element (current node.data.equals(data))
  }

  public void insertHead(T data) {
    // 1. Create new node
    Node newNode = new Node(data);
    // 2. have new node next point to first element
    newNode.next = head.next;
    // 3. update the head to point to the new node
    head.next = newNode;
  }

  public void insertTail(T data) {
    // 1. create a new node
    Node newNode = new Node(data);
    // 2. find the last node
    Node cur = head; //.next;
    while (cur.next != null) {
        cur = cur.next;
    }
    // 3. make the last node point to newest
    cur.next = newNode;
  }


  public void print() {
    Node currNode = head.next;

    while (currNode != null) {
      System.out.print(currNode.data + " -> ");
      currNode = currNode.next;
    }
    System.out.println();
  }

  public static void main(String[] args) {
    LinkedList<Integer> list = new LinkedList<>();
    list.print();

    list.insertTail(0);
    list.print();


    list.insertTail(1);
    list.print();
    list.insertHead(2);
    list.print();
  }

}
