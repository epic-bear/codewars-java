package kata.kyu_7;

import java.util.LinkedList;
import java.util.Objects;
import java.util.stream.Collectors;


public class RotateForAMax {

  public static void main(String[] args) {
    System.out.println(maxRot(38458215));
  }

  public static long maxRot(long n) {
    LinkedList<Character> numbers = new LinkedList<>();
    char[] chars = String.valueOf(n).toCharArray();

    for (char c : chars) {
      numbers.add(c);
    }

    long maxResult = n;

    for (int i = 0; i < numbers.size(); i++) {
      numbers.addLast(numbers.get(i));
      numbers.remove(i);
      long result = Long
          .parseLong(numbers.stream().map(Objects::toString).collect(Collectors.joining()));
      if (result > maxResult) {
        maxResult = result;
      }
    }
    return maxResult;
  }
}
