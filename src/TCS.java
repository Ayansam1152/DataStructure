public class TCS {
    public static void main(String[] args) {
        System.out.println();
    }

    public static void minSwap(int[] a, int[] b){
//        int n= 4,r=2;
//        int ans = comb(n,r);
//        if(ans%2 == 0){
//            System.out.println(ans -1);
//        }else{
//            System.out.println(ans -2);
//        }
//        System.out.println();

    }
    public static int comb(int n, int r){
        int result = fact(n)/fact(r)*fact(n-r);
        return result%2 == 0?result-1:result-2;
    }

    public static int fact(int n){
        int f =1, j =1;
        while(j <= n){
            f = f*j;
            j++;
        }
        return f;
    }
}
