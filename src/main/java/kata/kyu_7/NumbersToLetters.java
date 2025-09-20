package kata.kyu_7;

import java.util.stream.Stream;

public class NumbersToLetters {
    public static void main(String[] args) {
        System.out.println(switcher(new String[]{"24", "12", "23", "22", "4", "26", "9", "8"}));
    }

    public static String switcher(String[] arr){
        String alphabet = "zyxwvutsrqponmlkjihgfedcba!? ";

        StringBuilder result = new StringBuilder();
        Stream.of(arr).forEach(num -> result.append(alphabet.charAt(Integer.parseInt(num) - 1)));
        return result.toString();
    }
}
