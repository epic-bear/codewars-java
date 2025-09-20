package kata.kyu_7;

import java.util.Arrays;

public class Digitize {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(digitize(123)));
    }

    public static int[] digitize(int n){
        return Arrays.stream(String.valueOf(n).split("")).mapToInt(Integer::parseInt).toArray();
    }
}
