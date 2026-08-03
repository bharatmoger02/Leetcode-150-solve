import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BtRightSideView {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left= new Node(2);
        root.right= new Node(3);
        root.left.left= new Node(4);
        root.left.right= new Node(5);
        root.right.left= new Node(6);
        root.right.right= new Node(7);
        List<Integer> rsv = rightSideView(root);
        System.out.println(rsv);
    }

    public static List<Integer> rightSideView(Node root){
        List<Integer> rhs = new ArrayList<>();
        if(root==null)
            return rhs;
        Queue<Node> queue =new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty())
        {
            int qsize = queue.size();
            ArrayList<Integer> arr = new ArrayList<>(qsize);
            for (int i = 0; i < qsize; i++) {
                Node node = queue.poll();
                arr.add(node.val);
                if(node.left!=null)
                    queue.offer(node.left);
                if(node.right!=null)
                    queue.offer(node.right);
            }
            rhs.add(arr.get(qsize-1));
        }
        return rhs;
    }
}
