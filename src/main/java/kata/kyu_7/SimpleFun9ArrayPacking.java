package kata.kyu_7;

public class SimpleFun9ArrayPacking {

  public static void main(String[] args) {

  }

  public static long arrayPacking(int[] arr) {
    long result = 0;

    for (int i = 0; i < arr.length; i++) {
      result += arr[i] * Math.pow(2, i * 8);
    }
    return result;
  }
}
