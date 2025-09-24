package kata.kyu_7;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class HowManyStreets {

  public static void main(String[] args) {
    String[] streets1 = {"first", "second", "third", "fourth", "fifth", "sixth", "seven"};
    String[][] drivers1 = {{"first", "second"}, {"second", "seven"}, {"sixth", "fourth"}};
    System.out.println(Arrays.toString(countStreets(streets1, drivers1)));
  }

  public static int[] countStreets(String[] streets, String[][] drivers) {
    Map <String, Integer> indexes = new HashMap<>();
    for (int i = 0; i < streets.length; i++) {
      indexes.put(streets[i], i);
    }
    int[] result = new int[drivers.length];
    for (int i = 0; i < drivers.length; i++) {
      result[i] = Math.abs(indexes.get(drivers[i][0]) - indexes.get(drivers[i][1])) - 1;
    }
    return result;
  }
}
