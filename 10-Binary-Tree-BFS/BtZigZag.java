import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class BtZigZag
{
    public static void main(String[] args) {
        Node root = new Node(3);
        root.left = new Node(9);
        root.right = new Node(20);

        root.right.left= new Node(15);
        root.right.right= new Node(7);

        List<List<Integer>> result = zigZagLvlOrder(root);
        System.out.println(result);
    }
    public static List<List<Integer>> zigZagLvlOrder(Node root)
    {
        List<List<Integer>> zigZagArr = new ArrayList<>();
        if(root==null)
            return zigZagArr;
        Deque<Node> deque = new LinkedList<>();
        deque.offerFirst(root);

        boolean reverse=false;
        while(!deque.isEmpty())
        {
            int qsize= deque.size();
            ArrayList<Integer> arr = new ArrayList<>(qsize);
            for (int i = 0; i < qsize; i++) {
                if(reverse==false)
                {
                    Node node = deque.pollFirst();
                    arr.add(node.val);
                    if(node.left!=null)
                        deque.offerLast(node.left);
                    if(node.right!=null)
                        deque.offerLast(node.right);
                }
                else
                {
                    Node node = deque.pollLast();
                    arr.add(node.val);
                    if (node.right!=null)
                        deque.offerFirst(node.right);
                    if(node.left!=null)
                        deque.offerFirst(node.left);
                }
            }
            zigZagArr.add(arr);
            reverse=!reverse;
        }
        return zigZagArr;
    }
}
