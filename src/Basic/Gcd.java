package Basic;

//Greatest Common Divisor
public class Gcd {

  public static void main(String args[]) {
    int gcd = findGCD(125, 75);
    System.out.println("The gcd is " + gcd);
  }

  public static int findGCD(int n1, int n2) {
    if(n2 == 0) {
      return n1;
    }
    int rem = n1 % n2;
    return findGCD(n2, rem);
  }
}
