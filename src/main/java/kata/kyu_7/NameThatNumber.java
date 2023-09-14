package kata.kyu_7;

import java.util.HashMap;
import java.util.Map;

public class NameThatNumber {

  public static void main(String[] args) {
    System.out.println(nameThatNumber(6));
  }

  public static String nameThatNumber(int x) {
    if (x == 0) {
      return "zero";
    }
    Map<Integer, String> integersNames = new HashMap<>();
    integersNames.put(1, "one");
    integersNames.put(2, "two");
    integersNames.put(3, "three");
    integersNames.put(4, "four");
    integersNames.put(5, "five");
    integersNames.put(6, "six");
    integersNames.put(7, "seven");
    integersNames.put(8, "eight");
    integersNames.put(9, "nine");
    integersNames.put(10, "ten");
    integersNames.put(11, "eleven");
    integersNames.put(12, "twelve");
    integersNames.put(13, "thirteen");
    integersNames.put(14, "fourteen");
    integersNames.put(15, "fifteen");
    integersNames.put(16, "sixteen");
    integersNames.put(17, "seventeen");
    integersNames.put(18, "eighteen");
    integersNames.put(19, "nineteen");

    Map<Integer, String> tens = Map.of(2, "twenty",
        3, "thirty",
        4, "forty",
        5, "fifty",
        6, "sixty",
        7, "seventy",
        8, "eighty",
        9, "ninety");

    if (x <= 19) {
      return integersNames.get(x);
    } else {
      return x % 10 == 0 ? tens.get(x / 10) : tens.get(x / 10) + " " + integersNames.get(x % 10);
    }
  }
}
