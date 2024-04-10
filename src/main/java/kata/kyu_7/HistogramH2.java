package kata.kyu_7;

import java.util.Arrays;

public class HistogramH2 {

    public static void main(String[] args) {
        System.out.println(histogram(new int[]{7, 3, 70, 15, 0, 5}));
    }

    public static String histogram(int results[]) {
        int total = Arrays.stream(results).sum();
        String result = "";
        for (int i = 5; i >= 0; i--) {
            int percentage = (int) Math.floor(results[i] * 100. / total);
            result += results[i] > 0 ?
                    i + 1 + "|" + "█".repeat(percentage / 2) + " " + percentage + "%\n" : i + 1 + "|" + "\n";
        }
        return result;
    }
}
