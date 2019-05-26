/*
Delete Middle Node: Implement an algorithm to delete a node in the middle (i.e., any node but
the first and last node, not necessarily the exact middle) of a singly linked list, given only access to
that node.
EXAMPLE
Input: the node c from the linked list a - >b- >c - >d - >e- >f
Result: nothing is returned, but the new linked list looks like a - >b- >d - >e- >f
*/

public class deleteMiddle{
    public static void main(String[] args) {
        // generate and print linkedlist with dups
        Node linkedList = new Node(0);
        for(int j = 1; j <= 5; j++){
            linkedList.append(j);
        }
        linkedList.print();
        System.out.println("\n------------------------------------\n");

        Node removee = getThreeMiddle(linkedList);
        removeMiddle(removee);

        linkedList.print();

    }

    static boolean removeMiddle(Node removee){

        /*
        Check that node passed isn't null and that node isn't last node.
        Create a temporary node to act as placeholder for next.
        Swap the next of the placeholder with the next of the current node.
        Call agrbage collector to clean up stray node.
        */

        // ensure node has a value and isn't last node.
        if (removee == null || removee.next == null) {
            return false;
        }

        Node next = removee.next;
        removee.data = next.data;
        removee.next = next.next;

        System.gc()
        return true;

    }

    static Node getThreeMiddle(Node head){

        /*
        Simple function to get the middle node needed for this question.
        */

        Node runner = head;
        while (runner.next != null){
            if (runner.data == 3){
                return runner;
            }
            runner = runner.next;
        }
        return null;
    }
}
