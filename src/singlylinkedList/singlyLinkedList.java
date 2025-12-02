package singlylinkedList;

public class singlyLinkedList <E>{

    private Node<E> head;
    private Node<E>tail;
    private int size;

    public int size(){
        return size;
    }
    public boolean isEmpty(){
        return size()==0;
    }
    public void addFrist(E data){
        Node<E> nnod= new Node<>(head,data);
        head=nnod;
        if(isEmpty())
            head=tail;
        size++;
    }
    public E getFrist(){
        if (isEmpty())return null;
        return head.getData();
    }
    public E removeFrist(){
        E delet=head.getData();
        head=head.getNext();
        if(size()==0)
            head=tail;
        return delet;


    }









    class Node<E>{
        private E data;
        private Node<E> next;

        public Node(Node<E> next, E data) {
            this.next = next;
            this.data = data;
        }

        public E getData() {
            return data;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setData(E data) {
            this.data = data;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }
    }




}
