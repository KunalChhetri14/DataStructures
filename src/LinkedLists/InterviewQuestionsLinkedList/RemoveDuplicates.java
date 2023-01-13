package LinkedLists.InterviewQuestionsLinkedList;

import Hashmap.Hashmap;

import java.util.HashMap;
import java.util.Map;

public class RemoveDuplicates {

  public static void main(String args[]) {
    LinkedList ll = new LinkedList();
    ll.create(1);
    ll.insert(2);
    ll.insert(1);
    ll.insert(3);
    RemoveDuplicates rm = new RemoveDuplicates();
    ll.tail = rm.deleteDups(ll.head);
    ll.traverseLL();
  }

  public NodeLL deleteDups(NodeLL head) {
    NodeLL temp = head;
    NodeLL prev = null;
    HashMap<Integer, Integer> hmap = new HashMap<>();
//    Map<Integer, Integer> hmap = (Map<Integer, Integer>) new Hashmap<Integer, Integer>();
    while(temp != null) {
      if(hmap.containsKey(temp.data)) {
         prev.next = temp.next;
         temp = temp.next;
      } else {
        hmap.put(temp.data, 1);
        prev = temp;
        temp = temp.next;
      }
    }
    return prev;
  }
}
