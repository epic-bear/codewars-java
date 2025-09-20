package kata.kyu_7;

public class RegexpBasicsIsItALetter {

    public static void main(String[] args) {
        System.out.println(isLetter("d"));
    }

    public static boolean isLetter(String s) {
        return s.matches("[a-zA-Z]");
    }
}
