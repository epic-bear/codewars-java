package kata.kyu_7;

public class ReverseANumber {

    public static void main(String[] args) {
        System.out.println(reverse(-1000));
    }

    public static int reverse(int number) {
        String result = new StringBuilder(String.valueOf(number)).reverse().toString();
        return Integer.parseInt(number < 0 ? "-" + result.substring(0, result.length() - 1) : result);
    }
}
