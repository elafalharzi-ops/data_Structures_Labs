package binayTree;

public class binaryTree {
    private Node root;

    public binaryTree(int rootValue) {
        root = new Node(rootValue, null, null);
    }

    private void insert(Node newnode, Node rnode) {
        if (newnode.getValue() > rnode.getValue()) {
            if (rnode.getRight() == null)
                rnode.setRight(newnode);
            else
                insert(newnode, rnode.getRight());
        } else if (newnode.getValue() < rnode.getValue()) {
            if (rnode.getLeft() == null)
                rnode.setLeft(newnode);
            else
                insert(newnode, rnode.getLeft());
        } else System.out.println("can not add duplicated values");

    }

    public void insertNode(int value) {
        Node newnode = new Node(value, null, null);
        insert(newnode, root);

    }

    private boolean search(int value, Node rnode) {
        if (rnode == null) return false;
        if (value > rnode.getValue())
            return search(value, rnode.getRight());

        else if (value < rnode.getValue())
            return search(value, rnode.getLeft());
        else return true;

    }

    public boolean searchNode(int value) {
        return search(value, root);
    }

    private void preorder(Node rnode) {
        if (rnode == null) return;
        System.out.println(rnode.getValue() + " ");
        preorder(rnode.getLeft());
        preorder(rnode.getRight());


    }

    public void PreOrder() {
        preorder(root);
        System.out.println();
    }

    private void inorder(Node rnode) {
        if (rnode == null) return;

        inorder(rnode.getLeft());
        System.out.println(rnode.getValue() + " ");
        inorder(rnode.getRight());

    }

    public void InOrder() {
        inorder(root);
        System.out.println();
    }

    private void postorder(Node rnode) {
        if (rnode == null) return;

        postorder(rnode.getLeft());
        postorder(rnode.getRight());
        System.out.println(rnode.getValue() + " ");

    }

    public void PostOrder() {
        postorder(root);
        System.out.println();
    }


    class Node {
        private int value;
        private Node left;
        private Node right;

        public Node(int value, Node left, Node right) {
            this.value = value;
            this.left = left;
            this.right = right;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        public Node getLeft() {
            return left;
        }

        public void setLeft(Node left) {
            this.left = left;
        }

        public Node getRight() {
            return right;
        }

        public void setRight(Node right) {
            this.right = right;
        }
    }

}