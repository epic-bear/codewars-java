package kata.kyu_7;

import java.util.Arrays;

public class SumArrayWithDifferentBases {

    public static void main(String[] args) {
        System.out.println(sumItUp(new BasedNumbers[]{new BasedNumbers("101", 2), new BasedNumbers("10", 8)}));
    }

    public static long sumItUp(BasedNumbers[] numbersWithBases) {
        return Arrays.stream(numbersWithBases).mapToInt(x -> Integer.parseInt(x.number, x.base)).sum();
    }

    public static class BasedNumbers {

        String number;
        int base;

        public BasedNumbers(String number, int base) {
            this.number = number;
            this.base = base;
        }
    }
}
