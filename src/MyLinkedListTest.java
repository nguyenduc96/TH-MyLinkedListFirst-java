public class MyLinkedListTest {
    public static void main(String[] args) {
        System.out.println("testing");
        MyLinkedList linkedList = new MyLinkedList(10);

        linkedList.addFirst(10);
        linkedList.addFirst(11);
        linkedList.addFirst(12);

        linkedList.add(4,9);
        linkedList.add(4,9);
        linkedList.printList();
    }
}
