package Strings;

public class ReverseString {

  public static void main(String args[]) {
    System.out.println(revString("Kunal Chhetri"));
  }

  public static String revString(String str) {
    if(str.length() == 0) {
      return "";
    }
    return revString(str.substring(1)) + str.charAt(0);
  }
}
