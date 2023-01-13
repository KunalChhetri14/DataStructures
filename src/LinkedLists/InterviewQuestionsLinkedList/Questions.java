package LinkedLists.InterviewQuestionsLinkedList;

import java.util.HashMap;
public class Questions {

  // TODO

  public static void main(String args[]) {

    LinkedList ls = new LinkedList();
    ls.create(1);
    ls.insert(2);
    ls.insert(1);
    ls.insert(3);
    ls.insert(6);
    ls.insert(6);
    ls.insert(4);

    Questions q = new Questions();

    int no=q.removeDups(ls.head);
    ls.size = ls.size - no;
    ls.traverseLL();
  }

  public int removeDups(NodeLL head) {
    int noOfDeletedItems = 0;
    HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>();
    NodeLL tempNode = head;
    NodeLL prevNode = null;
    while(tempNode!=null) {
      int data = tempNode.data;
      if(hmap.containsKey(data)) {
        prevNode.next=tempNode.next;
        noOfDeletedItems++;
      } else {
        hmap.put(data, 1);
        prevNode = tempNode;
      }
      tempNode = tempNode.next;
    }
    return noOfDeletedItems;
  }




}

