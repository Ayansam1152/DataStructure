package BinaryTreeImplementation;

public class BinaryTree {
    Node root;
    public class Node{
        int data;
        Node left, right;
        Node(int num){
            data = num;
            left = right = null;
        }
    }

    BinaryTree(int data){
        root = new Node(data);
    }
    BinaryTree(){
        root = null;
    }

}
