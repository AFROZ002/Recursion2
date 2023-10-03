//package Binary_trees_Completed;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Stack;
//
//class TreeNode {
//    int val;
//    TreeNode left;
//    TreeNode right;
//
//    TreeNode(int x) {
//        val = x;
//    }
//}
//
//public class Iterative_Postorder_Using_Single_Stack {
//    public  static  List<TreeNode>Postorder2(TreeNode root){
//        Stack<TreeNode>St1=new Stack<>();
//        List<TreeNode>L4=new ArrayList<>();
//      TreeNode cur=root;
//      while (cur!=null || !St1.isEmpty()){
//          if (cur!=null){
//              St1.push(cur);
//              cur=cur.left;
//          }
//          else {
//            TreeNode  temp=St1.peek().right;
//              if (temp==null) {
//                  temp = St1.pop();
//                  L4.add(temp);
//
//                  while (!St1.isEmpty() && temp == St1.peek().right) {
//                      temp = St1.peek();
//                      St1.pop();
//                      L4.add(temp);
//                  }
//              }
//              else {
//                  cur=temp;
//              }
//          }
//
//      }
//      return L4;
//
//    }
//    public static void main(String[] args) {
//        TreeNode root = new TreeNode(1);
//        root.left = new TreeNode(2);
//        root.right = new TreeNode(7);
//        root.right.left = new TreeNode(8);
//        root.left.left = new TreeNode(3);
//        root.left.left.right = new TreeNode(4);
//        root.left.left.right.right = new TreeNode(5);
//        root.left.left.right.right.right = new TreeNode(6);
//        List<TreeNode> Result3=Postorder2(root);
//        for (TreeNode node : Result3) {
//            System.out.print(node.val + " ");
//        }
////        System.out.println(Result3);
//
//    }
//}
