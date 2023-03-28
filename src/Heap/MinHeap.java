package Heap;

import sun.reflect.generics.tree.Tree;

class NodeTree {

  int data;
  NodeTree leftTree;
  NodeTree rightTree;

}

public class MinHeap {

  public NodeTree minHeap(int[] arr) {

    NodeTree head = null;
    int i=0;
    while(arr.length > 0) {
      if(head == null) {
        head = new NodeTree();
        head.rightTree= null;
        head.leftTree = null;
        head.data = arr[i];
      } else {
        NodeTree traverseNode = head;
        while(traverseNode!= null) {
          if(traverseNode.data <= arr[i]) {

          }
        }
      }

    }

    return head;
  }

}
