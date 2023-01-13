package LinkedLists;



// Definition for singly-linked list.
  class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }

      public void traverseLL(ListNode head) {
        System.out.println("Data is ");
        while(head != null) {
          System.out.print( " -> " +head.val);
          head = head.next;
        }
        System.out.print(".........");
      }
  }


public class MergingLinkedList {

  public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

    ListNode resultTempNode = null;
    ListNode resultHead = null;

    while(list1 != null && list2 != null) {

      int no=0;
      if(list1.val <= list2.val) {
        no = list1.val;
        list1 = list1.next;
      } else {
        no = list2.val;
        list2 = list2.next;
      }

      if(resultHead == null) {
        resultHead = new ListNode(no);
        resultTempNode = resultHead;
      } else {
        resultTempNode.next = new ListNode(no);
        resultTempNode = resultTempNode.next;
      }

    }

    ListNode spareNode = list1 == null ? list2 : list1;
    System.out.println("Spare Node ......-> "+ spareNode + " ResultNode: "+resultTempNode);
    resultTempNode.next = spareNode;

    return resultHead;

  }


  public static void main(String args[]) {

    ListNode head1 = new ListNode(1);
    ListNode temp1 = head1;
    temp1.next = new ListNode(2);
    temp1 = temp1.next;
    temp1.next = new ListNode(4);


    new ListNode().traverseLL(head1);


    ListNode head2 = new ListNode(1);
    ListNode temp2 = head2;
    temp2.next = new ListNode(3);
    temp2 = temp2.next;
    temp2.next = new ListNode(4);
    new ListNode().traverseLL(head2);

    MergingLinkedList mergingLinkedList = new MergingLinkedList();
    ListNode head3 = mergingLinkedList.mergeTwoLists(head1, head2);
    new ListNode().traverseLL(head3);

  }

}
