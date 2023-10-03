package Binary_trees_Completed;

import java.util.Scanner;

public class Pre_Order_Transversal {
    static Scanner sc=null;
     static Node createTree() {

        Node root = null;
        System.out.println("Enter data: ");
        int data = sc.nextInt();

        if(data == -1) {return null;}

        root = new Node(data);

        System.out.println("Enter left for " + data);
        root.left = createTree();

        System.out.println("Enter right for "+ data);
        root.right = createTree();

        return root;
    }
    static  void  preorder(Node root){
        if (root==null){
            return;
        }
        System.out.println(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void main(String[] args) {
        sc=new Scanner(System.in);
        Node root=createTree();
        System.out.println();
        preorder(root);

    }


}
// class Node{
//    Node left,right;
//    int  data;
//    public  Node(int data){
//        this.data=data;
//    }
//}
