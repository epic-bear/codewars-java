package kata.kyu_7;

import java.util.stream.Stream;

public class BasicMath {
    public static void main(String[] args) {
        System.out.println(calculate("1plus2plus3plus4" ));
    }

    public static String calculate(String str) {
      return Stream.of(str.replace("minus", "plus-").split("plus")).mapToInt(Integer::parseInt).sum() + "";
    }
}
