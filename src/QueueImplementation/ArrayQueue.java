package QueueImplementation;

public class ArrayQueue {
    int front, rear;
    int a[];

    ArrayQueue(int size){
        a = new int[size];
        front=0;
        rear=0;
    }

    public void DisplayQ(){
        if(rear == front){
            System.out.println("Your Queue capacity empty");
        }else{
            for(int i=front;i<rear;i++){
                System.out.print(a[i]+" ");
            }
            System.out.println();
        }
    }

    public void Enqueue(int num){
        if(rear >= a.length){
            System.out.println("Your Queue capacity is Full..");
        }else{
            a[rear] = num;
            rear++;
        }
    }
    public void Dequeue(){
        if(front == rear){
            System.out.println("Your Queue is Empty..");
        }else{
            for(int i=0;i<rear-1;i++){
                a[i] = a[i+1];
            }
            if(rear <  a.length){
                a[rear] =0;
            }
            rear--;
        }
    }

    public int FrontQ(){
        if(front == rear){
            System.out.println("Sorry Your key is Empty..");
            return 0;
        }else{
            return a[front];
        }
    }
}
