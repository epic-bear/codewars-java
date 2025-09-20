package kata.kyu_8;

public class CountingCharacters {

    public static void main(String[] args) {
        System.out.println(countCharOccurrences("missippi", 'i'));
    }

    static int countCharOccurrences(String s, char c) {
        return s.length() - s.replaceAll(String.valueOf(c), "").length();
    }
}
