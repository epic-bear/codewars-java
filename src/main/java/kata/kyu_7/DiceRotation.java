package kata.kyu_7;

import java.util.Arrays;

public class DiceRotation {

    public static void main(String[] args) {
        System.out.println(rotations(new int[]{1, 1, 6}));
    }

    public static int rotations(int[] dieArray) {
        int[] results = new int[6];

        for (int j : dieArray) {
            switch (j) {
                case 1:
                    results[1]++;
                    results[2]++;
                    results[3]++;
                    results[4]++;
                    results[5] += 2;
                    break;
                case 2:
                    results[0]++;
                    results[2]++;
                    results[3]++;
                    results[4] += 2;
                    results[5]++;
                    break;
                case 3:
                    results[0]++;
                    results[1]++;
                    results[3] += 2;
                    results[4]++;
                    results[5]++;
                    break;
                case 4:
                    results[0]++;
                    results[1]++;
                    results[2] += 2;
                    results[4]++;
                    results[5]++;
                    break;
                case 5:
                    results[0]++;
                    results[1] += 2;
                    results[2]++;
                    results[3]++;
                    results[5]++;
                    break;
                default:
                    results[0] += 2;
                    results[1]++;
                    results[2]++;
                    results[3]++;
                    results[4]++;
                    break;
            }
        }

        return Arrays.stream(results).min().orElse(0);
    }
}
