package kata.kyu_7;

import java.util.Arrays;

public class ScrollingText {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(scrollingText("codewars")));
    }

    public static String[] scrollingText(String text) {
        String [] result = new String[text.length()];
        text = text.toUpperCase();
        for (int i = 0; i < text.length(); i++) {
            result[i] = text;
            text = text.substring(1) + text.charAt(0);
        }
        return result;
    }
}
