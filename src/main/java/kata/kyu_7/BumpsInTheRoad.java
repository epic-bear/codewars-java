package kata.kyu_7;

import java.util.Arrays;

public class BumpsInTheRoad {

    public static void main(String[] args) {
        System.out.println(bumps("__nn_nnnn__n_n___n____nn__nnnnn"));
    }

    public static String bumps(final String road) {
        long bumps = Arrays.stream(road.split("")).filter(x -> x.equals("n")).count();
        return bumps > 15 ? "Car Dead" : "Woohoo!";
    }
}
