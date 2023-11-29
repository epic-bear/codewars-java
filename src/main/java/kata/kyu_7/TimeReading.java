package kata.kyu_7;

import java.util.Arrays;

public class TimeReading {

    public static void main(String[] args) {
        System.out.println(timedReading(4,"The Fox asked the stork, 'How is the soup?'"));
    }

    public static int timedReading(final int maxLength, final String text) {
        if (text.replaceAll("[^a-zA-Z ]", "").length() == 0) {
            return 0;
        }
        return (int) Arrays.stream(text.replaceAll("[^a-zA-Z ]", "").split(" "))
                .filter(x -> x.length() <= maxLength).count();
    }
}
