package codeChefQuestions;

import java.util.Scanner;

public class VaccineDrive {
    public static void main(String[] ayn){
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        while(t-->0){
            int g  = sc.nextInt();
            int p = sc.nextInt();
            int a[] = new int[10];
            for(int i=0;i<10;i++){
                a[i] = sc.nextInt();
            }
            int i= a.length-1, d=0, rem=0;
            while(i>=0){
                if(a[i] == p && rem >0){
                    rem+= p-rem;
                    i--;
                    d++;
                }else if(a[i] <p){
                    if(i!=0 && rem>0){
                        a[i-1]+=a[i]+rem;
                    }
                    d++;
                }else{
                    rem += a[i] -p;
                    d++;
                }
                if(i==g){
                    break;
                }
                i--;
            }


            System.out.println(d);
        }
    }
}
