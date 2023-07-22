package codeChefQuestions;


import java.util.Scanner;




public class StringMatching {

    public static boolean checks(char c){
        return "EQUINOX".indexOf(c)>=0;
    }

    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            long ab = sc.nextInt();
            long b = sc.nextInt();
            String a[] = new String[n];

            for(int i=0;i<n;i++){
                a[i] = sc.next();
            }

            long Anu =0, Sar =0;

            for(int i=0;i<n;i++){
                String s = a[i];
                if(checks(s.charAt(0))){
                    Sar += ab;
                }else{
                    Anu += b;
                }
            }

            if(Anu > Sar){
                System.out.println("ANURADHA");
            }else if(Sar > Anu){
                System.out.println("SARTHAK");
            }else{
                System.out.println("DRAW");
            }

        }

    }


}

