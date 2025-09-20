package kata.kyu_7;

import java.util.Arrays;

public class CatYearsDogYears2 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(ownedCatAndDog(15, 15)));
    }

    public static int[] ownedCatAndDog(final int catYears, final int dogYears) {
        int[] result = new int[]{0, 0};

        result[0] = catYears < 15 ? 0 : catYears < 24 ? 1 : catYears < 28 ? 2 : 2 + (catYears - 24) / 4;
        result[1] = dogYears < 15 ? 0 : dogYears < 24 ? 1 : dogYears < 29 ? 2 : 2 + (dogYears - 24) / 5;

        return result;
    }
}
