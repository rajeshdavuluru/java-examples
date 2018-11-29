package algo.trees;

import java.util.Stack;

public class DFSInorder {


    static Node root= null;

    public DFSInorder(){
        root = new Node(10);
    }

    public static void main(String[] x) {
        System.out.println("DFSInorder");
        DFSInorder dfs = new DFSInorder();

        root.left = new Node(11);
        root.right = new Node(9);

        root.left.left = new Node(7);

        root.right.left = new Node(15);
        root.right.right = new Node(8);

        dfs.display(root);
        //bfs.insert(root, 12);
       // bfs.display(root);
       // bfs.delete(root, 12);

    }

    public void display(Node node) {


            Stack<Node> s = new Stack<>();
            while(true){
                while(node != null){
                    s.add(node);
                    node = node.left;
                }
                if (s.isEmpty()) {
                    return;
                }
                node = s.pop();
                System.out.println(node.data);
                node = node.right;
            }

    }

}
