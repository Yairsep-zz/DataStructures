package LinkedList;

import BinaryTree.BinaryNode;

public class LinkedList {

    public Node head;

    public LinkedList(int data){
        head = new Node(data);
    }

    public void insert(int data) {
        if (head == null){
            head = new Node(data);
        }
        else{
            head.insert(data);
        }
    }
    public Node find(int data) {
        if (head == null){
            return null;
        }
        else{
            return head.find(data);
        }
    }

    public void printList() {
        if (head == null){
            System.out.println("Empty Linked List");
        }
        else{
            head.printList();
        }
    }

    public int findCircularLinkedList() {
        Node slow = head.next;
        Node fast = head.next.next;

        while (slow.data != fast.data ){
            slow = slow.next;
            fast = fast.next.next;
        }
        slow = head;
        while (slow.data != fast.data){
            slow = slow.next;
            fast = fast.next;
        }
        return slow.data;
    }

    public void reverseList() {

        Node prev = null;
        Node curr = head;
        Node next = null;

        while (curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }
}
