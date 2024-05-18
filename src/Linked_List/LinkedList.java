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
     * @dev Adds Node at end
     * */
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

    /*
     * @dev Print the values of Linked List
     */
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    /*
     * @dev Get the values of head and tail nodes and length of linked list
     */
    public void getHead() {
        System.out.println("Head: " + head.value);
    }

    public void getTail() {
        System.out.println("Tail: " + tail.value);
    }

    public void getLength() {
        System.out.println("Length: " + length);
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
