package Queue;
import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueue1 {

  public static void main(String args[]) {

    PriorityQueue<Integer> priorityQueue = new java.util.PriorityQueue<>();
    priorityQueue.add(10);
    priorityQueue.add(40);
    priorityQueue.add(2);
    priorityQueue.add(30);
    priorityQueue.add(11);

    Iterator<Integer> itr = priorityQueue.iterator();
    priorityQueue.remove();
    String k = "Kunal";
    System.out.println("substring:"+ k.substring(0,k.length()-1) + ".....");
    System.out.println(k.indexOf("un"));
    while(itr.hasNext()) {
      System.out.println(itr.next());
    }

  }

}
