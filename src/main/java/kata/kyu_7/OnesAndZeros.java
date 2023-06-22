package kata.kyu_7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class OnesAndZeros {

  public static void main(String[] args) {
    System.out.println(ConvertBinaryArrayToInt(new ArrayList<>(Arrays.asList(1, 1, 1, 1))));
  }

  public static int ConvertBinaryArrayToInt(List<Integer> binary) {
    return Integer.parseInt(binary.stream().map(String::valueOf).collect(Collectors.joining()), 2);
  }
}
