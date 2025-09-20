package kata.kyu_7;

public class WithoutTheLetterE {

    public static void main(String[] args) {
        System.out.println(findE("actual"));
    }

    public static String findE(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        } else {
            return str.toLowerCase().contains("e") ? String.valueOf(
                    str.toLowerCase().replaceAll("[^e]", "").length()) : "There is no \"e\".";
        }
    }
}
