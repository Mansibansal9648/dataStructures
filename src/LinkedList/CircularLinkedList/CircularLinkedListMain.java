package LinkedList.CircularLinkedList;

public class CircularLinkedListMain {
    public static void main(String[] args) {
        CircularLinkedListImpl circularLinkedList=new CircularLinkedListImpl();
        circularLinkedList.display();
        circularLinkedList.delete(91);
        circularLinkedList.add(10);
        circularLinkedList.add(50);
        circularLinkedList.add(56);
        circularLinkedList.add(80);
        circularLinkedList.add(75);
        circularLinkedList.display();
        circularLinkedList.delete(56);
        circularLinkedList.display();
        circularLinkedList.delete(91);
        circularLinkedList.display();
        circularLinkedList.search(80);
        circularLinkedList.search(32);
    }
}
