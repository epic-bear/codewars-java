package kata.kyu_7;

import java.util.Arrays;

public class PredictYourAge {

    public static void main(String[] args) {
        System.out.println(predictAge(65, 60, 75, 55, 60, 63, 64, 45));
    }

    public static int predictAge(int age1, int age2, int age3, int age4, int age5, int age6, int age7, int age8) {
        return (int) Math.floor(Math.sqrt(
                Arrays.stream(new int[]{age1, age2, age3, age4, age5, age6, age7, age8}).map(x -> x * x).sum()) / 2);
    }
}
