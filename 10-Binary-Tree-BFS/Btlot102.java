import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Btlot102 {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);

        root.right.left= new TreeNode(15);
        root.right.right= new TreeNode(7);

        List<List<Integer>> result = levelOrder(root);
        System.out.println(result);
    }

    public static List<List<Integer>> levelOrder(TreeNode root){
        List<List<Integer>> result = new ArrayList<>();
        if (root==null)
            return result;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty())
        {
            int levelSize = queue.size();
            List<Integer> currLevel = new ArrayList<>(levelSize);
            for (int i = 0; i < levelSize; i++) {
                TreeNode currNode = queue.poll();
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


class TreeNode
{
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}