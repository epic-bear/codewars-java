package kata.kyu_7;

public class RoundUpToTheNextMultipleOf5 {

    public static void main(String[] args) {
        System.out.println(roundToNext5(2));
    }

    public static int roundToNext5(int number) {
        while (number % 5 != 0) {
            ++number;
        }
        return number;
    }
}
