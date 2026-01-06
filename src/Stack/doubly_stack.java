package Stack;


    public class doubly_stack<E> implements Stack<E>{
        singlyLinkedList<E> dList=new singlyLinkedList<E>();
        @Override
        public boolean isEmpty() {

            return dList.isEmpty() ;
        }

        @Override
        public int size() {
            return dList.size();
        }

        @Override
        public void push(E data) {
            dList.addFrist(data);

        }

        @Override
        public E pop() {
            return dList.removeFrist();
        }

        @Override
        public E top() {
            return dList.getFrist();
        }

        @Override
        public void display() {
            dList.display();

        }
    }


