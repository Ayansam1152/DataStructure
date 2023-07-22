package QueueImplementation;



public class LinkedListQueue {
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }

    Node front, rear;
    LinkedListQueue(){
        front = rear=  null;
    }
    public void EnqueueList(int num){
        Node node = new Node(num);
        if(rear == null){
            front = rear = node;
            return;
        }
        rear.next = node;
        rear = node;
    }

    public void DequeueList(){
        if(front == null){
            System.out.println("Sorry Your Q is Empty..");
            return;
        }
        front = front.next;
        if(front == null){
            rear = null;
        }
    }
    public void DisplayListQ(){
        if(front == rear){
            System.out.println("Sorry Your Q is Empty..");
        }else{
            Node temp = front;
            while(temp != rear){
                 System.out.print(temp.data+" ");
                 temp = temp.next;
            }
        }
    }
}
