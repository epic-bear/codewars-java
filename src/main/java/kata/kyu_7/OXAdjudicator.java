package kata.kyu_7;

import java.util.List;

public class OXAdjudicator {
    public static void main(String[] args) {
        System.out.println(judge(List.of(0, 1, 4, 8, 3, 6, 5)));
    }

    private static final int[][] WINNING_COMBINATIONS = {
            {0, 1, 2},
            {3, 4, 5},
            {6, 7, 8},
            {0, 3, 6},
            {1, 4, 7},
            {2, 5, 8},
            {0, 4, 8},
            {2, 4, 6}
    };

    public static String judge(List<Integer> history) {
        boolean[] x = new boolean[9];
        boolean[] o = new boolean[9];

        for (int i = 0; i < history.size(); i++) {
            int move = history.get(i);
            if ((i & 1) == 0) {
                x[move] = true;
            } else {
                o[move] = true;
            }
        }

        for (int[] c : WINNING_COMBINATIONS) {
            if (x[c[0]] && x[c[1]] && x[c[2]]) {
                return "X_WIN";
            }
            if (o[c[0]] && o[c[1]] && o[c[2]]) {
                return "O_WIN";
            }
        }

        return "NO_WINNER";
    }
}
