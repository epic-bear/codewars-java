package kata.kyu_7;

import java.util.Arrays;
import java.util.stream.Collectors;

public class SortTheGiftCode {

    public static void main(String[] args) {
        System.out.println(sortGiftCode("fedcba"));
    }

    public static String sortGiftCode(String code){
        return Arrays.stream(code.split("")).sorted().collect(Collectors.joining(""));
    }
}
