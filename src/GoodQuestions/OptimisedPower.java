package GoodQuestions;

import java.util.Scanner;

public class OptimisedPower {
    public static void main(String[] ayan){
        Scanner sc= new Scanner(System.in);
        int base = sc.nextInt();
        int power = sc.nextInt();
        int ans =1;
        // Time complexity is O(log n) means Best
        while(power>0){
            int lastBit = (power & 1);
            if(lastBit >0){
                ans = ans*base;
            }
            base *= base;
            power = power>>1;

        }
        System.out.println(ans);
    }
}
