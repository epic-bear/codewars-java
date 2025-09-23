package kata.kyu_7;

import java.util.Arrays;
import java.util.Comparator;

public class SortByLastChar {

  public static void main(String[] args) {
    System.out.println(Arrays.toString(last("man i need a taxi up to ubud")));
  }

  public static String[] last(String x){
    return Arrays.stream(x.split(" "))
        .sorted(Comparator.comparing(a -> a.charAt(a.length() - 1)))
        .toArray(String[]::new);
  }
}
