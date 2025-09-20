package kata.kyu_7;

public class DeltaBits {

    public static void main(String[] args) {
        System.out.println(convertBits(31, 14));
    }

    public static int convertBits(int a, int b) {
        return Integer.bitCount(a ^ b);
    }
}
