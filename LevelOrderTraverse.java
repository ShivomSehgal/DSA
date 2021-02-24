import java.util.*;
public class LevelOrderTraverse {
    static Node root;

   static class Node {
        int value;
        Node left, right;

        public Node(int value) {
            this.value = value;
        }
    }

   
    static ArrayList <Integer> levelOrder(Node root) 
    {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(root);
        while (!queue.isEmpty()) {
            Node current = queue.poll();
            arr.add(current.value);
            if (current.left != null) {
                queue.add(current.left);
            }
            if (current.right != null) {
                queue.add(current.right);
            }
        }
        return arr;
    }

   

}
