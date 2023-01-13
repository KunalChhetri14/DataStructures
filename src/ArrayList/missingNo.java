package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ListIterator;

public class missingNo {

  static int missingNo(int[] arr) {
    ArrayList<Integer> ar1 = new ArrayList<Integer>();
    for(int i=0; i< arr.length; i++) {
      ar1.add(arr[i]);
    }
    ListIterator<Integer> iter = ar1.listIterator();
    ListIterator<Integer> iternext = ar1.listIterator();
    int result = -1;
    iternext.next();
    while(iternext.hasNext()) {
      int current = iternext.next();
      int previous = iter.next();
      if(current != previous + 1) {
        result = previous + 1;
      }
    }
    return result;
  }

  public static void main(String args[]) {
    int arr[] = {4,5,6,7,8,10};
    System.out.println("No is :  " + missingNo(arr));

  }

}
