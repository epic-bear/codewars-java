package kata.kyu_7;

public class InspringStrings {

    public static void main(String[] args) {
        System.out.println(longestWord("a b c d e fgh"));
    }

    public static String longestWord(String wordString) {
        String max = "";
        String[] words = wordString.split(" ");

        for (int i = 0; i < words.length; i++) {
            if (words[i].length() >= max.length()) {
                max = words[i];
            }
        }

        return max;
    }
}
