package InterviewQuestions;

public class TowerOfHanoi {

//  1, A,B,C      1, B,C,A        1, C,A,B          1, A,B,C
//        2, A,C,B                        2, C,B,A
//                        3, A,B,C



  public void printTower(int n, String a, String b, String c) {
    if(n==0) {
      return;
    }
    printTower(n-1, a, c, b );
    System.out.println(n + " [" + a + " -> "+ b);
    printTower(n-1, c, b, a);
  }

  public static void main(String args[]) {

    TowerOfHanoi th = new TowerOfHanoi();
    th.printTower(3, "A", "B", "C");

  }
}
