package doublyLinkedList;

public class Doubly_main {
    public static void main(String[] args) {
        DoublyLinkedList<Integer> dlist=new DoublyLinkedList<Integer>();
        dlist.addfirst(1);
        dlist.addfirst(2);
        dlist.addlast(3);
        dlist.addlast(4);
        dlist.addlast(5);
        dlist.removfrist();
        dlist.removelast();
        dlist.display();

    }

}
