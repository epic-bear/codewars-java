package kata.kyu_7;

import java.util.Arrays;

public class KidsPunkyBrewsterSocks {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(getSocks("Punky", new String[]{"pink", "argyle", "argyle"})));
    }

    public static String[] getSocks(String name, String[] socks) {
        String[] result;
        if (name.equals("Punky")) {
            result = Arrays.stream(socks).distinct().limit(2).toArray(String[]::new);
        } else {
            result = Arrays.stream(socks).filter(color -> Arrays.stream(socks).filter(x -> x.equals(color))
                    .count() >= 2).sorted().limit(2).toArray(String[]::new);
        }
        return result.length != 2 ? new String[0] : result;
    }
}
