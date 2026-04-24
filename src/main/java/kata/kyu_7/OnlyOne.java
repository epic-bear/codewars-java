package kata.kyu_7;

import java.util.Arrays;

public class OnlyOne {
    public static void main(String[] args) {
        System.out.println(onlyOne(true, false, false));
    }

    public static boolean onlyOne(Boolean... args) {
        return Arrays.stream(args).filter(x -> x).count() == 1;
    }
}
