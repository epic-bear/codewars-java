package kata.kyu_7;

public class FromAToZ {

    public static void main(String[] args) {
        System.out.println(gimmeTheLetters("a-z"));
    }

    public static String gimmeTheLetters(String s) {
        String response = "";
        for (int i = s.charAt(0); i <= s.charAt(2); i++) {
            response += (char) i;
        }
        return response;
    }
}
