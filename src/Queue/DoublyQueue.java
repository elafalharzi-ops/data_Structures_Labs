package Queue;
import singlylinkedList.singlyLinkedList;

public class DoublyQueue<E> implements Queue<E>{
    singlyLinkedList<E> dlist =new singlyLinkedList<E>();
    @Override
    public boolean isEmpty() {
        return dlist.isEmpty();
    }

    @Override
    public int size() {
        return dlist.size();
    }

    @Override
    public void engueue(E data) {
         dlist.addlast( data);
    }

    @Override
    public E dequeue() {
        return dlist.removeFrist();
    }

    @Override
    public E front() {
        return dlist.getFrist();
    }
    public void display(){
         dlist.display();
    }
}
