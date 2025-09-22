package kata.kyu_7;

public class LoopDetector {

  public static void main(String[] args) {
    System.out.println(hasLoop(new int[]{12}));
  }

  public static boolean hasLoop(int[] arr) {
    if (arr.length == 0 || arr[0] >= arr.length) {
      return false;
    }
    int count = 0;
    int currentPoint = arr[0];
    while (count <= arr.length && arr[currentPoint] < arr.length) {
      currentPoint = arr[currentPoint];
      count++;
    }
    return count >= arr.length;
  }
}
