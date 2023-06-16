package kata.kyu_7;

public class SumOfASequence {

  public static void main(String[] args) {
    System.out.println(sequenceSum(2,  6, 2));
  }

  public static int sequenceSum(int begin, int end, int step) {
    int result = 0;
    while (begin <= end) {
      result += begin;
      begin += step;
    }
    return result;
  }
}
