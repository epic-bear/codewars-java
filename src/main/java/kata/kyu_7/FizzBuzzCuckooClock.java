package kata.kyu_7;

import java.util.Arrays;

public class FizzBuzzCuckooClock {

    public static void main(String[] args) {
        System.out.println(fizzBuzzCuckooClock("21:00"));
    }

    public static String fizzBuzzCuckooClock(String time) {
        int[] t = Arrays.stream(time.split(":")).mapToInt(Integer::parseInt).toArray();
        int h = t[0];
        int m = t[1];

        return m == 0 ? "Cuckoo ".repeat((h +11)%12 + 1).trim():
        m == 30 ? "Cuckoo":
                m % 15 == 0 ? "Fizz Buzz":
                        m % 3 == 0 ? "Fizz":
                                m % 5 == 0 ? "Buzz":"tick";
    }
}
