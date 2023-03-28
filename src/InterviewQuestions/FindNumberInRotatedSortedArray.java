package InterviewQuestions;

public class FindNumberInRotatedSortedArray {

  public int findPivot(int arr[], int low, int high, int key) {

    int mid = (low+high)/2;

    if(mid > low && arr[mid]<arr[mid-1]) {
      return mid-1;
    }
    if(mid < high && arr[mid] > arr[mid+1]) {
      return mid;
    }

    if(arr[low] > arr[mid]) {
      return findPivot(arr, low, mid-1, key);
    }



  return 4;
  }

  public static void main(String args[]) {
    int arr[] = {3, 4, 5, 6, 1, 2};


  }

}
