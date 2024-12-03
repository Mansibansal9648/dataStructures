package LinkedList.HeaderLinkedList;

public class HeaderLinkedListMain {
    public static void main(String[] args) {
        HeaderLinkedListImpl headerLinkedList= new HeaderLinkedListImpl();
        headerLinkedList.traverse();
        headerLinkedList.add(10);
        headerLinkedList.add(30);
        headerLinkedList.add(45);
        headerLinkedList.add(75);
        headerLinkedList.add(5);
        headerLinkedList.traverse();
        headerLinkedList.delete(30);
        headerLinkedList.traverse();
        headerLinkedList.delete(78);
        headerLinkedList.traverse();
        headerLinkedList.search(98);
        headerLinkedList.search(75);
        System.out.println("Reverse header linked list");
        headerLinkedList.reverse();
        headerLinkedList.traverse();
    }
}
