package kata.kyu_7;

import java.util.Comparator;
import java.util.stream.IntStream;

public class StrangeMathematics {

    public static void main(String[] args) {
        System.out.println(mathematics(11, 2));
    }

    public static int mathematics(int n, int k){
        return IntStream.rangeClosed(0, n)
                .mapToObj(String::valueOf)
                .sorted(Comparator.naturalOrder())
                .mapToInt(Integer::valueOf)
                .boxed()
                .toList()
                .indexOf(k);
    }
}
