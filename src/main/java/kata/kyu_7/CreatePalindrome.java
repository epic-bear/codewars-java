package kata.kyu_7;

public class CreatePalindrome {

    public static void main(String[] args) {
        System.out.println(solve("abba"));
    }

    public static boolean solve(String st) {
        for (int i = 0; i < st.length() / 2; i++) {
            int dif = Math.abs(st.charAt(i) - st.charAt(st.length() - 1 - i));
            if (dif != 2 && dif != 0) {
                return false;
            }
        }
        return true;
    }
}
