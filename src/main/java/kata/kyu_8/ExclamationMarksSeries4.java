package kata.kyu_8;

public class ExclamationMarksSeries4 {

    public static void main(String[] args) {
        System.out.println(remove("Hi! Hi!"));
    }

    static String remove(String s) {
        return s.replaceAll("!", "") + "!";
    }
}
