package Comparable;

public class ComparableImp implements  Comparable<ComparableImp>{

  public int marks;
  public String name;

  public static void main(String args[]) {
    ComparableImp s1 = new ComparableImp();
    s1.marks = 30;
    s1.name = "Kunal";
    ComparableImp s2 = new ComparableImp();
    s2.marks = 20;
    s2.name = "Kunal";
    int result = s1.compareTo(s2);
    if(result == 1) {
      System.out.println("S1 marks is greater");
    } else {
      System.out.println("S2 marks is greater");
    }

  }

  @Override
  public int compareTo(ComparableImp o) {
    if(marks > o.marks) {
      return 1;
    } else return -1;
  }
}
