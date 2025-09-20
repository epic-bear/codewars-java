package kata.kyu_7;

import java.util.Arrays;

public class DigitalCypher {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(encode("scout", 1939)));
    }

    public static int[] encode(String message, int key) {
        int[] result = new int[message.length()];
        String keyString = String.valueOf(key);
        for (int i = 0; i < message.length(); i++) {
            result[i] = message.charAt(i) + keyString.charAt(i % keyString.length()) - 144;
        }
        return result;
    }
}
