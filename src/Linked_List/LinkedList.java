package Linked_List;

public class LinkedList {
    private Node head;
    private Node tail;
    private int length;

    /*
     * @dev Creates a new Linked List with one element
     */
    public LinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    /*
     * @dev Creates a new node
     * Inner or Nested Class
     */
    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }
}
