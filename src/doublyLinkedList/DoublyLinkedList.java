package doublyLinkedList;

public class DoublyLinkedList<E> {
    private Node<E> header;
    private Node<E> tailer;
    private int size;
    public DoublyLinkedList(){
        header=new Node(null,null,null);
        tailer=new Node(header,null,null);
        header.setNext(tailer);
        size=0;
    }
    public int size(){
        return size;
    }
    public boolean isEmpty(){
        return size()==0;
    }
    public E getfirst(){
        return header.getNext().getData();

    }
    public E getlast(){
return tailer.getPrev().getData();
    }












    class Node<E>{
        private Node<E> prev;
        private E data;
        private Node<E>next;

        public Node(Node<E> prev, E data, Node<E> next) {
            this.prev = prev;
            this.data = data;
            this.next = next;
        }

        public Node<E> getPrev() {
            return prev;
        }

        public void setPrev(Node<E> prev) {
            this.prev = prev;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setData(E data) {
            this.data = data;
        }

        public E getData() {
            return data;
        }
    }
}
