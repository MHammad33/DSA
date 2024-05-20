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
     * @dev Removes Node at end
     * */
    public Node removeLast() {
        if (head == null) return null;

        Node temp = head;
        Node pre = head;

        if (head.next == null) {
            head = null;
            tail = null;
            length--;
            return temp;
        }

        while (temp.next != null) {
            pre = temp;
            temp = temp.next;
        }
        tail = pre;
        tail.next = null;
        length--;

        return temp;
    }

    /*
     * @dev Adds Node at Start
     * */
    public void prepend(int value) {
        Node newNode = new Node(value);

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }

    }

    /*
     * @dev Removes the first Node
     * */
    public Node removeFirst() {
        if (head == null) {
            System.out.println("Linked List is already empty. Cannot be deleted.");
            return null;
        }

        Node temp = head;

        if (head.next == null) {
            head = null;
            tail = null;
            length--;
            return temp;
        }

        head = head.next;
        temp.next = null;
        length--;
        return temp;
    }

    /*
     * @dev Print the values of Linked List
     */
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " => ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    /*
     * @dev Get the values of head and tail nodes and length of linked list
     */
    public void getHead() {
        if (head == null) {
            System.out.println("Head: null");
        } else {
            System.out.println("Head: " + head.value);
        }
    }

    public void getTail() {
        if (tail == null) {
            System.out.println("Tail: null");
        } else {
            System.out.println("Tail: " + tail.value);
        }
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
