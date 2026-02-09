public class LinkedList<T> {

  public Node head;
  private int size;

  public LinkedList() {
        head = new Node(); 
        size = 0;
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

  public static boolean areEqual(Node list1, Node list2) {
      Node cur1 = list1.next;
      Node cur2 = list2.next;

      while (cur1 != null && cur2 != null) {
            if (!cur1.data.equals(cur2.data)) {
                return false;
            }

            cur1 = cur1.next;
            cur2 = cur2.next;
      }

      //are there additional nodes to process in either list
      if (cur1 != null || cur2 != null) return false;

      return true;
  }

  public static void main(String[] args) {
    LinkedList l1 = new LinkedList();
    l1.insertHead("A");
    l1.insertHead("B");
    l1.insertHead("C");

    LinkedList l2 = new LinkedList();
    l2.insertHead("C");

    System.out.println(areEqual(l1.head, l2.head));
  }

}
