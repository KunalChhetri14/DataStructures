//Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent.
// Return the answer in any order.
//
//  A mapping of digits to letters (just like on the telephone buttons) is given below. Note that 1 does not map to any letters.
//
//  number mapping is
//  2 = abc
//  3 = def
//  4 = ghi
//  5 = jkl
//  6 = mno
//  7 = pqrs
//  8 = tuv
//  9 = wxyz
//
//  Input: digits = "23"  //string

//NO of combinations -> length of all the mapped elements
//Size of the input string


//  Output: ["ad","ae","af","bd","be","bf","cd","ce","cf"]
//
//  Input: digits = ""
//  Output: []
//
//  Input: digits = "2"
//  Output: ["a","b","c"]


import java.util.HashMap;

public class Int1 {

  String [] arr;
  public static void main(String args[]) {

    String str = "23";
    HashMap<Character, String> hmap = new HashMap<Character, String>();
    hmap.put('2',"abc");
    hmap.put('3',"def");
    hmap.put('4',"ghi");
    hmap.put('5',"jkl");
    hmap.put('6',"mno");
    hmap.put('7',"pqrs");
    hmap.put('8',"tuv");
    hmap.put('9',"wxyz");


    int arraySize = 0;
    for(int i=0; i<str.length(); i++) {
      char mappedValues = str.charAt(i);
      String currentMapValue = hmap.get(mappedValues);
      arraySize *= currentMapValue.length();
    }

    String [] arrResult = new String[arraySize];

    for(int i=0; i<str.length(); i++) {
      char mappedValues = str.charAt(i); //gives input string char eg: 2 or 3
      String currentMapValue = hmap.get(mappedValues); //mapped values eg: abc or def
//      int strLength = str.length();
      //get currentChar and insert till size/currentMapValue.length();
      //loop from 0 to arraySize
//      for(int j=0; j<)
////      int initialIndex = 0;
////      while(initialIndex < arraySize) {
////        char presentChar = currentMapValue.charAt(initialIndex);
////        int noOfTimesToBeInserted = arraySize/str.length();
////        int insertedTimes = 0;
////        for(int j=0; j< arrResult.length; j++) {
////          arrResult[i] += pres
////        }
////      }
    }



  }
}
