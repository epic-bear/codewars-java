package kata.kyu_7;

import java.util.Arrays;

public class ShadesOfGrey {

  public static void main(String[] args) {
    System.out.println(Arrays.toString(shadesOfGrey(17)));

  }

  static String[] shadesOfGrey(int num) {
    if (num < 1) {
      return new String[0];
    }
    String chars = "0123456789abcdef";
    int counter1 = 0;
    int counter2 = 1;
    String[] result = new String[Math.min(num, 254)];
    for (int i = 0; i < num && i < 254; i++) {
      result[i] =
          "#" + chars.charAt(counter1) + chars.charAt(counter2) + chars.charAt(counter1) + chars
              .charAt(counter2) + chars.charAt(counter1) + chars.charAt(counter2);
      counter2++;
      if (counter2 == chars.length()) {
        counter1++;
      }
      if (counter2 == 16) {
        counter2 = 0;
      }
    }
    return result;
  }
}
