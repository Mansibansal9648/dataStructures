package LinkedList.HeaderLinkedList;

public class HeaderLinkedListMain {
    public static void main(String[] args) {
        HeaderLinkedListImpl headerLinkedList= new HeaderLinkedListImpl();
        headerLinkedList.traverse();
        headerLinkedList.add(10);
        headerLinkedList.add(30);
        headerLinkedList.add(75);
        headerLinkedList.add(5);
        headerLinkedList.traverse();
    }
}
