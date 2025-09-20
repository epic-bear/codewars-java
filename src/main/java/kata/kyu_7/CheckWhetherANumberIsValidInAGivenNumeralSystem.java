package kata.kyu_7;

import java.util.Arrays;
import java.util.List;

public class CheckWhetherANumberIsValidInAGivenNumeralSystem {

    public static void main(String[] args) {
        System.out.println(validateBase("61262S", 8));
    }

    public static boolean validateBase(String num, int base) {
        return num.chars().allMatch(c -> "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ".indexOf(c) < base);
    }
}
