package Basic;

public class SumOfDigits {

  public static void main(String args[]) {
    int sum = findSum(5467);
    System.out.println(sum);
  }

  public static int findSum(int n) {
    if(n < 1) {
      return 0;
    }
    int rem = n % 10;
    int no = n/10;
    return rem + findSum(no);
  }

}
