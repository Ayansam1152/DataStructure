package dataStructureImplementation.Stack;

public class StackUsingLinkedList {

    Node top;

    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public boolean isEmptyList(){
        return top == null;
    }

    public boolean pushList(int data){
        Node newNode = new Node(data);
        if(top == null){
            top = newNode;
        }
        Node temp = top;
        top = newNode;
        top.next = temp;
        return true;
    }

    public int peekList(){
        if(top == null) {
            System.out.println("Your Stack is Empty..");
            return 0;
        }else{
            return top.data;
        }
    }

    public int popList(){
        if(top == null) {
            System.out.println("Your Stack is Empty..");
            return 0;
        }else{
           int n = top.data;
           top = top.next;
           return n;
        }
    }
}
