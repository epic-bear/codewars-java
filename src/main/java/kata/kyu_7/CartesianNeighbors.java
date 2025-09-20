package kata.kyu_7;

import java.util.Arrays;

public class CartesianNeighbors {

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(cartesianNeighbor(2, 2)));
    }

    public static int[][] cartesianNeighbor(int x, int y) {
        return new int[][]{{x - 1, y}, {x, y - 1}, {x - 1, y - 1}, {x + 1, y + 1}, {x + 1, y}, {x, y + 1},
                {x - 1, y + 1}, {x + 1, y - 1}};
    }
}
