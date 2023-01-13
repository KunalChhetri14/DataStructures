package LinkedLists.InterviewQuestionsLinkedList;

public class ReverseLinkedLists {

  public void reverseLinkedList() {

  }

  public static void main(String args[]) {
    LinkedList ll = new LinkedList();
    ll.create(3);
    ll.insert(4);
    ll.insert(5);
    ll.insert(6);
    ll.insert(7);
    ll.insert(8);
    ll.traverseLL();

    ll.reverseLinkedList();
    System.out.println("Reverse List is : ");
    ll.traverseLL();
  }

}
