package QueueUsingLinkedList;

public class QueueUsingLL {
    public static void main(String[] args) {
        Queue q=new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
class Queue{
    Node head=null;
    Node tail=null;
    public boolean isEmpty(){
        return head==null&& tail==null;
    }
    public void add(int data){
        Node newNode=new Node(data);
        if(tail==null){
            tail=head=newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;
    }
    public int remove(){
        if(isEmpty()){
            return -1;
        }
        int front=head.data;
        head=head.next;
        if(head==tail){
            tail=null;
        }
        return front;
    }
    public int peek(){
        if(isEmpty()){
            return -1;
        }
        return head.data;
    }
}
class Node{
    int data;
    Node next;
    public Node(int data){
        this.data=data;
        next=null;
    }
}