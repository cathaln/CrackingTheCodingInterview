class Node {

    /*
    Simple class for a singly linked list.
    It contains functions for appending to the end of the list, and printing
    the list.
    */

    Node next = null;
    int data;
    public Node( int d) {
        data = d;
    }

    void append(int d) {
        Node end = new Node(d);
        Node n = this;
        while (n.next != null) {
            n = n.next;
        }
        n. next = end;
    }

    void print(){
        Node n = this;
        System.out.println(n.data);
        while(n.next != null){
            System.out.println(n.next.data);
            n = n.next;
        }
    }
}
