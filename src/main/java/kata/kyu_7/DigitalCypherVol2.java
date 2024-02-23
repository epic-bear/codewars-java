package kata.kyu_7;

public class DigitalCypherVol2 {

    public static void main(String[] args) {
        System.out.println(decode(new int[]{20, 12, 18, 30, 21}, 1939));
    }

    public static String decode(int[] code, int key) {
        String result = "";
        String keyString = String.valueOf(key);
        int keyCounter = 0;

        for (int i = 0; i < code.length; i++) {
            code[i] -=  keyString.charAt(keyCounter) - '0';
            keyCounter = ++keyCounter == keyString.length() ? 0 : keyCounter;
            result += (char) (96 + code[i]);
        }
        return result;
    }
}
