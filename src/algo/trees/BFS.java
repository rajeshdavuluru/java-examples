package algo.trees;

import java.util.LinkedList;
import java.util.Queue;

public class BFS {

    static Node root;

    public BFS() {
        root = new Node(10);
    }

    public static void main(String[] x) {
        System.out.println("BFS");
        BFS bfs = new BFS();

        root.left = new Node(11);
        root.right = new Node(9);

        root.left.left = new Node(7);

        root.right.left = new Node(15);
        root.right.right = new Node(8);

        bfs.display(root);
        bfs.insert(root, 12);
        bfs.display(root);
        bfs.delete(root, 12);

    }

    public void display(Node node) {
        if (node != null) {

            Queue<Node> q = new LinkedList<Node>();
            q.add(node);

            while (!q.isEmpty()) {
                Node node1 = q.peek();
                System.out.print(node1.data + " ");
                q.remove();

                if (node1.left != null) {
                    q.add(node1.left);
                }

                if (node1.right != null)
                    q.add(node1.right);

            }
        }
    }

    public void insert(Node node, int data) {
        Queue<Node> q = new LinkedList<Node>();
        q.add(node);

        while (!q.isEmpty()) {
            node = q.peek();
            q.remove();

            if (node.left == null) {
                node.left = new Node(data);
                break;
            } else {
                q.add(node.left);
            }

            if (node.right == null) {
                node.right = new Node(data);
                break;
            } else {
                q.add(node.right);
            }
        }
    }

    public void delete(Node node, int data) {

        Node lastNode = node;
        Node nodeRemove = null;
        if (node != null) {
            Queue<Node> q = new LinkedList<Node>();
            q.add(node);
            int count=0;

            while (!q.isEmpty()) {

                Node node1 = q.peek();

                q.remove();

                if(node1.data == data)
                    nodeRemove = node1;

                if (node1.left != null) {
                    q.add(node1.left);
                    lastNode = node1.left;
                    count++;
                }

                if (node1.right != null){
                    q.add(node1.right);
                    lastNode = node1.right;
                    count++;
                }

               /* if(q.size() == 1){
                    System.out.println("111111"+node1.right);
                    if(node1.right != null  )
                        node1.right = null;
                    else if(node1.right == null && node1.left != null)
                        node1.left = null;
                }*/


            }

        }

        System.out.println(lastNode);
        nodeRemove.data  = lastNode.data;
        System.out.println("------------");
        display(node);

    }
}
