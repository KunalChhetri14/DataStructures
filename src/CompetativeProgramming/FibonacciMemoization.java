package CompetativeProgramming;

public class FibonacciMemoization {

  public int findFib(int n) {
    if (n <= 1)
      return n;
    return findFib(n - 1) + findFib(n - 2);
//    if(n<=1) {
//      return n;
//    } else {
//      return findFib(n-1) + findFib(n-2);
//    }
  }

  public int findFibMem(int n, int mem[]) {
    if(n <= 1) {
      return n;
    } else {
      if(mem[n] == 0) {
        mem[n] = findFibMem(n-1, mem) + findFibMem(n-2, mem);
      }
    }
    return mem[n];
  }

  public static void main(String args[]) {
    FibonacciMemoization fb = new FibonacciMemoization();

    int[] arr = new int[10];
    System.out.println("Memo fib:: "+ fb.findFibMem(9, arr));
  }
}
