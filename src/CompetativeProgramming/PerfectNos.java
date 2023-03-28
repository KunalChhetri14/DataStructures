package CompetativeProgramming;

public class PerfectNos {

  public int squares(int n, int mem[]) {
    if(n<4) {
      return n;
    }
    int min = 0;
    if (mem[n] != 0) {
      return mem[n];
    }
    for(int i=2; i*i<=n; i++) {
      int sq = i*i;
      mem[n] = Math.min(n, 1+squares(n-sq, mem)); //ans
    }
    return mem[n];
  }


  //4,1+3(3, 1+2(2,1) => 4 for i=1  ans = 4
  //4  for i=2  sq=4  1+sq(0) i.e 1+0 => 1
  //4  3

  //6

  public static void main(String args[]) {
    PerfectNos per = new PerfectNos();
    int n= 12;
    int[] mem = new int[n+1];
    System.out.println(per.squares(n, mem));
  }

}

//
//5
//for(int i=2; i<n)
//min(5, 1+)
