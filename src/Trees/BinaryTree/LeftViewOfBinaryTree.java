package Trees.BinaryTree;


import Hashmap.Hashmap;
import sun.reflect.generics.tree.Tree;

import java.util.*;

class TreeNode {
  int val;
  TreeNode left;
  TreeNode right;
  LinkedHashMap<Integer, ArrayList<Integer>> hmap = new LinkedHashMap<>();

  TreeNode(int val) {
    this.val = val;
    this.left = null;
    this.right = null;
  }

  void treeTraversalPreOrder(TreeNode node) {
    if(node == null) {
      return;
    }
    System.out.println(node.val);
    treeTraversalPreOrder(node.left);
    treeTraversalPreOrder(node.right);

  }


}

public class LeftViewOfBinaryTree {

  HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>();

  public void levelOrderTraversal(TreeNode node)  {

    LinkedList<TreeNode> queue = new LinkedList<>();
    if(node == null) {
      return;
    }
    queue.add(node);
//    queue.addFirst(node);

    while(!queue.isEmpty()) {
      TreeNode removedNode = queue.remove();
      System.out.println(removedNode.val + "  -->  ");

      if(removedNode.left != null) {
        queue.add(removedNode.left);
      }
      if(removedNode.right != null) {
        queue.add(removedNode.right);
      }
      int i=10;

    }

  }

  public void printLeftView(TreeNode node, int level) {
    if(node == null) {
      return;
    }

    if(!hmap.containsKey(level)) {
      System.out.print(node.val + " - > ");
      hmap.put(level ,1);
    }

    printLeftView(node.left, level+1);
    printLeftView(node.right, level+1);
  }

  public static void main(String args[]) {

//        1
//    2           3
//  10   5        6
//        4     7
//              8
    LeftViewOfBinaryTree tree = new LeftViewOfBinaryTree();
    TreeNode root = new TreeNode(1);
    TreeNode left = new TreeNode(2);
    TreeNode right = new TreeNode(3);
    root.left = left;
    root.right = right;
    left = new TreeNode(4);
    right = new TreeNode(5);
    root.left.left = new TreeNode(10);
    root.left.right = right;
    root.left.right.left = left;

    //for right
    root.right.left = new TreeNode(6);
    root.right.left.left = new TreeNode(7);
    root.right.left.left.left = new TreeNode(8);
    root.treeTraversalPreOrder(root);

    System.out.println("Left View ......");
    tree.printLeftView(root, 0);
    System.out.println("Level Order View ......");
    tree.levelOrderTraversal(root);
  }
}
