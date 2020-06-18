package BinaryTree;

public class BinaryTree {

    public BinaryNode head;

    public BinaryTree(int data){
        head = new BinaryNode(data);
    }

    public void insert(int data){

        if (head == null){
            head = new BinaryNode(data);
        }
        else{
            head.insert(data);
        }
    }

    public void printInOrder(){

        if (head == null){
            System.out.println("Empty Tree");
        }
        else{
            head.printInOrder();
        }
    }

    public void printPreOrder(){
        if (head == null){
            System.out.println("Empty Tree");
        }
        else{
            head.printPreOrder();
        }
    }

    public void printPostOrder(){
        if (head == null){
            System.out.println("Empty Tree");
        }
        else{
            head.printPostOrder();
        }
    }




}
