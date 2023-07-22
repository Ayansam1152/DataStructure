package DpOnTrees;

import java.util.ArrayList;

public class LeetCode_Good_questions {
    public String getDirections(TreeNode root, int startValue, int destValue) {
        TreeNode node = findLCS(root, startValue, destValue);

        ArrayList<String> lca_sToNode = new ArrayList();
        ArrayList<String> nodeToDest = new ArrayList();
        traverse(node, lca_sToNode, startValue);
        traverse(node, nodeToDest, destValue);

        StringBuilder s = new StringBuilder();
        StringBuilder v = new StringBuilder();
        for(int i=0;i<lca_sToNode.size();i++){
            s.append("U");
        }

        for(int i=0;i<nodeToDest.size();i++){
            v.append(nodeToDest.get(i));
        }

        System.out.print(lca_sToNode.size());
        // return String.join(", ", lca_sToNode)+String.join(", ",nodeToDest);
        return s +v.toString();

    }

    private boolean traverse(TreeNode root, ArrayList<String> path, int val){
        if(root == null) return false;
        if(root.val == val) return true;
        path.add("L");
        if(traverse(root.left, path, val)) return true;

        path.remove(path.size()-1);

        path.add("R");
        if(traverse(root.right, path, val)) return true;

        path.remove(path.size()-1);

        return false;
    }

    private TreeNode findLCS(TreeNode root, int s, int d){
        if(root == null) return null;

        if(root.val == s || root.val == d) return root;

        TreeNode left = findLCS(root.left, s,d);
        TreeNode right = findLCS(root.right, s,d);

        if(left != null && right != null) return root;
        if(left != null) return left;
        if(right != null) return right;
        return null;

    }
}
