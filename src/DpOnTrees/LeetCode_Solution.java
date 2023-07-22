package DpOnTrees;


//  Definition for a binary tree node.
class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }

public  class LeetCode_Solution {
    int i=0;
    public void recoverTree(TreeNode root) {
// you cannot pass Prev, first, sec variable in a function it show you error always create global variable
        TreeNode prev = new TreeNode(Integer.MIN_VALUE);
        TreeNode first = null, sec = null, mid = null;
        help(root, prev,first,sec, mid);

        if(first != null && sec != null){
            int t = first.val;
            first.val = sec.val;
            sec.val =t;
        }
        else if(first != null && mid != null){
            int t = first.val;
            first.val =mid.val;
            mid.val = t;
        }

    }



    private void help(TreeNode root, TreeNode prev, TreeNode first, TreeNode sec, TreeNode mid){

        if(root == null) return;

        help(root.left, prev,first, sec, mid);
        if(prev != null && (root.val < prev.val)){

            if(first == null){
                first = prev;
                mid = root;
            }else{
                sec = root;
            }
        }
        prev = root;
        help(root.right, prev,first, sec, mid);

    }

}
