package Coding_Exercises;

public class Linked_List {
    private Node head;
    private Node tail;
    private int length;
    

    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }

    public int getLength() {
        return length;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " => ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void printAll() {
        if (length == 0) {
            System.out.println("Head: null");
            System.out.println("Tail: null");
        } else {
            System.out.println("Head: " + head.value);
            System.out.println("Tail: " + tail.value);
        }
        System.out.println("Length: " + length);
        System.out.println("\nLinked List: ");
        if (length == 0) {
            System.out.println("Empty");
        } else {
            printList();
        }
    }

    class Node {
        private int value;
        private Node next;

        Node(int value) {
            this.value = value;
        }
    }
}
