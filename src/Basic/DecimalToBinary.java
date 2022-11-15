package Basic;

public class DecimalToBinary {

  public static void main(String args[]) {
    String result = findBinary(20);
    StringBuilder newResult = new StringBuilder();
    newResult.append(result);
    System.out.print(newResult.reverse());
  }

  public static int reverse(int n) {
    if(n<=0) {
      return 0;
    }
    int rem = n%10;
    n = n/10;
    return rem*10 + reverse(n);
  }

  public static String findBinary(int n) {
    if(n == 0) {
      return "";
    }
    String rem = "" + n%2;
    return rem + findBinary(n/2);
  }

}
