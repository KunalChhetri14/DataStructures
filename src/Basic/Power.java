package Basic;

public class Power {
  public static void main(String args[]) {
    int powerResult = findPower(7, 5);
    System.out.println(powerResult);
  }

  public static int findPower(int base, int exp) {
    if(exp == 0) {
      return 1;
    }
    return base * findPower(base,exp-1);
  }
}
