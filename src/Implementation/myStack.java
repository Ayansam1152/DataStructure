package Implementation;

import java.lang.*;
import java.text.DecimalFormat;


public class myStack {
    public static void main(String[] ayn){
//        System.out.println("Enter the size of the array");
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int a[] = new int[n];
//        DecimalFormat df = new DecimalFormat("0.00");
//        double sec = Double.parseDouble(df.format(9.578));
      double ans = Math.round(9.578 * 100.0)/100.0;
      System.out.println(ans);
        if(ans <9.58){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }


    }
}
