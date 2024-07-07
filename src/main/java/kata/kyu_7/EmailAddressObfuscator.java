package kata.kyu_7;

public class EmailAddressObfuscator {

    public static void main(String[] args) {
        System.out.println(obfuscate("test@123.com"));
    }

    public static String obfuscate(String email) {
        return email.replaceAll("@", " [at] ").replaceAll("\\.", " [dot] ");
    }
}
