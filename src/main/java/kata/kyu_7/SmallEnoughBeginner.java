package kata.kyu_7;

import java.util.Arrays;

public class SmallEnoughBeginner {

    public static void main(String[] args) {
        System.out.println(smallEnough(new int[] { 66, 101 }, 200));
    }
    public static boolean smallEnough(int[] a, int limit)
    {
        return  Arrays.stream(a).max().orElse(0) <= limit;
    }
}
