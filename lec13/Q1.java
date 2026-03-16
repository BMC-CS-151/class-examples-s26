public Node rearrangeEvenOdd(LinkedList ll) {
    Node itr = ll.head.next; //first element (0 - even)

    Node oddHead = itr.next; //second element (1 - odd)
    Node o = oddHead;

    while (itr != null) {
        itr.next = itr.next.next; 
        o.next = o.next.next; 

        itr = itr.next;
        o   = o.next;
    }

    itr.next = oddHead;

    return ll.head;
}

