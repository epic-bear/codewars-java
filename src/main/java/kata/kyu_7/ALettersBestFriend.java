package kata.kyu_7;

import java.util.regex.Pattern;

public class ALettersBestFriend {

    public static void main(String[] args) {
        System.out.println(bestFriend("i found an ounce with my hound", 'o', 'u'));
    }

    public static boolean bestFriend(String txt, char a, char b) {
        return Pattern.compile(a + "(?!" + b + ")").matcher(txt).results().findAny().isEmpty();
    }
}
