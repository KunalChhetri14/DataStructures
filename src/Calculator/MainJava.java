package Calculator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainJava {

  public static void main(String args[]) {
    String str = "2+5-6+10-8+25";
    // priority = [+,-]
    // Stack =
    int operands = 0;


    boolean hasOperator= false;
    String oper = "";
    int  n1 = 0;
    int n2 = 0;
//    List<Character> list = new ArrayList<>();
//    list.add('-');
//    list.add('+');

    Operation obj;
    Map<String, Operation> hmap = new HashMap<String, Operation>();
    hmap.put("+", new Addition());
    hmap.put("-", new Substraction());



    for(int i=0; i< str.length(); i++) {
      int num= 0;
      try {
        int dummy = Integer.parseInt(String.valueOf(str.charAt(i)));
        if(operands == 0) {
          n1 = dummy;
        } else {
          n2 = dummy;
        }
      } catch(Exception e) {
        oper = String.valueOf(str.charAt(i));
        hasOperator = true;
      }
      if(operands == 2) {
        if(hmap.containsKey(oper)) {
          int result = hmap.get(oper).getResult(n1, n2);
          n1 = result;
          n2 = 0;
          operands = 1;
          oper = "";
        }

      }
    }
  }
}
