package binayTree;

public class main_binaryTree {
    public static void main(String[] args) {
        binaryTree bTREE=new binaryTree(10);
        bTREE.insertNode(5);
        bTREE.insertNode(12);
        bTREE.insertNode(11);
        bTREE.insertNode(13);
        bTREE.insertNode(15);
        bTREE.insertNode(7);
        bTREE.insertNode(2);
        System.out.println("result search 12 :"+bTREE.searchNode(12));
        System.out.println("preorder traversal");
            bTREE.PreOrder();
        System.out.println("Inorder traversal");

           bTREE.InOrder();
        System.out.println("postorder traversal");

            bTREE.PostOrder();





    }
}
