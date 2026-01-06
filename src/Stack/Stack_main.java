package Stack;

public class Stack_main {
    public static void main(String[] args) {
       // LinkedList_Stack<String> lstack=new LinkedList_Stack<String>();
        //doubly_stack<String> dstack=new doubly_stack<String>();
Array_stack<String> astack=new Array_stack<String>(3);
        astack.push("ali");
        astack.push("saleh");
        astack.push("ahmed");
        astack.push("mohammed");
        System.out.println("top is ----> "+astack.top());
        astack.display();
//        while (!astack.isEmpty()){
//            System.out.println(astack.pop());
//        }
//       lstack.pop();
      // lstack.pop();
      // lstack.display();




    }
}
