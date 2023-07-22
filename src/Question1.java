
import java.io.*;
        import java.util.HashMap;
        import java.util.Scanner;
        import java.lang.*;
class Question1 {
    public static String removeAllDigit(String str)
    {
        char[] charArray = str.toCharArray();
        String result = "";
        for (int i = 0; i < charArray.length; i++) {
            if (Character.isDigit(charArray[i])) {
                result = result + charArray[i];
            }
        }
        return result;
    }


    public static int[] pes(String []arr){
        int []scr = new int[arr.length];
        for(int i =0;i<arr.length;i++){
            String str = arr[i];
            String num = removeAllDigit(str);
            scr[i] = Integer.parseInt(num);
        }
        return scr;
    }
    ///////////////////////
    public static int emotionScr(String []str,int []arr,HashMap<String,Integer> emap){
        int res = 0;
        for(int i = 0;i<str.length;i++){
            String s = str[i];
            int scount = arr[i];
            res+= scount*emap.get(s);
        }
        return res;
    }

    // Function to check the Vowel
    static boolean isVowel(char ch)
    {
        ch = Character.toUpperCase(ch);
        return (ch=='A' || ch=='E' || ch=='I' ||
                ch=='O' || ch=='U');
    }

    // Returns count of vowels in str
    static int countVowels(String str)
    {
        int count = 0;
        for (int i = 0; i < str.length(); i++)
            if (isVowel(str.charAt(i))) // Check for vowel
                ++count;
        return count;
    }

    /// vovles scr;
    public static int voScr(String []str,int []arr){
        int res = 0;
        for(int i = 0;i<str.length;i++){
            res+= countVowels(str[i])*arr[i];
        }
        return res;
    }

    static boolean isPrime(int n)
    {
        // Corner case
        if (n <= 1)
            return false;

        // Check from 2 to n-1
        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;

        return true;
    }

    // A function that prints
    // given number in words
    static void convert_to_words(char[] num)
    {
        // Get number of digits
        // in given number
        int len = num.length;

        // Base cases
        if (len == 0) {
            System.out.println("empty string");
            return;
        }
        if (len > 4) {
            System.out.println(
                    "Length more than 4 is not supported");
            return;
        }

        /* The first string is not used, it is to make
            array indexing simple */
        String[] single_digits = new String[] {
                "zero", "one", "two",   "three", "four",
                "five", "six", "seven", "eight", "nine"
        };

        /* The first string is not used, it is to make
            array indexing simple */
        String[] two_digits = new String[] {
                "",          "ten",      "eleven",  "twelve",
                "thirteen",  "fourteen", "fifteen", "sixteen",
                "seventeen", "eighteen", "nineteen"
        };

        /* The first two string are not used, they are to
         * make array indexing simple*/
        String[] tens_multiple = new String[] {
                "",      "",      "twenty",  "thirty", "forty",
                "fifty", "sixty", "seventy", "eighty", "ninety"
        };

        String[] tens_power
                = new String[] { "hundred", "thousand" };

        /* Used for debugging purpose only */
        // System.out.print(String.valueOf(num) + ": ");

        /* For single digit number */
        if (len == 1) {
            System.out.println(single_digits[num[0] - '0']);
            return;
        }

        /* Iterate while num
            is not '\0' */
        int x = 0;
        while (x < num.length) {

            /* Code path for first 2 digits */
            if (len >= 3) {
                if (num[x] - '0' != 0) {
                    System.out.print(
                            single_digits[num[x] - '0'] + " ");
                    System.out.print(tens_power[len - 3]
                            + " ");
                    // here len can be 3 or 4
                }
                --len;
            }

            /* Code path for last 2 digits */
            else {
                /* Need to explicitly handle
                10-19. Sum of the two digits
                is used as index of "two_digits"
                array of strings */
                if (num[x] - '0' == 1) {
                    int sum
                            = num[x] - '0' + num[x + 1] - '0';
                    System.out.println(two_digits[sum]);
                    return;
                }

                /* Need to explicitly handle 20 */
                else if (num[x] - '0' == 2
                        && num[x + 1] - '0' == 0) {
                    System.out.println("twenty");
                    return;
                }

                /* Rest of the two digit
                numbers i.e., 21 to 99 */
                else {
                    int i = (num[x] - '0');
                    if (i > 0)
                        System.out.print(tens_multiple[i]
                                + " ");
                    else
                        System.out.print("");
                    ++x;
                    if (num[x] - '0' != 0)
                        System.out.println(
                                single_digits[num[x] - '0']);
                }
            }
            ++x;
        }
    }


    public static void main(String[] args) {

        HashMap<String, Integer> emap = new HashMap<String,Integer>();
        emap.put("Happy",10);
        emap.put("Sad",5);
        emap.put("Neutral",2);
        emap.put("None",1);


        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        String []pe = new String [n];
        String []es = new String [n];

        for(int i = 0;i<n;i++){
            pe[i] = scn.nextLine();
        }
        for(int i = 0;i<n;i++){
            es[i] = scn.nextLine();
        }

        int elscr[] = new int[n];

        // physical element score
        elscr = pes(pe);


        int emoS = emotionScr(es,elscr,emap);
        int vovelScr = voScr(pe,elscr);

        int g  = Math.max(emoS,vovelScr);
        int s = Math.min(emoS,vovelScr);

        int res = g/s;

        if(isPrime(res)==true){
            System.out.print("Yes ");
        }else{
            System.out.print("No ");
        }
        String a = Integer.toString(res);
        convert_to_words(a.toCharArray());


    }

    //es =array emotional string
    // emoS = score of emotion string;
    //elscr = element scr;
}