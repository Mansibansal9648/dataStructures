package LinkedList.HeaderLinkedList;

public class HeaderLinkedListImpl {
    private Node header;

    public HeaderLinkedListImpl() {
        header = new Node(-1);
    }

    public void add(int data) {
        Node newNode = new Node(data);
        Node current = header;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    public void traverse() {
        Node current = header.next;
        if (current == null) {
            System.out.println("List is empty");
        } else {
            while (current != null) {
                System.out.print(current.data + " -> ");
                current = current.next;

            }
            System.out.println("null");
        }
    }

}