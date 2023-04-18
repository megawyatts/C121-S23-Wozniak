package WeekThirteen;

public class LinkedListQueue {
    private class Node{
        public Object data;
        public Node next;
        public Node(Object data,Node next){
            this.data=data;
            this.next=next;
        }
    }
    private Node head=null;
    private Node tail=null;

    public void enqueue(Object item){
        Node newNode=new Node(item, null);
        // if queue is empty new node becomes the head? yeah
        if (isEmpty()){
            head=newNode;

        }else{
            tail.next=newNode;
        }
        tail=newNode;
    }
    public Object dequeue(){
        if (isEmpty()){
            System.out.println("Queue is Empty");
            return null;
        }
        Object item= head.data;
        //if the head is the tail set it's value to null
        if(tail==head){
            tail=null;
        }
        head=head.next;
        return item;
    }
    public Object peek(){
        if(head==null) {
            System.out.println("Queue is Empty");
            return null;
        }
        return head.data;
    }

    public boolean isEmpty(){
        return head==null;
    }

    public int size(){
        int count=0;
        for(Node node=head;node!=null;node=node.next){
            count++;
        }
        return count;
    }
}
