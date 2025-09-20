package kata.kyu_7;

public class CommonSubstrings {

    public static void main(String[] args) {
        System.out.println(SubstringTest("Something", "Home"));
    }

    public static boolean SubstringTest(String str1, String str2) {
        for (int i = 0; i < str1.length() - 1; i++) {
            if (str2.toLowerCase().contains(str1.toLowerCase().substring(i, i + 2))) {
                return true;
            }
        }
        return false;
    }
}
