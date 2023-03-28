package InterviewQuestions;

public class MinimumCandiesDistribution {

  public int candy(int[] ratings) {
    int[] candies = new int[ratings.length];

    for(int i=0; i<ratings.length; i++) {
      if(i==0) {
        candies[i] = 1;
      } else {
        if(ratings[i-1] < ratings[i]) {
          candies[i] = candies[i-1]+1;
        } else if(ratings[i-1]>ratings[i]) {
          System.out.println("Inside else: index "+ i + " , prevraings: "+ ratings[i-1] +"ratings: "+ratings[i]+ " ,candies: "+candies[i]);
          int prevValue = candies[i-1];
          candies[i]= 1;
          if(prevValue == 1) {
            candies = reshuffleCandy(ratings, candies, i-1);
          }
        } else {
//          System.out.println("candies prev : "+candies[i] + "  candies pre: "+candies[i-1]);
          candies[i] = 1;
        }
      }
    }

    int count = 0;

    for(int j=0; j<ratings.length; j++) {
      count += candies[j];
    }
    return count;
  }

  public int[] reshuffleCandy(int[] ratings, int[] candies, int index) {

    if(index < 0) {
      return candies;
    }
    System.out.println("Inside resfugg: index "+ index + " , ratings: "+ratings[index]+ " ,candies: "+candies[index]);

    candies[index] = candies[index]+1;
    // if(ratings[index] == ratings[index+1]) {
    //     candies[index] = candies[index+1];
    // } else {
    //     candies[index] = candies[index]+1;
    // }
    if(index > 0 && ratings[index-1] > ratings[index]) {
      candies = reshuffleCandy(ratings, candies, index-1);
    }
    return candies;
  }


  public static void main(String args[]) {

    int[] arr= {1,3,2,2,1};
    MinimumCandiesDistribution obj = new MinimumCandiesDistribution();
    int res = obj.candy(arr);
    System.out.print(res);

  }


}
