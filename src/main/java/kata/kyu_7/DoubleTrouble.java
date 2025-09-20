package kata.kyu_7;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DoubleTrouble {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(trouble(new int[]{4, 1, 1, 1, 4}, 2)));
    }

    public static int[] trouble(int[] x, int t) {
        if (x.length <= 1) {
            return x;
        }
        List<Integer> numbers = Arrays.stream(x).boxed().collect(Collectors.toList());
        int limit = numbers.size();

        for (int i = 0; i < limit;) {
            if (numbers.get(i) + numbers.get(i + 1) == t) {
                numbers.remove(i + 1);
                limit--;

            } else {
                i++;
            }
            if (i == limit - 1) {
                break;
            }
        }
        return numbers.stream().mapToInt(i -> i).toArray();
    }
}
