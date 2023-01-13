package LinkedLists;

import java.util.ArrayList;
import java.util.stream.Collectors;

class Node11 {
  int data;
  Node11 node;

}

public class SinglyLinkedList {

  Node11 linkedList;
  Node11 head = null;

  public void insert(int item) {
    Node11 newList = new Node11();
    newList.data = item;
    newList.node = null;

    if(head == null) {
      head = newList;
    } else {
      Node11 tempNode11 = head;
      while(tempNode11.node != null) {
//        System.out.println(" "+ tempNode11.data);
        tempNode11 = tempNode11.node;
      }
      tempNode11.node = newList;

//      System.out.println(" "+ tempNode11.data);
    }
  }

  public void delete() {
    Node11 prev = null;
    Node11 currentNode11 = head;

    if(head == null) {
      System.out.println("There is no content to delete");
    } else if(head.node == null) {
      head = null;
    } else {
      while(currentNode11.node != null) {
        prev = currentNode11;
        currentNode11 = currentNode11.node;
      }
      prev.node = null;
    }
  }

  public ArrayList<Integer> display() {
//    Node11 newList = new Node();
//    newList.data = item;
//    newList.node = null;

    ArrayList<Integer> displayList = new ArrayList<Integer>();
    Node11 tempNode11 = head;
    while(tempNode11 != null) {
      displayList.add(tempNode11.data);
      tempNode11 = tempNode11.node;
    }
    return displayList;
  }

  public static void main(String args[]) {

    SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
    singlyLinkedList.insert(5);
    singlyLinkedList.insert(10);
    singlyLinkedList.insert(15);
    singlyLinkedList.insert(20);
    singlyLinkedList.insert(25);
    singlyLinkedList.insert(30);
    singlyLinkedList.insert(35);
    singlyLinkedList.insert(40);
    ArrayList<Integer> display = singlyLinkedList.display();
    String displayString  = display.toString();
    System.out.println("Display string is " + displayString);
    singlyLinkedList.delete();
    displayString  = singlyLinkedList.display().toString();
    System.out.println("After deletion display string is " + displayString);
  }
}
