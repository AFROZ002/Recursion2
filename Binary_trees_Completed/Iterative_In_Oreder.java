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

public class Iterative_In_Oreder {
    public static  List<Integer>inorder(TreeNode root){
        List<Integer>l3=new ArrayList<>();
        Stack<TreeNode>st=new Stack<>();
        TreeNode node=root;
        while (true){
            if(node!=null){
                st.push(node);
                node=node.left;

            }
            else {
                if (st.isEmpty()){
                    break;
                }
                node=st.pop();
                l3.add(node.val);
                node=node.right;

            }
        }
         return l3;


    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.left.right.left = new TreeNode(6);
        root.left.right.right = new TreeNode(7);
        List<Integer>Result2=inorder(root);
        System.out.println(Result2);
    }
}
