package Binary_trees_Completed;

import java.util.List;

//class TreeNode {
//    int val;
//    TreeNode left;
//    TreeNode right;
//
//    TreeNode(int x) {
//        val = x;
//    }
//}

public class Depth_Of_Binary {
    public static  int Maxdepth(TreeNode root){
TreeNode node=root;
if (node==null){
    return 0;
}
int lh=Maxdepth(root.left);
int rh=Maxdepth(root.right);

return 1+Math.max(lh,rh);


    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.left.right.left = new TreeNode(6);
        root.left.right.right = new TreeNode(7);
         int Result=Maxdepth(root);
        System.out.println(Result);

    }
}
