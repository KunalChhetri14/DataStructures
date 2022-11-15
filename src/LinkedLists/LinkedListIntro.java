package LinkedLists;

class Node {
    int data;
    Node next;
}

public class LinkedListIntro {
    Node head;
    public static void main(String [] args) {
        System.out.println("sdfljk");
        LinkedListIntro li = new LinkedListIntro();
        li.insertItem(10);
        li.insertItem(20);
        li.insertItem(30);
        li.displayValues();

        LinkedListIntro li2 = new LinkedListIntro();
        li2.insertItem(10);
        li2.insertItem(20);
        li2.insertItem(30);
        li2.displayValues();
    }

    public void insertItem(int no) {
        Node newNode = new Node();
        newNode.data = no;
        if(head == null) {
            head = newNode;
            return;
        }
        Node currentNode = head;
        while(currentNode.next != null ) {
            currentNode = currentNode.next;
        }
        currentNode.next = newNode;
    }

    public void displayValues() {
        Node presentNode = head;
        while(presentNode != null) {
            System.out.println(presentNode.data);
            presentNode = presentNode.next;
        }
    }
}
