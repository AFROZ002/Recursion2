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

public class Iterative_Pre_Order {
    public  static List<Integer>Iterative(TreeNode root) {
        List<Integer> l2 = new ArrayList<>();
        if (root == null) {
            return l2;

        }
        Stack<TreeNode>st=new Stack<>();
        st.push(root);
        while (!st.isEmpty()){
            root=st.pop();
            l2.add(root.val);
            if (root.right!=null){
                st.push(root.right);
            }
            if (root.left!=null) {
                st.push(root.left);
            }
        }
        return l2;
    }
    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.left.right.left = new TreeNode(5);
        root.left.right.right = new TreeNode(6);
        List<Integer>Result=Iterative(root);
        System.out.println(Result);

    }
}
