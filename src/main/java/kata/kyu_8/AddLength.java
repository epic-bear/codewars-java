package kata.kyu_8;

import java.util.Arrays;

public class AddLength {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(addLength("apple ban")));
    }

    public static String[] addLength(String str) {
        return Arrays.stream(str.split(" ")).map(word -> word + " " + word.length()).toArray(String[]::new);
    }
}
