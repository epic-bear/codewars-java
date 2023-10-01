package kata.kyu_7;

import java.util.Arrays;
import java.util.stream.Collectors;

public class PasswordMaker {

    public static void main(String[] args) {
        System.out.println(makePassword(""));
    }

    public static String makePassword(String phrase) {
        return Arrays.stream(phrase.replaceAll("[Ii]", "1")
                        .replaceAll("[Oo]", "0")
                        .replaceAll("[Ss]", "5").split(" "))
                .filter(x -> !x.isEmpty())
                .map(x -> x.substring(0, 1)).collect(Collectors.joining());
    }
}
