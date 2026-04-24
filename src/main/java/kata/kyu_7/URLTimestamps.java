package kata.kyu_7;

import java.util.Arrays;

public class URLTimestamps {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(split("a.b.")));
    }

    public static String[] split(String joint) {
        return joint.isEmpty() ? new String[0] : joint.split("\\.", -1);
    }
}
