package LinkedLists.InterviewQuestionsLinkedList;

public class LinkedList {

  public NodeLL head;
  public NodeLL tail;
  public int size;

  public void create(int nodeValue) {

    NodeLL newNode = new NodeLL();
    newNode.data = nodeValue;
    newNode.next = null;

    head = newNode;
    tail = newNode;
    size = 1;
  }

  public void insert(int nodeValue) {

    NodeLL newNode = new NodeLL();
    newNode.data = nodeValue;
    newNode.next = null;

    NodeLL temp = head;
    tail.next = newNode;
    tail = newNode;
    size++;

  }

  public void reverseLinkedList() {
    NodeLL tempNode = head;
    NodeLL nextNode = null;
    NodeLL prevNode = null;
    tail = tempNode;
    while(tempNode.next != null) {
      nextNode = tempNode.next;
      tempNode.next = prevNode;
      prevNode = tempNode;
      tempNode = nextNode;
    }
    tempNode.next = prevNode;
    head = tempNode;
  }

  public void traverseLL() {
    NodeLL tempNode = head;
    for(int i=0; i< size; i++) {
      System.out.print(tempNode.data);
      if(i != size-1) {
        System.out.print(" -> ");
      }
      tempNode = tempNode.next;
    }

  }

}
