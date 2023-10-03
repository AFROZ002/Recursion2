package Binary_trees_Completed;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//class TreeNode {
//    int val;
//    TreeNode left;
//    TreeNode right;
//
//    TreeNode(int x) {
//        val = x;
//    }
//}

public class Level_Order_Traversal {
    public static List<Integer> levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<Integer> wrapList = new ArrayList<>();

        if (root == null) return wrapList;

        queue.add(root);
        while (!queue.isEmpty()) {
             TreeNode cur=queue.poll();
             wrapList.add(cur.val);
            if (cur.left != null)
                queue.add(cur.left);

            if (cur.right != null)
                queue.add(cur.right);


        }
        return wrapList;
    }

    public static void main(String[] args) {
        // Example usage
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        List<Integer> result = levelOrder(root);
        System.out.println(result); // Output: [1, 2, 3, 4, 5]
    }
}
