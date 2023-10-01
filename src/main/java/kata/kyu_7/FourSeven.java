package kata.kyu_7;

import java.util.Map;

public class FourSeven {

    public static void main(String[] args) {
        System.out.println(fourSeven(6));
    }

    public static int fourSeven(int n) {
        return Map.of(4, 7, 7, 4).getOrDefault(n, 0);
    }
}
