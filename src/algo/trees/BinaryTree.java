package algo.trees;

public class BinaryTree {
    public static void main(String[] x){
        System.out.println("Binary Tree");

        Node root = new Node(1);

        root.left = new Node(2);
        root.right = new Node(3);

        BinaryTree binaryTree = new BinaryTree();
        binaryTree.display(root);

    }

    private void display(Node node){

        if(node != null){
            System.out.println(node.data);
            display(node.left);
            display(node.right);
        }
    }
}
