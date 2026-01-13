package Queue;

public class queue_main {
    public static void main(String[] args) {
       linkedQueue<Integer> lqueue=new linkedQueue<Integer>();
        // ArrayQueue<Integer> lqueue=new ArrayQueue<Integer>();

        lqueue.engueue(1);
        lqueue.engueue(2);
        lqueue.engueue(3);
        lqueue.engueue(4);
        // lqueue.display();
        System.out.println("the first is :"+lqueue.front());
        while (!lqueue.isEmpty()){
            System.out.println("element removed"+lqueue.dequeue());
        }
    }
}
