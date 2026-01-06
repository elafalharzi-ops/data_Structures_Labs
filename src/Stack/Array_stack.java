package Stack;

public class Array_stack<E> implements Stack<E> {
    private E arr[];
    private static final int CAPICITY=1000;
    private int t=-1;

    public Array_stack(int c) {
        arr=(E[])new Object[c];
    }

    public Array_stack() {
        this(CAPICITY);
    }

    @Override
    public boolean isEmpty() {
        return t==-1;
    }

    @Override
    public int size() {
        return t+1;
    }

    @Override
    public void push(E data) {
        if(size()==arr.length){
            System.out.println("stack is full");
        }else {
            arr[++t]=data;
        }

    }

    @Override
    public E pop() {
        if (isEmpty())return null;
        E delet=arr[t];
        delet=null;
        t--;

        return delet;
    }

    @Override
    public E top() {
        if (isEmpty())return null;
        return arr[t];
    }

    @Override
    public void display() {
        if(isEmpty()){
            System.out.println("stack is empty");
        return;}
        for (int i=t;i>=0;i--)
            System.out.println(arr[i]);

    }
}
