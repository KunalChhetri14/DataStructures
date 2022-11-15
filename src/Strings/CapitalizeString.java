package Strings;

public class CapitalizeString {

  public static void main(String args[]) {
    System.out.println(capitalizeString("kunal Chhetri"));
  }

  public static String capitalizeString(String str) {
    if(str.length() == 0) {
      return "";
    }
//    System.out.println("Char: " + str.charAt(0));
    return Character.toUpperCase(str.charAt(0)) + capitalizeString(str.substring(1));
  }

}
