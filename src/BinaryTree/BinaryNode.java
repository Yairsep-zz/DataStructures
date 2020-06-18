package BinaryTree;

public class BinaryNode {

    private int data;
    private BinaryNode left;
    private BinaryNode right;

    public BinaryNode (int data){
        this.data = data;
        left = right = null;

    }

    public void insert(int data) {

        if (this.data == data){
            System.out.println("Data Value already exist in the Tree");
        }
        if (this.data > data) {
            if (left == null) {
                left = new BinaryNode(data);
            } else {
                left.insert(data);
            }
        }
        else if (this.data < data){
            if (right == null) {
                right = new BinaryNode(data);
            } else {
                right.insert(data);
            }
        }
    }

    public void printInOrder() {

        if (left != null){
            left.printInOrder();
        }
        System.out.print(data + "->");

        if (right != null){
            right.printInOrder();
        }
    }

    public void printPreOrder() {

        System.out.print(data + "->");

        if (left != null){
            left.printInOrder();
        }

        if (right != null){
            right.printInOrder();
        }
    }

    public void printPostOrder() {

        if (left != null){
            left.printInOrder();
        }
        if (right != null){
            right.printInOrder();
        }

        System.out.print(data + "->");
    }


}
