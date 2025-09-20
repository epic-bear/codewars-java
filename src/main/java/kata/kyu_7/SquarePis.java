package kata.kyu_7;

import java.util.Arrays;

public class SquarePis {

    public static void main(String[] args) {
        System.out.println(calculate(0));
    }

    public static int calculate(int digits) {
        String pi = "31415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679";

        return digits > 0 ? (int) Math.ceil(Math.sqrt(
                Arrays.stream(pi.substring(0, digits).split("")).mapToInt(x -> (int) Math.pow(Integer.parseInt(x), 2))
                        .sum())) : 0;
    }
}
