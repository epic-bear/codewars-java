package kata.kyu_7;

import java.util.stream.Stream;

public class SummingANumbersDigits {
    public static void main(String[] args) {

    }

    public static int sumDigits(int number){
        return Stream.of(String.valueOf(Math.abs(number)).split(""))
                .mapToInt(Integer::parseInt).sum();
    }
}
