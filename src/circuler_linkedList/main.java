package circuler_linkedList;

public class main {
    public static void main(String[] args) {
        circuler_linkedList<String> list=new circuler_linkedList<String>();
        list.addfirst("elaf");
        list.addfirst("eman");
        list.addlast("hatem");
        list.addlast("qaid");
        list.removeFirst();
        list.removelast();
        list.display();



    }

}
