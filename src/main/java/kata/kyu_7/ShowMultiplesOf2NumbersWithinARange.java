package kata.kyu_7;

import java.util.ArrayList;
import java.util.List;

public class ShowMultiplesOf2NumbersWithinARange {

    public static void main(String[] args) {
        System.out.println(findMultiples(2, 4, 40));
    }

    public static List<Integer> findMultiples(int s1, int s2, int s3) {
        List<Integer> arr = new ArrayList<>();
        for (int i = s1; i < s3; i++) {
            if (i % s1 == 0 && i % s2 == 0) {
                arr.add(i);
            }
        }
        return arr;
    }
}
