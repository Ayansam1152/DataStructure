import java.util.Arrays;

public class PrimeNumberFinder {
    public static void main(String[] args) {
        Prime(1000);
    }

    public static void Prime(int n){
        boolean[] a = new boolean[n];
        Arrays.fill(a, true);
        for(int i=2;i*i <n;i++){
            if(a[i]){
               for(int p = i*i;p<n;p = i+p){
                   a[p] = false;
               }
            }
        }
        int count =0;
        for (int i = 2; i < n; i++) {
            if(a[i]){
                if(count == 100) break;
                count++;
                System.out.print(i+" -> "+count);

            }
        }
    }
}
