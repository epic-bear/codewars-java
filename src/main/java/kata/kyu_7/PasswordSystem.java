package kata.kyu_7;

import java.util.Arrays;
import java.util.stream.Collectors;

public class PasswordSystem {

    public static void main(String[] args) {
        System.out.println(helpZoom(new int[]{1,1,0,1,0,0,0,1,1,0,0,0,1,0,1,1}));
    }

    public static String helpZoom(final int[] key) {
        String password = Arrays.stream(key).mapToObj(String::valueOf).collect(Collectors.joining(""));
        return password.equals(new StringBuilder(password).reverse().toString()) ? "Yes" : "No";
    }
}
