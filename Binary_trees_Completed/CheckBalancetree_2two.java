package Binary_trees_Completed;
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}


public class CheckBalancetree_2two {
    public  static  boolean check(TreeNode root){
        TreeNode node=root;
        if (node==null){
            return true;

        }
        int lh = findHeight(node.left);
        int rh = findHeight(node.right);

        if (Math.abs(rh - lh) > 1) {
            return false;
        }
        boolean left = check(node.left);
        boolean right = check(node.right);

        if (!left || !right) {
            return false;
        }

        return true;
    }
    public static int findHeight(TreeNode node) {
        if (node == null) {
            return 0;
        }

        int leftHeight = findHeight(node.left);
        int rightHeight = findHeight(node.right);

        return Math.max(leftHeight, rightHeight) + 1;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
//        root.left.left = new TreeNode(4);
        root.right.right = new TreeNode(5);
        root.right.right.left = new TreeNode(6);
//        root.left.right.right = new TreeNode(7);

        boolean isBalance=check(root);
        System.out.println(isBalance);
    }
}
