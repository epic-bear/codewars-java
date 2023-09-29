package kata.kyu_7;

public class SimpleStringReversal {

    public static void main(String[] args) {
        System.out.println(solve("edo cruo"));
    }

    public static String solve(String s) {
        StringBuilder result = new StringBuilder(new StringBuilder(s).reverse().toString().replaceAll(" ", ""));
        for (int i = 0; i < s.length(); i++) {
            if (Character.isSpaceChar(s.charAt(i))) {
                result.insert(i, " ");
            }
        }
        return result.toString();
    }
}
