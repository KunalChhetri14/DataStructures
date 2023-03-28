package Heap;

import java.util.*;

public class kthLargestElement {

  public static Integer[] kLargest(int[] arr, int k) {
    PriorityQueue<Integer> pq = new PriorityQueue<Integer>();

    for(int i=0; i< arr.length; i++) {
      pq.add(arr[i]);
      if(pq.size() > k) {
        pq.remove();
      }
    }


    return pq.toArray(new Integer[pq.size()]);


//  public static void insertObj(HashMap<Integer, Integer>) {

//    PriorityQueue<HashMap<Integer, Integer>> priorityQueue = new PriorityQueue<>()

  }

  public static void main(String args[]) {
    int arr[] = {7,10,4,3,20,15};
    int k= 3;
    Integer ar[] = kLargest(arr, k);


    for(int i=0; i< ar.length; i++) {
      System.out.println("Element is : "+ar[i]);
    }

  }

}
