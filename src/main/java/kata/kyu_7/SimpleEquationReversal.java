package kata.kyu_7;

public class SimpleEquationReversal {

    public static void main(String[] args) {
        System.out.println(solve("100*b/y"));
    }

    public static String solve(String eq) {
        String[] chars = eq.replaceAll("[^\\*\\+\\-/]", "").split("");
        String[] values = eq.split("[\\*\\+\\-/]");
        StringBuilder result = new StringBuilder(values[values.length - 1]);
        for (int i = chars.length - 1; i >= 0; i--) {
            result.append(chars[i]).append(values[i]);
        }
        return result.toString();
    }
}
