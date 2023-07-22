package DpOnTrees;


import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class TimeToBurnTree {
        public static void main(String[] args) {

        }

        public static int timeToBurnTree(TreeNode root, int start){
                HashMap<TreeNode, TreeNode> map = new HashMap<>();
                TreeNode target = bfsToMapParent(root, map, start);
                int max = findMaxDistance(map, target);
                return max;
        }

        private static int findMaxDistance(HashMap<TreeNode, TreeNode> map, TreeNode target) {
                HashMap<TreeNode, Integer> vis = new HashMap<>();
                Queue<TreeNode> q = new LinkedList<>();
                int max = 0;
                vis.put(target, 1);
                while (!q.isEmpty()){
                        int size = q.size();
                        int fl = 0;

                        for(int i=0;i<size;i++){
                                TreeNode node = q.poll();

                                if(node.left != null && vis.get(node.left) == null){
                                        fl = 1;
                                        vis.put(node.left, 1);
                                        q.offer(node.left);
                                }

                                if(node.right != null && vis.get(node.right) == null){
                                        fl = 1;
                                        vis.put(node.right, 1);
                                        q.offer(node.right);
                                }

                                if(map.get(node) != null && vis.get(map.get(node)) == null){
                                        fl = 1;
                                        vis.put(map.get(node), 1);
                                        q.offer(map.get(node));
                                }
                        }
                        if(fl == 1) max++;
                }
                return max;
        }

        private static TreeNode bfsToMapParent(TreeNode root, HashMap<TreeNode, TreeNode> map, int start) {
                Queue<TreeNode> q = new LinkedList<>();
                q.offer(root);
                TreeNode res =new TreeNode(-1);
                while (!q.isEmpty()){
                        TreeNode node = q.poll();
                        if(node.val == start) res = node;

                        if(node.left != null){
                                map.put(node.left, node);
                                q.offer(node.left);
                        }

                        if(node.right != null){
                                map.put(node.right, node);
                                q.offer(node.right);
                        }
                }
                return res;
        }
}
