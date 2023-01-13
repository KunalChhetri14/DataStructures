package InterviewFolder;

import java.util.ArrayList;
import java.util.HashMap;

public class DupllicateElements {


//  O/P

//{1,2,3}

  public static void main(String args[]) {

    int[] arr = {1,2,3,3,2,1,5,7,1,1,1,2,1};
    ArrayList<Integer> resultArr = new ArrayList<Integer>();

    HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>();


    //n times
    for(int i=0; i< arr.length; i++) {
      int currentValue = arr[i];
      if(hmap.containsKey(currentValue)) { //1
        if(hmap.get(currentValue) == 1) { //1
          resultArr.add(currentValue);
          hmap.put(currentValue, 2);
        }
      }  else {
        hmap.put(currentValue, 1);
      }

    }

    System.out.println("The final array is : ");
    for(int i: resultArr) {
      System.out.println(i);
    }

  }


}
