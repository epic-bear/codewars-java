package kata.kyu_7;

public class MaxSumBetweenTwoNegatives {

  public static void main(String[] args) {
    System.out.println(maxSum(new int[]{5, -1, -2}));
  }

  public static int maxSum(int[] arr) {
    int maxSum = -1;
    int sum = 0;
    boolean isCountStarted = false;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] < 0 && isCountStarted) {
        maxSum = Math.max(sum, maxSum);
        sum = 0;
      }
      if (arr[i] < 0 && !isCountStarted) {
        isCountStarted = true;
      }
      if (isCountStarted && arr[i] > 0) {
        sum += arr[i];
      }
    }
    return maxSum;
  }
}
