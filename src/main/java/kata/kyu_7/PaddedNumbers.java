package kata.kyu_7;

public class PaddedNumbers {
    public static void main(String[] args) {
        System.out.println(solution(55555));
    }

    public static String solution(int value) {
        return String.format("Value is %05d", value);
    }
}
