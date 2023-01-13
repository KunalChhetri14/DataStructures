package Hashmap;

import java.util.*;
import java.util.stream.Collectors;

public class LeftNumber {


  public int findLeastNumOfUniqueInts(int[] arr, int k) {
    Map<Integer, Integer> map = new HashMap<>();
    Set<Integer> set = new HashSet<>();
    int n= Arrays.stream(arr).min().getAsInt();
    for (int i : arr) map.put(i, map.getOrDefault(i, 0) + 1);
    List<Integer> list = new ArrayList<>(map.values());
    String[] str = {"e","4","3","5","7"};
//    List<String> list11 = Arrays.asList(str);

    Collections.sort(list);

    System.out.println(list.toString());

    for (int i = 0; i < list.size(); i++) {
      if(k > 0) {
        int no = list.get(i);
       if(no > 0) {
         list.set(i, no-1);

         k--;
       }
      } else {
        break;
      }
    }
    int elements = 0;
    for(int i: list) {
      if(i>0) {
        elements++;
      }
    }

    return elements;
  }

  public int findLeastNumOfUniqueInts1(int[] arr, int k) {
    HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>();
    for(int i=0; i<arr.length; i++) {
      if(hmap.containsKey(arr[i])) {
        int value = hmap.get(arr[i]);
        hmap.put(arr[i], value+1);
      } else {
        hmap.put(arr[i], 0);
      }
    }

//    ArrayList<HashMap<Integer, Integer>> arr1 = new ArrayList();
//    for(Map.Entry m: hmap.entrySet()) {
//      HashMap<Integer, Integer> hh = (HashMap<Integer, Integer>) m;
//      arr1.add(hh);
//    }
//
//    Collections.sort(arr1, new Comparator<HashMap<Integer, Integer>>() {
//      @Override
//      public int compare(HashMap<Integer, Integer> o1, HashMap<Integer, Integer> o2) {
//        int a = (int) o1.values().toArray()[0];
//        int b = (int) o2.values().toArray()[0];
//        if(a > b) {
//          return 1;
//        }
//        return -1;
//      }
//
////      @Override
////      public int compare(Map.Entry o1, Map.Entry o2) {
////        if(o1.)
////        return 0;
////      }
//    });
//
//    System.out.println("The sorted arraylist are : ");
//    for(int i=0; i< arr1.size(); i++) {
//      System.out.println(" ::" ,
//    }

    return 0;

  }

  public static void main(String args[]) {
    LeftNumber l = new LeftNumber();
    int[] params = {4,3,1,1,3,3,2};
    int result = l.findLeastNumOfUniqueInts(params, 3);
    System.out.println("The result is " + result);
  }

}
