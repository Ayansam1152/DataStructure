package codeChefQuestions;

import com.sun.source.tree.Tree;

import java.util.Scanner;

public class ThreeDices {
    static int f = 1;

//    static long[] rotation(long a[]){
//
//    }

    public static void main(String[] ayn) {
//        TreeNode root = new TreeNode(1);
//        root.left = new TreeNode(1);
//        System.out.println(isValidBST(root));


        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        while (t-- > 0) {
            long n = sc.nextLong();
            long a[] = new long[(int)n];
            long b[] = new long[(int)n];

            for(int i=0;i<n;i++){
                a[i] = sc.nextLong();
            }
            for(int i=0;i<n;i++){
                b[i] = sc.nextLong();
            }
            int index = 0, min = Integer.MAX_VALUE;
            for(int i=0;i<n;i++){
                long num = (a[0]+b[i])%n;
                if(num < min){
                    min =  (int)num;
                    index =i;
                }
            }

            long c[] = new long[(int)n];

            for(int i=0;i<n;i++){
                c[i] = (a[i]+b[(int) ((i+index)%n)])%n;
            }

            for(int i=0;i<n;i++){
                System.out.print(c[i]+" ");
            }
            System.out.println();


//            long h = sc.nextLong();
//            long a[] = new long[(int)n];
//            for(int i=0;i<n;i++){
//                a[i] = sc.nextLong();
//            }
//            long sum=0;
//            boolean ok = false;
//            for(int i=0;i<n;i++){
//                if(a[i] == 0){
//                    sum = Math.max(0, sum-d);
//                }
//
//                sum += a[i];
//
//                if(sum > h){
//                    ok = true;
//                    break;
//                }
//            }
//            if(ok){
//                System.out.println("YES");
//            }else{
//                System.out.println("NO");
//            }

//            System.out.println(Math.max(Math.max(x+y, x+z),y+z));
//
//            if(x+y <6){
//                float ans = ((float)(6 - (x+y))/(float) 6);
//                System.out.println(ans);
//            }else {
//                System.out.println(0);
//            }

//            double count= 6 - (x+y);
//            double ans =(count/6.0);
//            ans = (Math.round(ans * 1000000000))/1000000000.0;
//            System.out.println(ans - count/6);
//            System.out.println(ans);


        }
//    public static boolean isValidBST(TreeNode root) {
//
//        valid(root, null);
//
//        return f == 1;
//    }

//    public static  void valid(TreeNode root, TreeNode prev){
//        if(root == null) return;
//
//        valid(root.left, prev);
//
//        if(prev != null && root.val <= prev.val){
//            f=0;
//            return;
//        }
//
//        prev = root;
//
//        valid(root.right, prev);
//    }

//        class TreeNode {
//            int val;
//            TreeNode left;
//            TreeNode right;
//
//            TreeNode() {
//            }
//
//            TreeNode(int val) {
//                this.val = val;
//            }
//
//            TreeNode(int val, TreeNode left, TreeNode right) {
//                this.val = val;
//                this.left = left;
//                this.right = right;
//            }
//        }
    }
}


