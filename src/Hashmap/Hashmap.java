package Hashmap;

import java.util.*;

public class Hashmap<I extends Number, I1 extends Number> {
  public static int[] removeDuplicates(int[] arr) {
    //   TODO
    HashMap<Integer, String> hmap = new HashMap<Integer, String>();
    for (int i = 0; i < arr.length; i++) {
      hmap.put(arr[i], "0");
    }

    int[] arr11 = {1, 2, 4, 5, 6};

    List<int[]> al = Arrays.asList(arr11);

    Collections.sort(al, new Comparator<int[]>() {
      @Override
      public int compare(int[] o1, int[] o2) {
        return 0;
      }
    });

    int[] result = new int[arr.length];

    Iterator<Map.Entry<Integer, String>> itr = hmap.entrySet().iterator();
    int i = 0;
    while (itr.hasNext()) {
//      result[i] = Integer.parseInt(itr.next());
      i++;
    }

    return result;

  }
}

