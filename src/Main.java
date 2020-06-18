import BinaryTree.BinaryTree;
import LinkedList.LinkedList;

public class Main {

    public static void main(String[] args) {

//        TreePrinting();
//        LinkedListPrinting();
//        CircularLinkedList();
        ReverseLinkedList();
    }

    public static void TreePrinting() {
        BinaryTree tree = new BinaryTree(5);
        for (int i = 1; i <= 10; i++) {
            tree.insert(i);
        }
        System.out.println("Tree In Order:");
        tree.printInOrder();
        System.out.println();
        System.out.println("Tree Post Order:");
        tree.printPostOrder();
        System.out.println();
        System.out.println("Tree Pre Order:");
        tree.printPreOrder();
    }

    ;

    public static void LinkedListPrinting() {
        LinkedList linkedList = new LinkedList(0);
        for (int i = 1; i <= 10; i++) {
            linkedList.insert(i);
        }
        linkedList.printList();
    }

    ;

    public static void CircularLinkedList() {
        LinkedList linkedList = new LinkedList(0);
        for (int i = 1; i <= 10; i++) {
            linkedList.insert(i);
        }
        linkedList.printList();
        System.out.println();
        linkedList.find(10).setNext(linkedList.find(3));

        System.out.print("Circular Point is:");
        System.out.println(linkedList.findCircularLinkedList());
    }

    ;

    private static void ReverseLinkedList() {
        LinkedList linkedList = new LinkedList(1);
        for (int i = 2; i <= 10; i++) {
            linkedList.insert(i);
        }
        linkedList.printList();
        System.out.println();
        linkedList.reverseList();
        System.out.println("Reversed LinkedList:");
        linkedList.printList();
    }


}
