package kata.kyu_7;

import java.util.stream.IntStream;

public class OrthogonalVectors {
    public static void main(String[] args) {
        System.out.println(isOrthogonal(new int[]{1, 2}, new int[]{2, -1}));
    }

    public static boolean isOrthogonal(int[] u, int[] v){
        return IntStream.range(0, u.length).map(i -> u[i] * v[i]).sum() == 0;
    }
}
