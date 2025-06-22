package kata.kyu_7;

import java.util.stream.Stream;

public class BrokenSequence {
    public static void main(String[] args) {
        System.out.println(findMissingNumber("8 1 2 3 5"));
    }

    public static int findMissingNumber(String sequence) {
        if (!sequence.isEmpty()) {
            if (!sequence.replaceAll("[^\\d\\s]", "").equals(sequence)) {
                return 1;
            }

            int[] digs = Stream.of(sequence.split(" ")).mapToInt(Integer::parseInt).sorted().toArray();

            for (int i = 0; i < digs.length; i++) {
                if (digs[i] > i + 1) {
                    return i + 1;
                }
            }
        }
        return 0;
    }
}
