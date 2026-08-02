import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Btlot102 {
    public static void main(String[] args) {
        Node root = new Node(3);
        root.left = new Node(9);
        root.right = new Node(20);

        root.right.left= new Node(15);
        root.right.right= new Node(7);

        List<List<Integer>> result = levelOrder(root);
        System.out.println(result);
    }

    public static List<List<Integer>> levelOrder(Node root){
        List<List<Integer>> result = new ArrayList<>();
        if (root==null)
            return result;
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty())
        {
            int levelSize = queue.size();
            List<Integer> currLevel = new ArrayList<>(levelSize);
            for (int i = 0; i < levelSize; i++) {
                Node currNode = queue.poll();
                currLevel.add(currNode.val);
                if (currNode.left!=null)
                {
                    queue.offer(currNode.left);
                }
                if (currNode.right!=null)
                {
                    queue.offer(currNode.right);
                }
            }
            result.add(currLevel);
        }

        return result;
    }
}


