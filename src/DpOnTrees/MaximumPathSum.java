package DpOnTrees;

public class MaximumPathSum {
    public static void main(String[] args) {
        int[] res = new int[1];
        res[0] = Integer.MIN_VALUE;
        TreeNode root = new TreeNode(4);
        pathSum(root, res);
        System.out.println(res[0]);
    }

    public static int pathSum(TreeNode root, int[] res){
        if(root == null) return 0;

        int left = pathSum(root.left, res);
        int right = pathSum(root.right, res);

        // including main root
        int temp = Math.max(Math.max(left, right)+ root.val, root.val);
        // not including main root
        int ans = Math.max(temp, left+right+root.val);
        res[0] = Math.max(temp, ans);

        return temp;
    }

}
