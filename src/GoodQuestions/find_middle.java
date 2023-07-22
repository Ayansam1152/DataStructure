package GoodQuestions;

public class find_middle {
    public static void main(String[] ayn){
        int arr[] = {12, 10, 30, 50, 100};
        System.out.println(" "+fun(arr, 5)+" ");
    }

    static int fun(int a[],int n)
    {
        int x;
        if(n == 1)
            return a[0];
        else
            x = fun(a, n - 1);
        if(x > a[n - 1])
            return x;
        else
            return a[n - 1];
    }

    static void fun3(int n)
    {
        if(n > 0)
        {
            fun3(n - 1);
            System.out.print(n+" ");
            fun3(n - 1);
        }
    }

    static void fun4(int n){
        if(n==0){
            return;
        }
        fun4(n/2);
        System.out.println(n%2);
    }
    static int fp = 15;
    static int fun2 ( int n)
    {
        int t, f;

        if ( n <= 1 )
        {
            fp = 1;
            return 1;
        }
        t = fun2( n - 1);
        f = t + fp;
        fp = t;
        return f;
    }
}
