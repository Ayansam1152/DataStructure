package QueueImplementation;

public class Main {
    public static void main(String[] ayn){

        LinkedListQueue q = new LinkedListQueue();
        q.EnqueueList(10);
        q.EnqueueList(20);
        q.DequeueList();
        q.DequeueList();
        q.EnqueueList(30);
        q.EnqueueList(40);
        q.EnqueueList(50);
        q.DequeueList();
        System.out.println("Queue Front : " + q.front.data);
        System.out.println("Queue Rear : " + q.rear.data);
//        // Create a queue of capacity 4
//        ArrayQueue q = new ArrayQueue(4);
//
//        // print Queue elements
//        q.DisplayQ();
//
//        // inserting elements in the queue
//        q.Enqueue(20);
//        q.Enqueue(30);
//        q.Enqueue(40);
//        q.Enqueue(50);
//
//        // print Queue elements
//        q.DisplayQ();
//
//        // insert element in the queue
//        q.Enqueue(60);
//
//        // print Queue elements
//        q.DisplayQ();
//
//        q.Dequeue();
//        q.Dequeue();
//        System.out.printf("\n\nafter two node deletion\n\n");
//
//        // print Queue elements
//        q.DisplayQ();
//
//        // print front of the queue
//        q.FrontQ();
    }
}
