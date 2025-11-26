package Array;

import java.util.Arrays;

public class main {
    public static void main(String[] args) {
       array  arr=new array();
    int numbers[]={1,2,3,4,5};
//        arr.Traversal(numbers);
//        arr.Traversal2(numbers);
//        arr.R_Traversal(numbers);
//        arr.input(numbers);
        arr.update(numbers,3,3);
        System.out.println(Arrays.toString(numbers));
        arr.delete(numbers,0);
        System.out.println(Arrays.toString(numbers));
        


}}
