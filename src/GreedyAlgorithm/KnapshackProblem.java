//Given a list of n objects, say {I1, I2,……, In) and a knapsack (or bag).
//  The capacity of the knapsack is M.
//  Each object Ij has a weight wj and a profit of pj
//  If a fraction xj (where x ∈ {0...., 1)) of an object Ij is placed into a knapsack, then a profit of pjxj is earned.
//  The problem (or Objective) is to fill the knapsack (up to its maximum capacity M), maximizing the total profit earned.

package GreedyAlgorithm;

import java.util.PriorityQueue;

public class KnapshackProblem {

  public float fractionalKnapsack(int[] profits, int[] weights, int noObjects, int capacity) {

    float totalProfits = 0;
    //finding the profit by weight ratio

    float[] profitByWeight = new float[noObjects];

    for(int i=0; i< noObjects; i++) {
      profitByWeight[i] = (float)profits[i]/weights[i];
    }

//    float max = 0;
//    int maxIndex= 0;
//    for(int i=0; i< noObjects; i++) {
////      if(profitByWeight[i]>max) {
////        max= profitByWeight[i];
//////        maxIndex = i;
////      }
////      max = profitByWeight[i] > max ? profitByWeight[i] : max;
//    }

    int noWeight = noObjects;
    while(capacity > 0 && noWeight > 0) {

        float max = 0;
        int index = -1;
        noWeight--;
        for(int i=0; i<noObjects; i++) {
          if(profitByWeight[i] > max) {
            max = profitByWeight[i];
            index = i;

          }
        }

        if(max == 0) {
          break;
        }

        //full insert
        if(weights[index] <= capacity) {
          totalProfits += profits[index];
        } else {
          float remProfits = ((float) capacity / weights[index])* profits[index];
//          float leftOverProfits = float(capacity)/weights[index];
          totalProfits += remProfits;
        }
        capacity -= weights[index];
        profitByWeight[index] = 0;
    }




    return totalProfits;
  }

  public static void main(String args[]) {

    int[] profits = {10, 5, 15, 7, 6, 18, 3};
    int[] weights = { 2, 3, 5, 7, 1, 4, 1 };
    int n= 7;
    int capacity = 15;
    KnapshackProblem obj = new KnapshackProblem();
    float result = obj.fractionalKnapsack(profits, weights, n, capacity);
    System.out.println("Total profits is : "+result);
  }

}
