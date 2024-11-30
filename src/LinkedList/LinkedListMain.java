package LinkedList;

public class LinkedListMain {
    public static void main(String[] args) {
        LinkedListImplementation linkedList = new LinkedListImplementation();
        linkedList.delete(5);
        linkedList.add(3);
        linkedList.add(5);
        linkedList.add(15);
        linkedList.add(9);
        linkedList.traverse();
        linkedList.delete(5);
        linkedList.traverse();
        linkedList.delete(60);
        linkedList.traverse();
    }
}
