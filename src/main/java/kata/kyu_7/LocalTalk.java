package kata.kyu_7;

public class LocalTalk {

    public static void main(String[] args) {
        System.out.println(pak("Man I need a taxi up to Ubud"));
    }

    public static String pak(final String s) {
        return String.join(" pak", s.split(" "));
    }
}
