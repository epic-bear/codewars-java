package kata.kyu_7;

import java.util.Arrays;

public class SortDeckOfCards {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(
                sortCards(new String[]{"3", "9", "A", "5", "T", "8", "2", "4", "Q", "7", "J", "6", "K"})));
    }

    public static String[] sortCards(String[] cards) {
        String order = "A23456789TJQK";
        return Arrays.stream(cards)
                .mapToInt(x -> order.indexOf(x) + 1)
                .sorted()
                .mapToObj(x -> String.valueOf(order.charAt(x - 1)))
                .toArray(String[]::new);
    }
}
