package kata.kyu_7;

public class PalindromeChainLength {

    public static void main(String[] args) {
        System.out.println(palindromeChainLength(2897));
    }

    public static int palindromeChainLength (long n) {
        int steps = 0;
        boolean palindromeFound = false;
        while (!palindromeFound) {
            long reversedN = Long.parseLong(new StringBuilder(String.valueOf(n)).reverse().toString());
            if (n == reversedN) {
                palindromeFound = true;
            } else {
                steps++;
                n += reversedN;
            }
        }
        return steps;
    }
}
