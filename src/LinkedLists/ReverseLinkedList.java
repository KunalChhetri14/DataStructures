package LinkedLists;


public class ReverseLinkedList {

  public ListNode reverseListRecursion(ListNode head) {
//    System.out.println("Data is "+ head.val +  "  ,,,"+head.next);
    if(head.next == null) {
      return head;
    }
    ListNode nextNode = head.next;
    ListNode headNode = reverseListRecursion(head.next);
    head.next = null;
    if(headNode.next == null) {
      headNode.next = head;
    } else {
      nextNode.next = head;
    }
    // headNode.next = head;
    return headNode;
  }


  public static void main(String args[]) {

    ListNode head1 = new ListNode(1);
    ListNode temp1 = head1;
    temp1.next = new ListNode(2);
    temp1 = temp1.next;
    temp1.next = new ListNode(4);
    temp1 = temp1.next;
    temp1.next = new ListNode(5);
    new ListNode().traverseLL(head1);

    ReverseLinkedList reverseLinkedList = new ReverseLinkedList();
    ListNode revHead = reverseLinkedList.reverseListRecursion(head1);

    new ListNode().traverseLL(revHead);


  }


}
