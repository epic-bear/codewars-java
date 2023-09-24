package kata.kyu_7;

public class BinaryAddition {

    public static void main(String[] args) {
        System.out.println(binaryAddition(1, 1));
    }

    public static String binaryAddition(int a, int b) {
        return Long.toBinaryString(a + b);
    }
}
