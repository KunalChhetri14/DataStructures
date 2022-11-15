package Arrays;

import java.util.Scanner;

public class CreateArray {

  public static void main(String args[]) {
    Scanner cosole = new Scanner(System.in);
    int[] arr;
    arr = new int[10];
    for(int i=0; i< arr.length; i++) {
      System.out.println("Enter the no:");
      arr[i]= cosole.nextInt();
    }

    System.out.println("The length is: " +arr.length);

    for(int i=0; i< arr.length; i++) {
      System.out.println(arr[i]);
    }

  }

}
