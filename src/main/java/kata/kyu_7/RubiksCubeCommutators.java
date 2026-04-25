package kata.kyu_7;


public class RubiksCubeCommutators {
    public static void main(String[] args) {
        System.out.println(createCommutator("R", "U"));
    }

    public static String createCommutator(String a, String b) {
        return a + " " + b + " " + reverse(a) + " " + reverse(b);
    }

    private static String reverse(String s) {
        String[] sub = s.split(" ");
        StringBuilder result = new StringBuilder();
        for (int i = sub.length - 1; i >= 0; i--) {
            if (sub[i].contains("'")) {
                sub[i] = sub[i].replace("'", "");
            } else if (sub[i].length() == 1) {
                sub[i] = sub[i] + "'";
            }
            result.append(sub[i]).append(" ");
        }
        return result.toString().trim();
    }
}
