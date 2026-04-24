package kata.kyu_7;

import java.util.Arrays;

public class MinimumPercentageOfVisitorsThatAteAllFoods {
    public static void main(String[] args) {
        System.out.println(minimumPercentage(new int[]{65, 80, 80, 90}));
    }

    public static int minimumPercentage(int[] foods) {
      return Math.max(100 - Arrays.stream(foods).map(x -> 100 - x).sum(), 0);
    }
}
