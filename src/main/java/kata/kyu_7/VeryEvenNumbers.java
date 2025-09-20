package kata.kyu_7;

import java.util.Arrays;

public class VeryEvenNumbers {

    public static void main(String[] args) {
        System.out.println(isVeryEvenNumber(0));
    }

    public static boolean isVeryEvenNumber(int number) {
        while (number >= 10) {
            number = Arrays.stream(String.valueOf(number).split("")).mapToInt(Integer::parseInt).sum();
        }
        return number % 2 == 0;
    }
}
