package Stack;

public class Stack_main {
    public static void main(String[] args) {
        LinkedList_Stack<String> lstack=new LinkedList_Stack<String>();
        lstack.push("ali");
        lstack.push("saleh");
        lstack.push("ahmed");
        lstack.push("mohammed");
        System.out.println("top is ----> "+lstack.top());
        while (!lstack.isEmpty()){
            System.out.println(lstack.pop());
        }
//       lstack.pop();
      // lstack.pop();
      // lstack.display();




    }
}
