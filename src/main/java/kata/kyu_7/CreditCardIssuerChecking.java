package kata.kyu_7;
import static java.util.regex.Pattern.matches;

public class CreditCardIssuerChecking {

    public static void main(String[] args) {
        System.out.println(getIssuer("4111111111111111"));
    }

    public static String getIssuer(String cardNumber) {
        if (matches("^3[4|7].{13}$", cardNumber)) return "AMEX";
        if (matches("^6011.{12}$", cardNumber)) return "Discover";
        if (matches("^5[1-5].{14}$", cardNumber)) return "Mastercard";
        if (matches("^4.{12}(...)?$", cardNumber)) return "VISA";
        return "Unknown";
    }
}
