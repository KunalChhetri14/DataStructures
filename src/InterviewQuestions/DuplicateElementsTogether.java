package InterviewQuestions;

import java.util.*;

public class DuplicateElementsTogether {


  public static void main(String args[]) {

    int a[] = { 1, 2, 3, 1, 2, 1 };

    Map<Integer, Integer> hmap = new LinkedHashMap<>();
    for(int i=0; i< a.length; i++) {
//      Integer put = hmap.put(hmap.getOrDefault(a[i], 0)+1);/
      if(hmap.containsKey(a[i])) {
        hmap.put(a[i], hmap.get(a[i])+1);
      } else {
        hmap.put(a[i], 1);
      }
    }

    int i=0;
    for(Map.Entry<Integer, Integer> mapElement: hmap.entrySet()) {
      int noTimes = mapElement.getValue();
      while(noTimes > 0) {
        a[i] = mapElement.getKey();
        i++;
        noTimes--;
      }
    }

 for(int index=0; index<a.length; index++) {
   System.out.print(" " + a[index]);
 }


  }


}
