package kata.kyu_7;

import java.util.Arrays;

public class HelpTheFruitGuy {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(removeRotten(
                new String[]{"rottenApple", "rottenBanana", "rottenApple", "rottenPineapple", "rottenKiwi"})));
    }

    public static String[] removeRotten(String[] fruitBasket) {
        if (fruitBasket == null || fruitBasket.length == 0) {
            return new String[0];
        }
      return Arrays.stream(fruitBasket).map(x -> x.replaceAll("rotten", "").toLowerCase()).toArray(String[]::new);
    }
}
