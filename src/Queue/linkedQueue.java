package Queue;
import singlylinkedList.singlyLinkedList;

public class linkedQueue <E> implements Queue<E>{
    singlyLinkedList<E> slist=new singlyLinkedList<E>();
    @Override
    public boolean isEmpty() {
        return slist.isEmpty();
    }

    @Override
    public int size() {
        return slist.size();
    }

    @Override
    public void engueue(E data) {
         slist.addlast( data);
    }

    @Override
    public E dequeue() {
        return slist.removeFrist();
    }

    @Override
    public E front() {
        return slist.getFrist();
    }
    public void display(){
         slist.display();
    }
}
