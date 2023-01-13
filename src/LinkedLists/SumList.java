package LinkedLists;

import LinkedLists.InterviewQuestionsLinkedList.LinkedList;
import LinkedLists.InterviewQuestionsLinkedList.NodeLL;

public class SumList {

  public LinkedList sumLists(LinkedList l1, LinkedList l2) {
    LinkedList ls = new LinkedList();
    ls.head = null;

    NodeLL temp1 = l1.head;
    NodeLL temp2 = l2.head;
    NodeLL tempNode = ls.head;

    while(temp1!=null && temp2 !=null) {
      NodeLL newNode = new NodeLL();
      newNode.data = temp1.data + temp2.data;
      if(ls.head == null) {
        ls.head = newNode;
        tempNode = newNode;
      } else {
        tempNode.next = newNode;
        tempNode = newNode;
      }
      temp1 = temp1.next;
      temp2 = temp2.next;

    }

    NodeLL nonEmptyNode = temp1 != null ? temp1 : temp2;
    tempNode.next = nonEmptyNode;
    ls.size = l1.size > l2.size ? l1.size : l2.size;

    return ls;
  }

  public static void main(String args[]) {

    SumList sm = new SumList();
    LinkedList l1 = new LinkedList();
    LinkedList l2 = new LinkedList();
    l1.create(6);
    l1.insert(1);
    l1.insert(6);
    l2.create(5);
    l2.insert(9);
    l2.insert(2);
    LinkedList ll = sm.sumLists(l1,l2);
    ll.traverseLL();
  }
}
