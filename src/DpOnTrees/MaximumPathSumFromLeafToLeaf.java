package DpOnTrees;

public class MaximumPathSumFromLeafToLeaf {
    public static int  solve(TreeNode root, int[] res){
        if(root == null) return 0;

        int left = solve(root.left, res);
        int right = solve(root.right,res);

        // including root node
        int temp = Math.max(left,right) + root.val;
        if(root.left == null &&  root.right == null){
            temp = Math.max(temp, root.val);
        }

        // without including root node
        int ans = Math.max(temp, left+right+root.val);
        res[0] = Math.max(ans, temp);
        return temp;
    }
}
