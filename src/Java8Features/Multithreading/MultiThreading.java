package Java8Features.Multithreading;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

@FunctionalInterface

interface  FunctionInterf1 {
  public void m1();
}

@FunctionalInterface
interface  FunctionInterf2 extends FunctionInterf1{
  public void m1();
}

public class MultiThreading {


  public static void main(String args[]) {
    Runnable rn = () -> {
      for(int i=0; i< 100; i++) {
        System.out.println("Runnabe thread:: "+i);
      }
    };
    Thread td = new Thread(rn);
    td.start();

    FunctionInterf1  fn= () -> System.out.println("Inside fn1 of m1");
    FunctionInterf2 fn2 = () -> System.out.println("Inside fn2 of m2");

    fn.m1();
    fn2.m1();

    for(int i=0;i<100; i++) {
      System.out.println("Main Thread:: "+i);
    }


    ArrayList<HashMap<String, Integer>> ar = new ArrayList<>();
    HashMap<String, Integer> hmap = new HashMap<>();
    hmap.put("Kunal",25);
    hmap.put("Kajal", 24);
    hmap.put("Rubel", 21);
    hmap.put("Anu", 46);
    hmap.put("Tara", 32);

//    Collections.sort(ar, new Comparator<HashMap<String, Integer>>() {
//      @Override
//      public int compare(HashMap<String, Integer> o1, HashMap<String, Integer> o2) {
//        Integer no = o1.values().
//        Integer no2 = o2.values();
//      }
//    });
  }

}
