package InterviewQuestions;

public class ZigZagQuestions {

//  input(1) -> (0,0)
//
//  input(2) -> (1,0),(0,0),(1,1),(0,1)
//
//  input(4) -> (3,0),(2,0),(3,1),(3,2),(2,1),(1,0),(0,0),(1,1),(2,2),(3,3),(2,3),(1,2),(0,1),(0,2),(1,3),(0,3)

  //1,0 upDiagonal->0
  //2,-1

  //upDiagonal , up, downDiagonal, right

  public void zigZag(int size) {
    int i= size-1;
    int j= 0;

    int upDiagonal = 0, up = 1, downDiagonal = 2, right = 3;
    int dir = 0;
    while(i == 0 && j == size-1) {




    }

  }

  public static void main(String args[]) {
    int size = 4;
    ZigZagQuestions obj = new ZigZagQuestions();
    obj.zigZag(4);

  }

}
