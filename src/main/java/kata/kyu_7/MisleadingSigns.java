package kata.kyu_7;

public class MisleadingSigns {

    public static void main(String[] args) {
        System.out.println(gaslighting("snack", "snake", new char[]{'c'}));
    }

    public static boolean gaslighting(String shirtWord, String yourWord, char[] friendsLetters) {
        if (shirtWord.equals(yourWord)) {
            return false;
        }

        for (int i = 0; i < friendsLetters.length; i++) {
            if (shirtWord.indexOf(friendsLetters[i]) != yourWord.indexOf(friendsLetters[i])) {
                return true;
            }
        }

        return false;
    }
}
