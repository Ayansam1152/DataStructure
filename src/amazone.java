import java.util.Arrays;
import java.util.Locale;

public class amazone {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

//		Scanner sc = new Scanner(System.in);
//		int n= sc.nextInt();
//		int pas = sc.nextInt();

//        System.out.print(help(10, 25003));
        String[] s = {"[5,2,3]", "[2,2,3,10,6]"};
        System.out.println(Ac(""));

    }
    public static int help(int n, int pas) {
        if(pas%5000==0) {
            int t=pas/5000;
            return t;
        }
        //return kar do class;

        int[] ar = new int[n+1];
        for(int i=1;i<=n;i++)
            ar[i]=5000*i;
        int k=1;
        int p=1;
        while(k <50) {
            for(int i=1;i<n;i++) {

                int temp = ar[i]+5000+k;
                ar[i]=ar[i]+5000+k;
//                System.out.print(temp+"  ");
                if(temp==pas)
                    return i;
                else if(temp>pas)
                    break;
                else temp=0;
            }
//            System.out.println();
            k++;

        }


        return -1;
    }

    private static String fun(String[] s){
        String s1 = s[0], s2= s[1];
        char[] c1 = s1.toCharArray(), c2 = s2.toCharArray();

        int i=0, j=0;
        StringBuilder ans = new StringBuilder();
        while(i < c1.length && j < c2.length){

            int a = c1[i], b = c2[j];
            if( (a >=48 && a <= 57) && (b >= 48 && b <= 57) ){
                ans.append(c1[i] - '0' + c2[j] - '0').append("-");

            }
            i++;
            j++;
        }

        while(i < c1.length){
            int a = c1[i];
            if((a >=48 && a <= 57)){
                ans.append(c1[i]).append("-");

            }
            i++;
        }
        while(j < c2.length){
            int b = c2[j];
            if((b >= 48 && b <= 57)){
                ans.append(c2[j]).append("-");

            }
            j++;
        }
        ans = new StringBuilder(ans.substring(0, ans.length() - 1));
        return  ans.toString();
    }

    public static String Ac(String strArr) {
        String[] ar1 = strArr.split(" ") ;
        String[] ar2 =ar1[0].split(",");
        String[] ar3 =ar1[1].split(",");

        String s =""+(Integer.parseInt(ar2[0])+Integer.parseInt(ar3[0]));

        int n= Math.min(ar2.length, ar3.length );

        for(int i=1;i<ar2.length;i++)
            s+="-"+(Integer.parseInt(ar2[i])+Integer.parseInt(ar3[i]));

        return s;
    }
}
