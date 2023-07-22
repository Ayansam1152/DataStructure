import java.util.PriorityQueue;
import java.util.Scanner;

public class Relaval {
    public static void main(String[] args) {
        /*
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];

        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }

        int sum =0;

        for(int i=0;i<n;i++){
            int num = a[i];
            int temp =0;

            for(int j =0;j<n;j++){
                if(i != j){
                    temp+= a[j];
                }
            }
            sum+= (num*temp);
        }

        System.out.println(sum);

         */
        int[] a = {2,7,4,1,8};
        System.out.println(lastStoneWeight(a));
    }

    public static int lastStoneWeight(int[] stones) {

        PriorityQueue<Integer> pq = new PriorityQueue<>((x, y) -> Integer.compare(y,x));

        for(int t : stones){
            pq.add(t);
        }

        while(pq.size() != 0){

            int f =pq.poll();
            int s = pq.poll();

//            if(f == 0 && s == 0) break;
            if(f != s){
                pq.add(f-s);
            }
        }

        return pq.size() >0 ? pq.poll():0;

    }

}
