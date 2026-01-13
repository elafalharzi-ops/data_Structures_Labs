package Queue;

public class ArrayQueue <E> implements Queue<E>{
    private E arr[];
    private static final int CPACATY=1000;
    private int f=0;
    private int size=0;

    public ArrayQueue() {
        this(CPACATY);
    }

    public ArrayQueue(int c) {
        arr=(E[])new Object[c];
    }

    @Override
    public boolean isEmpty() {
        return size()==0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void engueue(E data) {
        if(size()==arr.length){
            throw new IllegalStateException(("can not add more ,the Queue is full"));
        }else {
            int av=(f+size)% arr.length;
            arr[av]=data;
            size++;
        }


    }

    @Override
    public E dequeue() {
if (isEmpty()) return null;
E delet=arr[f] ;
    arr[f]=null;
    f=f+1;
    size--;
    return delet;}

    @Override
    public E front() {
        return arr[f];
    }
}

