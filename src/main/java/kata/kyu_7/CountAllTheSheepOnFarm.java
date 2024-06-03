package kata.kyu_7;

import org.apache.commons.lang3.ArrayUtils;

import java.util.Arrays;

public class CountAllTheSheepOnFarm {

    public static void main(String[] args) {
        System.out.println(lostSheep(null, new int[] {3,4}, 15));
    }

    public static int lostSheep(int[] fridayNightCounting, int[] saturdayNightCounting, int sheepTotal) {
        return Math.abs(Arrays.stream(ArrayUtils.addAll(fridayNightCounting, saturdayNightCounting)).sum() - sheepTotal);
    }
}
