package Array;
import java.util.Scanner;
public class array {
    public void Traversal(int []a){
        for( int i=0;i<a.length;i++)
            System.out.println("index["+i+"]="+a[i]);

    }
    public void Traversal2(int []a){
        for( int e:a)
            System.out.println(e);
    }
    public void R_Traversal(int []a){
        for(int i=a.length-1;i>=0;i--)
            System.out.println("index["+i+"]="+a[i]);
    }
    public void input(int[]a){
        System.out.println("enter"+a.length+"numbers:");
        Scanner scanner=new Scanner(System.in);
        for(int i=0;i<a.length;i++)
            a[i]=scanner.nextInt();
    }
    public void update(int []a,int index,int nvalue){
        if(index<0 || index>=a.length)
            System.out.println("index does not exists");
        else
         a[index]=nvalue;
    }
    public void delete(int []a, int index){
        if(index<0 || index>=a.length)
            System.out.println("index does not exists");
        else
         a[index]=0;
    }
    public void shiftleft_delet(int []a,int index) {
        for (int i = index; i < a.length - 1; i++)
            a[i] = a[i + 1];
        a[a.length-1]=Integer.MIN_VALUE;}
    //HomeWork

    public void shiftr_insert(int []a,int value){

        for (int i =a.length-1; i > 0 ; i--){

            a[i] = a[i -1];
        }a[0]=value;
    }

    public  int linearSearch(int []a, int svalue)  {
        for(int i=0;i<a.length;i++){
            if(svalue==a[i])
                return i;
        }
        return -1;
    }





//        shifright_delet_assinment



}
