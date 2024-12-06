package LinkedList.CircularLinkedList;

public class CircularLinkedListImpl {
    private Node head;
    private Node tail;

    public CircularLinkedListImpl(){
        head=null;
        tail=null;
    }

    public void add(int data){
        Node newNode= new Node(data);
        if(head==null){
            head=newNode;
            tail=newNode;
            head.next=head;
        }else{
            tail.next=newNode;
            tail=newNode;
            tail.next=head;
        }
    }

    public void display(){
        Node current = head;
        if (current == null) {
            System.out.println("List is empty");
        } else {
            do{
                System.out.print(current.data + " -> ");
                current = current.next;

            }while (current != head);
                System.out.println("(back to head)");
        }
    }

}
