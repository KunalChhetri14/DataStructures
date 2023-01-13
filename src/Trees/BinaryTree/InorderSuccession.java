package Trees.BinaryTree;

import java.util.PriorityQueue;
import java.util.Queue;

public class InorderSuccession {

  public TreeNode Inorder(TreeNode root, TreeNode i) {

    Queue<TreeNode> queue = new PriorityQueue<TreeNode>();
    TreeNode foundNode = null;
    while(root!= null) {

      if(root.val == i.val) {
        break;
      }

      if(root.val > i.val) {
        root = root.left;
      } else {
        root = root.right;
      }
      queue.add(root);
    }

    if(root.right != null) {
      foundNode = root.right;
      root = root.right;
      while (root != null) {
        foundNode = root;
        if (root.left != null) {
          root = root.left;
        } else {
          root = root.right;
        }
      }
    }
    if(foundNode == null) {
        while(!queue.isEmpty()) {
          TreeNode removed = queue.remove();
          if(removed.val > i.val) {
            foundNode = removed;
          }
        }
    }

    return foundNode;

    }




  public static void main(String args[]) {

    InorderSuccession tree = new InorderSuccession();
    TreeNode root = new TreeNode(20);
    TreeNode left = new TreeNode(9);

    TreeNode right = new TreeNode(25);
    root.left = left;
    root.right = right;
    left = new TreeNode(11);
    right = new TreeNode(12);
    root.left.left = new TreeNode(5);
    root.left.right = right;
    root.left.right.left = left;
    root.left.right.right = new TreeNode(14);

    TreeNode find = root.left.right.right;

    TreeNode result = tree.Inorder(root, find);
    System.out.println("The result is :  "+ result.val);


  }
}
