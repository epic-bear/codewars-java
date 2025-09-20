package kata.kyu_7;

import java.util.Arrays;

public class ScoringTest {

    public static void main(String[] args) {
        System.out.println(sol(new int[]{0, 0, 0, 0, 2, 1, 0},2,0,1));
    }

    public static int sol(int[] arr, int r, int o, int w){
        return Arrays.stream(arr).map(x -> x == 0 ? r : x == 1 ? o : -w).sum();
    }
}
