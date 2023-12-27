package kata.kyu_7;

import java.util.Arrays;

public class DisagreeableAscii {

    public static void main(String[] args) {
        System.out.println(getWeight("Joe"));
    }

    public static int getWeight(String name) {
        return Arrays.stream(name.split("")).filter(x -> Character.isLetter(x.charAt(0)))
                .mapToInt(x -> Character.isUpperCase(x.charAt(0)) ? x.toLowerCase().charAt(0) : x.toUpperCase()
                        .charAt(0)).sum();
    }
}
