package Coding_Exercises;

public class Main {
    public static void main(String[] args) {
        // Exercise 10 -- Remove
        Linked_List myLinkedList = new Linked_List(1);
        myLinkedList.append(2);
        myLinkedList.append(3);
        myLinkedList.append(4);
        myLinkedList.append(5);

        System.out.println("LL before remove():");
        myLinkedList.printList();

        System.out.println("\nRemoved node:");
        System.out.println(myLinkedList.remove(2).value);
        System.out.println("LL after remove() in middle:");
        myLinkedList.printList();

        System.out.println("\nRemoved node:");
        System.out.println(myLinkedList.remove(0).value);
        System.out.println("LL after remove() of first node:");
        myLinkedList.printList();

        System.out.println("\nRemoved node:");
        System.out.println(myLinkedList.remove(2).value);
        System.out.println("LL after remove() of last node:");
        myLinkedList.printList();

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

        // Exercise 5 -- Prepend
//        Linked_List myLinkedList = new Linked_List(2);
//        myLinkedList.append(3);
//
//        System.out.println("Before prepend():");
//        System.out.println("-----------------");
//        myLinkedList.printAll();
//
//        myLinkedList.prepend(1);
//
//        System.out.println("\n\nAfter prepend():");
//        System.out.println("----------------");
//        myLinkedList.printAll();

        // Exercise 6 -- Remove First
//        Linked_List myLinkedList = new Linked_List(2);
//        myLinkedList.append(1);
//
//        // (2) Items - Returns 2 Node
//        System.out.println(myLinkedList.removeFirst().value);
//        // (1) Item - Returns 1 Node
//        System.out.println(myLinkedList.removeFirst().value);
//        // (0) Items - Returns null
//        System.out.println(myLinkedList.removeFirst());

        // Exercise 7 -- Get
//        Linked_List myLinkedList = new Linked_List(0);
//        myLinkedList.append(1);
//        myLinkedList.append(2);
//        myLinkedList.append(3);
//
//
//        System.out.println(myLinkedList.get(3).value); // 3

        // Exercise 8 -- Set
//        Linked_List myLinkedList = new Linked_List(0);
//        myLinkedList.append(1);
//        myLinkedList.append(2);
//        myLinkedList.append(3);
//
//        System.out.println("Linked List before set():");
//        myLinkedList.printList();
//
//        myLinkedList.set(2, 99);
//
//        System.out.println("\nLinked List after set():");
//        myLinkedList.printList();

        // Exercise 9 -- Insert
//        Linked_List myLinkedList = new Linked_List(1);
//        myLinkedList.append(3);
//
//        System.out.println("LL before insert():");
//        myLinkedList.printList();
//
//        myLinkedList.insert(1, 2);
//
//        System.out.println("\nLL after insert(2) in middle:");
//        myLinkedList.printList();
//
//        myLinkedList.insert(0, 0);
//
//        System.out.println("\nLL after insert(0) at beginning:");
//        myLinkedList.printList();
//
//        myLinkedList.insert(4, 4);
//
//        System.out.println("\nLL after insert(4) at end:");
//        myLinkedList.printList();

    }
}
