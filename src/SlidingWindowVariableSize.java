public class SlidingWindowVariableSize {
    public static void main(String[] args) {
        System.out.println(findString("pwwkew").length());
    }
    public static String findString(String str) {
        if (str == null || str.length() == 0) {
            return str;
        }
        boolean[] window = new boolean[128];
        int begin = 0, end = 0;

        for (int low = 0, high = 0; high < str.length(); high++) {
            if (window[str.charAt(high)]) {
                while (str.charAt(low) != str.charAt(high)) {
                    window[str.charAt(low)] = false;
                    low++;
                }

                low++;

            } else {
                window[str.charAt(high)] = true;

                if (end - begin < high - low) {
                    begin = low;
                    end = high;
                }
            }
        }
        return str.substring(begin, end + 1);
    }
}
