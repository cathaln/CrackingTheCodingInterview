import java.util.HashMap;

public class RemoveDups{
    public static void main(String[] args) {

        // generate and print linkedlist with dups
        Node linkedList = new Node(1);
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                linkedList.append(j);
            }
        }
        linkedList.print();
        System.out.println("\n------------------------------------\n");

        Node newLinkedList = removeDuplicates(linkedList);
        newLinkedList.print();
    }

    static Node removeDuplicates(Node head){

        /*
        Create holder node as not to mess with head.
        Create hashmap for quick reference to already found values.
        Navigate through linkedlist.
        If duplicate found, set next to next.next, skipping over duplicate.
        Else add first founf instance of value to hashmap.
        Call system.gc() to clean up loose nodes. 
        */

        Node node = head;
        HashMap <Integer, Integer> holdValues = new HashMap<>();

        holdValues.put(node.data, 1);
        while(node.next != null){
            if (holdValues.containsKey(node.next.data)){
                node.next = node.next.next;
            }
            else{
                holdValues.put(node.next.data, 1);
                node = node.next;
            }
        }

        System.gc();
        return head;
    }
}

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
