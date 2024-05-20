package Linked_List;

public class Main {
    public static void main(String[] args) {
        LinkedList myLinkedList = new LinkedList(1);
        myLinkedList.append(2);
        myLinkedList.append(3);
        myLinkedList.append(4);
        myLinkedList.append(5);

        System.out.println("The value at index 3 is: " + myLinkedList.get(3).value);

        // Test LinkedList Working
        myLinkedList.getHead();
        myLinkedList.getTail();
        myLinkedList.getLength();
        myLinkedList.printList();

        /*
        // Append nodes
        myLinkedList.append(2);
        myLinkedList.append(3);

        // Remove Last Node
        System.out.println(myLinkedList.removeLast().value + " with node Removed");

        // Prepend Node
        myLinkedList.prepend(100);

        // Remove First Node
        System.out.println(myLinkedList.removeFirst().value + " with node Removed");
        * */

    }
}
