package Stack;

public class LinkedList_Stack<E> implements Stack<E>{
singlyLinkedList<E> sList=new singlyLinkedList<E>();
    @Override
    public boolean isEmpty() {

        return sList.isEmpty() ;
    }

    @Override
    public int size() {
        return sList.size();
    }

    @Override
    public void push(E data) {
        sList.addFrist(data);

    }

    @Override
    public E pop() {
        return sList.removeFrist();
    }

    @Override
    public E top() {
        return sList.getFrist();
    }

    @Override
    public void display() {
        sList.display();

    }
}
