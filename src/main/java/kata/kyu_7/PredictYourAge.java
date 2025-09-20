package kata.kyu_7;

import java.util.Arrays;

public class PredictYourAge {

    public static void main(String[] args) {
        System.out.println(predictAge(65, 60, 75, 55, 60, 63, 64, 45));
    }

    public static int predictAge(int ... ages) {
        return (int) Math.floor(Math.sqrt(
                Arrays.stream(ages).map(x -> x * x).sum()) / 2);
    }
}
