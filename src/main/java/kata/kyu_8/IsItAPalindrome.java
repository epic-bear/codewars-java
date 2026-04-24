package kata.kyu_8;

public class IsItAPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("Abba"));
    }

    public static Boolean isPalindrome(String x) {
        x = x.toLowerCase();
        for (int i = 0; i < x.length(); i++) {
            if (x.charAt(i) != x.charAt(x.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
