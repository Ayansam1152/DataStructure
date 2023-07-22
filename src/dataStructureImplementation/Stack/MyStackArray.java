package dataStructureImplementation.Stack;

public class MyStackArray {
    final int Size = 2;
    int top;
    int a[] = new int[Size];
    MyStackArray(){
        top=-1;
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public boolean push(int num){
        if(top >= a.length-1){
            System.out.println("sorry Your Stack is Overflow.. ):");
            return false;
        }else{
            top++;
            a[top] = num;
            return true;
        }
    }

    public int pop(){
        if(top == -1){
            System.out.println("Sorry Your Stack is UnderFlow..");
            return 0;
        }else{
            int x = a[top--];
            return x;
        }
    }
    public int peek(){
        if(top == -1){
            System.out.println("Sorry Your Stack is UnderFlow..");
            return 0;
        }else{
            int temp = a[top];
            return temp;
        }
    }
}
