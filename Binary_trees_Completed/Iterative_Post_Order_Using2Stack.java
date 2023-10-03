package Binary_trees_Completed;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

//class TreeNode {
//    int val;
//    TreeNode left;
//    TreeNode right;
//
//    TreeNode(int x) {
//        val = x;
//    }
//}
public class Iterative_Post_Order_Using2Stack {
    public  static List<Integer>Postorder1(TreeNode root){
        Stack<TreeNode>st1=new Stack<>();
        Stack<TreeNode>St2=new Stack<>();
        List<Integer>L4=new ArrayList<>();
        if (root==null){
            return L4;
        }
        st1.push(root);
        while (!st1.isEmpty()){
            root=st1.pop();
            St2.add(root);
            if (root.left!=null){
                st1.push(root.left);
            }
            if (root.right!=null){
                st1.push(root.right);
            }
        }
        while (!St2.isEmpty()){
            L4.add(St2.pop().val);
        }
        return L4;
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.left.right.left = new TreeNode(6);
        root.left.right.right = new TreeNode(7);
        List<Integer> Result3=Postorder1(root);
        System.out.println(Result3);
    }
}
