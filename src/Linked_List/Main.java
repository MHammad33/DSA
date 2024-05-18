package Linked_List;

public class Main {
    public static void main(String[] args) {
        LinkedList myLinkedList = new LinkedList(1);

        // Append nodes
        myLinkedList.append(2);
        myLinkedList.append(3);

        // Remove Last Node
        System.out.println(myLinkedList.removeLast().value + " with node Removed");

        // Test LinkedList Working
        myLinkedList.getHead();
        myLinkedList.getTail();
        myLinkedList.getLength();
        myLinkedList.printList();
    }
}
