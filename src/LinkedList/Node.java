package LinkedList;

public class Node {

    public Node next;
    public int data;

    public Node (int data){
        this.data = data;
        next = null;
    }

    public void setNext(Node input){
        this.next = input;
    }

    public Node getNext(){
        return this.next;
    }


    public void insert(int data) {
        Node curr = this;
        while (curr.next!=null){
            curr = curr.next;
        }
        curr.next = new Node(data);
    }

    public void printList() {
        Node curr = this;
        while (curr!=null){
            System.out.print(curr.data + "->");
            curr = curr.next;
        }
    }

    public Node find(int data) {
        Node curr = this;
        while (curr!=null){
            if (curr.data == data){
                break;
            }
            curr = curr.next;
        }
        return curr;
    }
}
