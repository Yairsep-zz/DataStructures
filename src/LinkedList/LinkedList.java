package LinkedList;

public class LinkedList {

    public Node head;

    public Node LinkedList(){
        if (head == null){
            head = new Node();
        }
        else{
            return head;
        }
    }
}
