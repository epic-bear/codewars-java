package kata.kyu_7;

public class BitsBattle {

    public static void main(String[] args) {
        System.out.println(bitsBattle(new int[]{}));
    }

    static String bitsBattle(int[] numbers) {
        int oddCount = 0;
        int evenCount = 0;

        for (int number : numbers) {
            if (number == 0) {
            } else if (number % 2 != 0) {
                oddCount += Integer.toBinaryString(number).replaceAll("0", "").length();
            } else {
                evenCount += Integer.toBinaryString(number).replaceAll("1", "").length();
            }
        }
        return oddCount > evenCount ? "odds win" : oddCount == evenCount ? "tie" : "evens win";
    }
}
