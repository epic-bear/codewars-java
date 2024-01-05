package kata.kyu_7;

import java.util.Arrays;

public class HelpSuzukiCompleteHisChores {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(choreAssignments(new int[]{5, 2, 1, 6, 4, 4})));
    }

    public static int[] choreAssignments(int[] chores) {
        int[] result = new int[chores.length / 2];
        Arrays.sort(chores);
        for (int i = 0; i < result.length; i++) {
            result[i] = chores[i] + chores[chores.length - 1 - i];
        }
        Arrays.sort(result);
        return result;
    }
}
