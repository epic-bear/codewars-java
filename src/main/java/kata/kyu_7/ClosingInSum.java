package kata.kyu_7;

public class ClosingInSum {

    public static void main(String[] args) {
        System.out.println(closingInSum(121L));
    }

    public static int closingInSum(long n) {
        String[] digits = String.valueOf(n).split("");
        int result = 0;
        for (int i = 0; i < (digits.length % 2 == 0 ? digits.length / 2 : digits.length / 2 + 1); i++) {
            int add = Integer.parseInt(digits[i] + (digits.length - 1 - i > i ? digits[digits.length - 1 - i] : ""));
            result += add;
        }
        return result;
    }
}
