public class willy {
    public static void main(String[] args) {
        System.out.print(help(19));
    }

    public static String help(int n){
        String result = "";
        int c = 0, t =0;
        while (n != 0){

            int rem = n%2;
            if(rem == 1){
                c++;
            }
            t++;
            n = n/2;
        }
        String al = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        int  s = t%c;
        char b = al.charAt();
        for(int i=0;i<c*2;i++){
            if(i %2== 0){
                result+='1';
            }else{
                result+=b;                b++;
           }
        }
        return result;
    }
}








































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































