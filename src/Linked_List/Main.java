package Linked_List;

public class Main {
    public static void main(String[] args) {
        LinkedList myLinkedList = new LinkedList(1);
        myLinkedList.append(2);
        myLinkedList.append(3);
        myLinkedList.append(4);

        // Reverse LinkedList
        myLinkedList.reverse();

        // Test LinkedList Working
        myLinkedList.getHead();
        myLinkedList.getTail();
        myLinkedList.getLength();
        myLinkedList.printList();

        /*
        // Append nodes
        myLinkedList.append(2);
        myLinkedList.append(3);

        // Remove the Last Node
        System.out.println(myLinkedList.removeLast().value + " with node Removed");

        // Prepend a Node
        myLinkedList.prepend(100);

        // Remove the First Node
        System.out.println(myLinkedList.removeFirst().value + " with node Removed");

        // Get Node at index 3
        System.out.println("The value at index 3 is: " + myLinkedList.get(3).value);

        // Set Node at index 3
        System.out.println(myLinkedList.set(3, 100));

        // Add Node at index 1
        myLinkedList.insert(1, 1);
        * */

    }
}
