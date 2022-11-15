package LinkedLists;

import java.util.HashMap;
import java.util.Map;

public class questions {
    public static void main(String [] args) {

        String name = "AABBBCCCDD";
        char  c[]= name.toCharArray();
//        System.out.println(name.toCharArray());
        String result="";
        Map<String, Integer> hashMap = new HashMap<String, Integer>();
        for(int i=0; i<c.length; i++) {
//            System.out.println("no: " + c[i]);
            if(hashMap.containsKey(c[i])) {
                Integer value = hashMap.get(c[i]);
                hashMap.put(String.valueOf(c[i]), value +1);
            } else {
                hashMap.put(String.valueOf(c[i]), 1);
                if(i != 0) {
                    result = result + hashMap.get(c[i-1]) + c[i-1];
                }
            }
        }

        System.out.println(result);

    }
}
