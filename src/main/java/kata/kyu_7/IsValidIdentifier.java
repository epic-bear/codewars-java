package kata.kyu_7;

public class IsValidIdentifier {

    public static void main(String[] args) {
        System.out.println(isValid("___"));
    }

    public static boolean isValid(String idn) {
        return idn.matches("[$_a-zA-Z]+[$\\w]*");
    }
}
