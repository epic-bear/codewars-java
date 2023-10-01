package kata.kyu_7;

public class StringMerge {

    public static void main(String[] args) {
        System.out.println(stringMerge("wonderful", "people", 'e'));
    }

    public static String stringMerge(String s1, String s2, char letter) {
        return s1.substring(0, s1.indexOf(letter)) + s2.substring(s2.indexOf(letter));
    }
}
