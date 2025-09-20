package kata.kyu_7;

import java.util.Arrays;
import java.util.stream.Collectors;

public class TheOffice3BrokenPhotocopier {

    public static void main(String[] args) {
        System.out.println(broken("01111111010010000001100110111"));
    }

    public static String broken(final String x) {
        return Arrays.stream(x.split("")).map(i -> i = i.equals("0") ? "1" : "0").collect(Collectors.joining(""));
    }
}
