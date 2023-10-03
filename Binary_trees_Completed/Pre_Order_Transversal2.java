package Binary_trees_Completed;

import java.util.Scanner;

public class Pre_Order_Transversal2 {
    Scanner sc; // Instance variable to hold the Scanner object

    public Node createTree() {
        sc = new Scanner(System.in); // Initialize the Scanner object here
        return createNode();
    }

    private Node createNode() {
        Node root = null;
        System.out.println("Enter data: ");
        int data = sc.nextInt();

        if (data == -1) {
            return null;
        }

        root = new Node(data);

        System.out.println("Enter left for " + data);
        root.left = createNode();

        System.out.println("Enter right for " + data);
        root.right = createNode();

        return root;
    }

    public void preorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void main(String[] args) {
        Pre_Order_Transversal2 treeBuilder = new Pre_Order_Transversal2();
        Node root = treeBuilder.createTree();
        System.out.println();
        treeBuilder.preorder(root);
    }

    class Node {
        Node left, right;
        int data;

        public Node(int data) {
            this.data = data;
        }
    }
}
