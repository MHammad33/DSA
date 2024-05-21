package Coding_Exercises;

public class Linked_List {
    private Node head;
    private Node tail;
    private int length;

    // Exercise 2 -- Constructor
    public Linked_List(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length++;
    }

    // Exercise 3 -- Append
    public void append(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
        } else {
            tail.next = newNode;
        }
        tail = newNode;
        length++;
    }

    // Exercise 4 -- Remove Last
    public Node removeLast() {
        if (head == null) return null;

        Node temp = head;
        if (head.next == null) {
            head = null;
            tail = null;
            length--;
            return temp;
        }

        Node prev = head;
        while (temp.next != null) {
            prev = temp;
            temp = temp.next;
        }
        prev.next = null;
        tail = prev;
        length--;
        return temp;
    }

    // Exercise 5 -- Prepend
    public void prepend(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        length++;
    }

    // Exercise 6 -- Remove First
    public Node removeFirst() {
        if (head == null) return null;

        Node temp = head;
        // If there is only one node
        if (head.next == null) {
            head = null;
            tail = null;
            length--;
            return temp;
        }

        // If there are multiple nodes
        head = head.next;
        temp.next = null;
        length--;
        return temp;

    }

    // Exercise 7 -- Get
    public Node get(int index) {
        if (index < 0 || index >= length) return null;

        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

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
        System.out.println("null");
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
        System.out.print("\nLinked List: ");
        if (length == 0) {
            System.out.println("Empty");
        } else {
            printList();
        }
    }

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }
}
