package ArrayList.SortingAlgorithms;

public class BubbleSort {

  public int[] bubbleSort(int [] nos) {

    for(int i=0; i< nos.length; i++) {
      for(int j=1; j<nos.length - i; j++) {
        if(nos[j] < nos[j-1]) {
          nos[j] = nos[j] + nos[j-1];
          nos[j-1] = nos[j] - nos[j-1];
          nos[j] = nos[j] - nos[j-1];
        }
      }
    }

    return nos;

  }

  public static void main(String args[]) {

    int arr[] = new int[] {4,2,5,63,2,3,1};

    BubbleSort bs = new BubbleSort();
    int [] arrSort = bs.bubbleSort(arr);
    System.out.println(arrSort.toString());
  }

}
