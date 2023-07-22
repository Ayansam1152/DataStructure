package DpOnTrees;

public class DiameterOfTreeOrMaxDistanceBetweenTwoLeafNode {
    static class Node{
        Node left, right;
        int val;

        Node(int _val){
            val = _val;
        }
    }

    public static void main(String[] args) {
        int[] res = new int[1];
        res[0] = Integer.MIN_VALUE;
        Node root = new Node(2);
        root.left = new Node(2);
        root.right = new Node(2);
        root.left.left = new Node(2);
        root.right.right = new Node(2);
        root.left.right =new Node(2);
        root.right.left = new Node(2);

        solve(root, res);
        System.out.println(res[0]);
    }
    //              <<<<<<<<<<<<<<< Today we'll learn about general syntax for tree' >>>>>>>>>>>>>>>>>>>>
    public static int solve(Node root, int[] res){
        // it is base case
        if(root == null) return 0;
        // after base now Hypothesis

        int left = solve(root.left, res);
        int right = solve(root.right, res);

        // this is when we pass through the root
        int temp = Math.max(left, right)+1;

        // this is for without passing through the root
        int ans = Math.max(temp, left+right+1);

        res[0] = Math.max(temp, ans);
        return temp;
    }
}
