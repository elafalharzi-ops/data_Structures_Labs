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
    private void addBetween(Node<E> left,E data,Node<E> right){
        Node<E> newnod=new Node(left,data,right);
        left.setNext(newnod);
        right.setPrev(newnod);
        size++;
    }
    public void addfirst(E data){
        addBetween(header,data,header.getNext());
    }
    public void addlast(E data){
        addBetween(tailer.getPrev(),data,tailer);
    }
    public E remove(Node<E> deletedNod){
        if (isEmpty())return null;
        E delet=deletedNod.getData();
        Node<E> left=deletedNod.getPrev();
        Node<E> right=deletedNod.getNext();
        left.setNext(right);
        right.setPrev(left);
        size--;
        return delet;
    }
    public E removfrist(){
        return remove(header.getNext());
    }
    public E removelast(){
        return remove(tailer.getPrev());
    }
    public void display(){
        Node<E> temp=header.getNext();
        System.out.print("null<-----header<---->");
        while (temp!= tailer){
            System.out.print(temp.getData()+"<--->");
            temp=temp.getNext();
        }
        System.out.println("tailer--->null");
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
