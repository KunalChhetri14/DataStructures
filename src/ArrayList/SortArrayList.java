package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class SortArrayList {

  public void sortArrayListAscending(ArrayList<Integer> arrayList) {

    Collections.sort(arrayList);
    String sorted = "";
    for(int i=0; i< arrayList.size(); i++) {
        sorted = sorted + arrayList.get(i);
    }

    System.out.println(sorted);
  }


  public static void main(String args[]) {

    ArrayList<Integer> arrList = new ArrayList<Integer>();
    arrList.add(40);
    arrList.add(60);
    arrList.add(20);
    arrList.add(25);
    arrList.add(11);



  }

}
