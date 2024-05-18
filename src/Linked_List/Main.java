package Linked_List;

public class Main {
    public static void main(String[] args) {
        LinkedList myLinkedList = new LinkedList(1);

        // Append nodes
        myLinkedList.append(2);
        myLinkedList.append(3);

        // Test LinkedList Working
        myLinkedList.getHead();
        myLinkedList.getTail();
        myLinkedList.getLength();
        myLinkedList.printList();
    }
}
