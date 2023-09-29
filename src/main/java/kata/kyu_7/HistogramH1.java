package kata.kyu_7;

public class HistogramH1 {

    public static void main(String[] args) {
        System.out.println(histogram(new int[]{7, 3, 10, 1, 0, 5}));
    }

    public static String histogram(final int results[]) {
        String result = "";
        for (int i = results.length - 1; i >= 0; i--) {
            result += i + 1 + "|";
            result += results[i] == 0 ? "\n" : "#".repeat(results[i]) + " " + results[i] + "\n";
        }
        return result;
    }
}
