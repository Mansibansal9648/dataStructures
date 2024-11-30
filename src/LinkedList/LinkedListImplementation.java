package LinkedList;

public class LinkedListImplementation {
    private Node head;

    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void traverse() {
        if (head == null) {
            System.out.println("List is Empty");
        } else {
            Node current = head;
            while (current != null) {
                System.out.print(current.data + " -> ");
                current = current.next;
            }
            System.out.println("null");
        }
    }

    public void delete(int data){
        if (head == null) {
            System.out.println("List is Empty");
        } else if(head.data==data){
            head=head.next;
        }else {
            Node prev=null;
            Node current=head;
            while(current!=null && current.data!=data){
                prev=current;
                current=current.next;
            }
            if(current==null){
                System.out.println("No element found in list");
            }else{
                prev.next=current.next;
            }
            }

        }

}
