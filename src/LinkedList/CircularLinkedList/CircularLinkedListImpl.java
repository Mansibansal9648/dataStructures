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

    public void delete(int data){
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }
           Node current=head;
        Node prev=null;
        do{
            if(current.data==data) {
                if (prev == null) {
                    if (head == tail) {
                        head = null;
                        tail = null;
                    } else {
                        head = head.next;
                        tail.next = head;
                    }
                } else {
                    prev.next = current.next;
                    if(current==tail){
                        tail=prev;
                    }
                }
                return;
            }
            prev=current;
            current=current.next;
        }while(current!=head);
        System.out.println("No element found in list");
    }

    public void search(int data) {
        Node current = head;
        do {
            current = current.next;
        }while (current != head && current.data != data);
        if (current!=head) {
            System.out.println(data + " element found in list");
        } else {
            System.out.println(data + " element not found in list");
        }
    }

}
