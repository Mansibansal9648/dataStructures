package LinkedList.CircularLinkedList;

public class CircularLinkedListMain {
    public static void main(String[] args) {
        CircularLinkedListImpl circularLinkedList=new CircularLinkedListImpl();
        circularLinkedList.display();
        circularLinkedList.add(10);
        circularLinkedList.add(50);
        circularLinkedList.add(80);
        circularLinkedList.add(75);
        circularLinkedList.display();
    }
}
