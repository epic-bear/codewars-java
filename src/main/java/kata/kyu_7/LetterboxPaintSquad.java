package kata.kyu_7;

import java.util.Arrays;

public class LetterboxPaintSquad {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(paintLetterboxes(125, 132)));
    }

    public static int[] paintLetterboxes(final int start, final int end) {
        int[] frequencies = new int[10];
        for (int i = start; i <= end; i++){
            int num = i;
            while (num > 0){
                frequencies[num%10]++;
                num /= 10;
            }
        }
        return frequencies;
    }
}
