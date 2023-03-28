package Heap;

import java.util.*;

public class kthFrequentElement {

  public List<Integer> topKFrequent(int[] arr, int k) {
    Map<Integer, Integer> hmap = new HashMap<>();
    for(int i=0; i< arr.length; i++) {
      int count = hmap.getOrDefault(arr[i], 0);
      hmap.put(arr[i], count+1);
    }

    PriorityQueue<Map.Entry<Integer, Integer>> minHeap = new PriorityQueue<Map.Entry<Integer, Integer>>(new Comparator<Map.Entry<Integer, Integer>>() {
      @Override
      public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
        if(o1.getValue() < o2.getValue()) {
          return -1;
        } else return 1;
      }
    });

    for(Map.Entry<Integer, Integer> entry: hmap.entrySet()) {
      minHeap.add(entry);
      if(minHeap.size() > k) {
        minHeap.poll();
      }
    }

    List<Integer> freq = new ArrayList<>();
    while(!minHeap.isEmpty()) {
      freq.add(minHeap.poll().getKey());
    }
    return freq;
  }

  public static void main(String args[]) {
    int[] arr= {1,1,1,2,4,4,4,4,4,2,3,3,3};
    int k=2;
    kthFrequentElement kth = new kthFrequentElement();
    kth.topKFrequent(arr, 2);
  }
}
