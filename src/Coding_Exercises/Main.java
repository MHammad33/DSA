package Coding_Exercises;

public class Main {
    public static void main(String[] args) {
        // Exercise 5 -- Prepend
        Linked_List myLinkedList = new Linked_List(2);
        myLinkedList.append(3);

        System.out.println("Before prepend():");
        System.out.println("-----------------");
        myLinkedList.printAll();

        myLinkedList.prepend(1);

        System.out.println("\n\nAfter prepend():");
        System.out.println("----------------");
        myLinkedList.printAll();

        // Test Linked List
        myLinkedList.printAll();

        // Exercise 2 -- Constructors
//        Linked_List myLinkedList = new Linked_List(1);

        // Exercise 3 -- Append
//        myLinkedList.append(2);
//        myLinkedList.append(3);

        // Exercise 4 -- Remove Last
//        Linked_List myLinkedList = new Linked_List(1);
//        myLinkedList.append(2);
//
//        // (2) Items - Returns 2 Node
//        System.out.println(myLinkedList.removeLast().value);
//        // (1) Item - Returns 1 Node
//        System.out.println(myLinkedList.removeLast().value);
//        // (0) Items - Returns null
//        System.out.println(myLinkedList.removeLast());

    }
}
