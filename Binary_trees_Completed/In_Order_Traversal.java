package Binary_trees_Completed;

import java.util.Scanner;

public class In_Order_Traversal {
    static Scanner sc=null;
    static  Node CreateTree(){
        Node root=null;
        System.out.println("Enter the Data:");
        int data=sc.nextInt();
        if (data==-1){
            return  null;
        }
        root = new   Node(data);
        System.out.println("Enter the data for Left"+data);
        root.left=CreateTree();
        System.out.println("Enter the data for Right"+data);
        root.right=CreateTree();
        return  root;
    }
    static  void  Inorder(Node root){
        if (root==null){
            return;
        }
        Inorder(root.left);
        System.out.println(root.data+" ");
        Inorder(root.right);
    }


    public static void main(String[] args) {
        sc=new Scanner(System.in);
        Node root=CreateTree();
        System.out.println();
        Inorder(root);

    }
}
//class  Node{
//    Node left, right;
//    int data;
//
//    public Node(int data) {
//
//
//        this.data = data;
//    }
//}