import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class AvgOfLvls
{
    public static void main(String[] args) {
        Node root = new Node(3);
        root.left = new Node(9);
        root.right = new Node(20);
        root.left.left = new Node(15);
        root.left.right = new Node(7);

        List<Double> avgLvlArr = averageOfLevels(root);
        System.out.println(avgLvlArr);
    }

    public static List<Double> averageOfLevels(Node root)
    {
        List<Double> avgLvlArr = new ArrayList<>();
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty())
        {
            int qLvl = queue.size();
            double avgLvl = 0;

            for (int i = 0; i < qLvl; i++) {
                Node node = queue.poll();
                avgLvl+=node.val;
                if(node.left!=null)
                {
                    queue.offer(node.left);
                }
                if(node.right!=null)
                {
                    queue.offer(node.right);
                }
            }
            avgLvl/=qLvl;
            avgLvlArr.add(avgLvl);
        }
        return avgLvlArr;
    }
}



 class Node
 {
     int val;
     Node left;
     Node right;
     Node() {}
     Node(int val) { this.val = val; }
     Node(int val, Node left, Node right) {
     this.val = val;
     this.left = left;
     this.right = right;
     }
}