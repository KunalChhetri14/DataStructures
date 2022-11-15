package Basic;

public class FirstUpperCase {

//  Input : appmillerS
//  Output : S
  public static void main(String args[]) {
    Character result = firstUpper("kunal chhetri", 0);
    if(result == 0) {
      System.out.println("No capital letter found");
      return;
    }
    System.out.println("First capital letter is " + result);
  }

  public static char firstUpper(String str, int i) {
    if(i > str.length()-1) {
      return 0;
    }
    Character c = str.charAt(i);
    if(Character.isUpperCase(c)) {
      return c;
    } else {
      return firstUpper(str, i+1);
    }
  }
}
