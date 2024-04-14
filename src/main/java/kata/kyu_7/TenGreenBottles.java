package kata.kyu_7;

import java.util.Map;

public class TenGreenBottles {

    public static void main(String[] args) {
        System.out.println(tenGreenBottles(3));
    }

    public static String tenGreenBottles(int n) {
        Map<Integer, String> numbers = Map.of(1, "One", 2, "Two", 3, "Three", 4, "Four",
                5, "Five", 6, "Six", 7, "Seven", 8, "Eight", 9, "Nine", 10, "Ten");
        String result = "";

        while (n > 0) {
            result += String.format("%s green bottle%s hanging on the wall,\n", numbers.get(n), n > 1 ? "s" : "").repeat(2);
            --n;
            result += n >= 1 ? String.format("And if one green bottle should accidentally fall,\n" +
                    "There'll be %s green bottle%s hanging on the wall.\n", numbers.get(n).toLowerCase(), n > 1 ? "s" : "") :
                    "If that one green bottle should accidentally fall,\n" +
                            "There'll be no green bottles hanging on the wall.\n";
            result += n > 0 ? "\n" : "";
        }
        return result;
    }
}
